package controllers


import javax.inject.Inject
import models._
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._
import views._

import play.api.libs.json._
import play.api.libs.functional.syntax._

import scala.concurrent.{ExecutionContext, Future}

/*
 *
 *created by yangmingsen on 2018/04
 */
class Applications @Inject() ( books: BookInfosRepository,
                               client: ClientsRepository,
                               admin: AdminRepository,
                               cc: MessagesControllerComponents)(implicit ec: ExecutionContext, parser: BodyParsers.Default) extends MessagesAbstractController(cc) {

  private val logger = play.api.Logger(this.getClass)

//如果需要返回 [Stu] 这个对象
//  implicit val stuWrites: Writes[Stu] = (
//    (JsPath \ "sstu").write[String] and
//    (JsPath \ "sname").write[String] and
//    (JsPath \ "ssex").write[String] and
//    (JsPath \ "sclass").write[Int] and
//    (JsPath \ "sphone").write[String] and
//    (JsPath \ "sqq").write[String] and
//    (JsPath \ "spasd").write[String]
//  )(unlift(Stu.unapply))

  implicit val borrowStatesWrites: Writes[BorrowStates] = (
    (JsPath \ "states").write[Int] and
    (JsPath \ "bookid").write[Option[Long]] and
    (JsPath \ "bookname").write[Option[String]]
    )(unlift(BorrowStates.unapply))



  def index() = Action.async { implicit request: Request[AnyContent] =>
    for{
      one <- books.getFit(1)
      two <- books.getFit(2)
      three <- books.getFit(3)
    } yield {
      Ok(views.html.home(one.take(12),two.take(12),three.take(12)))
    }

  }

  def indexN(who: Int, page: Int) = Action.async { implicit request: Request[AnyContent] =>
      for{
        data <- books.getFit(who)
      } yield {
        Ok(views.html.homeLocalFlush(data.takeRight(data.length-(page*12)),who,page+1))
      }
  }

  def search(key: String, page: Int) = Action.async{ implicit request =>
    books.findByName(key).map { pa =>
        var total = pa.length/12
      Ok(views.html.search(pa.takeRight((pa.length)-((page-1)*12)),page,total,key))
    }
  }

  def searchNew(key: String, page: Int) = Action.async{ implicit request =>
    books.findByName(key).map { pa =>
      var total = pa.length/12
      Ok(views.html.searchNew(pa.takeRight((pa.length)-((page-1)*12)),page,total,key))
    }
  }

  def login() = Action{ implicit request: Request[AnyContent] =>
    Ok(views.html.login())
  }

  def doLogin() = Action.async{ implicit request: Request[AnyContent] =>

   Form(tuple("acct" -> nonEmptyText,"pasd" -> nonEmptyText)).bindFromRequest().fold(
      error => Future.successful(Ok("绑定出错")),
      tup => {
      val(sstu,pasd) = tup
        client.getStu(sstu).map {
          case Some(ha) => {
            if( ha.spasd.equals(pasd) ) {
                Ok(Json.obj("states" -> "0")).withSession("userAcct" -> ha.sstu, "userName" -> ha.sname)
            } else {
              Ok(Json.obj("states" -> "1"))//1密码错误
            }
          }
          case None => Ok(Json.obj("states" -> "2"))//账号不存在
        }
     }
    )
  }

//  def register() = Action{ implicit request: Request[AnyContent] =>
//    Ok(views.html.regsiter())
//  }

//  def doRegisterEmail() = Action.async { implicit request: Request[AnyContent] =>
//    Form(tuple("email" -> nonEmptyText, "pasd" -> nonEmptyText, "rpasd" -> nonEmptyText, "realName" -> nonEmptyText)).bindFromRequest().fold(
//      error => Future.successful(Ok("绑定出错了")),
//      tup => {
//        val (email, pasd, rpasd, realName) = tup
//        if (!pasd.equals(rpasd)) {
//          Future.successful(Ok("两次密码不一至"))
//        } else {
//          client.insertUserFromEmail(email, pasd, realName).map {
//            case _ => Ok(views.html.login())
//          }
//        }
//      }
//    )
//  }

//  def checkRegisterEmail(acct: String) = Action.async { implicit request: Request[AnyContent] =>
//    val res = client.findOfEmail(acct).map {
//      case Some(h) => Ok("该用户已存在")
//      case None => Ok("该账户可以使用")
//    }
//    res
//  }

  def introdution(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      books.findById(id).map{
        case Some(b) => Ok(views.html.introdution(b))
        case _ => Ok("hell world")
      }

  }

  def addCart(id: Long, title: String) = Action { implicit request: Request[AnyContent] =>

    request.session.get("userAcct").map { user =>
      client.checkItemIsAdd(id,user) match {
        case Some(_) => {}
        case _ => client.addItemToDb(user,title,id,1)
      }

      Ok(views.html.shopcart(client.getCart(user)))

    }.getOrElse {
     Ok(views.html.login())
   }


  }

  def showCart() = Action { implicit request: Request[AnyContent] =>
    request.session.get("userAcct").map { user =>
      Ok(views.html.shopcart(client.getCart(user)))
    }.getOrElse {
      Ok(views.html.login())
    }

  }

  def delCart(userid: String, bookid: Long) = Action.async { implicit request: Request[AnyContent] =>
    client.deleteCartFromDb(userid,bookid)
    Future.successful(Ok("deleteSuccessful"))
  }

  def logOut() = Action.async { implicit request: Request[AnyContent] =>
    Future.successful(Ok(views.html.login()).withNewSession)
  }

  /**
    * 将欲借阅的书籍加入到申请列表
    * @return
    */
  def addToAdminDealList() = Action { implicit request: Request[AnyContent] =>
   request.session.get("userAcct").map { user =>
     var res = client.addDealBorrowList(user)
      Ok(Json.toJson(res))
    }.getOrElse {
      Ok(views.html.login())
    }
  }

  def subSuccessful() = Action.async { implicit request: Request[AnyContent] =>
    Future.successful(Ok(views.html.submitRequest()))
  }

  /**
    * 个人首页view
    * @return
    */
  def personIndex() = checkClientLogin.async { implicit  request: Request[AnyContent] =>
    Future.successful(Ok(views.html.person.index()))
  }


  /**
    * 获得借阅历史view
    * @return
    */
  def personBorrowHistory() = checkClientLogin.async { implicit  request: Request[AnyContent] =>

    var user = ""
    request.session.get("userAcct").map { ha =>
      user = ha
    }
    for{
      data <- admin.getHistoryFromDb(user)
    } yield {
      Ok(views.html.person.history(data))
    }
  }

  /**
    * 获得待借阅列表view
    * @return
    */
  def personBorrowList() = Action { implicit  request: Request[AnyContent] =>
    request.session.get("userAcct").map { usr =>
      Ok(views.html.person.borrowList(client.getCart(usr)))
    }.getOrElse {
      Ok(views.html.login())
    }

  }

  /**
    * 获得审核列表view
    * @return
    */
  def personChecking() = checkClientLogin.async { implicit  request: Request[AnyContent] =>
        var user = ""
        request.session.get("userAcct").map { ha =>
           user = ha
         }
       for {
         data <- admin.getDealList(user, 1)
         data2 <- admin.getDealList(user,3)
       } yield {
         Ok(views.html.person.checking(data,data2))
       }

  }

  /**
    * 获得审核通过view
    * @return
    */
  def personPassed() = checkClientLogin.async { implicit  request: Request[AnyContent] =>

    var user = ""
    request.session.get("userAcct").map { ha =>
      user = ha
    }
    for {
      data <- admin.getDealList(user, 2)
    } yield {
      Ok(views.html.person.passed(data))
    }
  }

  /**
    * 获得审核未通过view
    * @return
    */
  def personDisagree() = checkClientLogin.async { implicit  request: Request[AnyContent] =>
    var user = ""
    request.session.get("userAcct").map { ha =>
      user = ha
    }
    for {
      data <- admin.getDealList(user, 22)
    } yield {
      Ok(views.html.person.disagree(data))
    }
  }




  /**
    * 删除被拒绝的订单
    * @param userid
    * @param bookid
    * @return
    */
  def delRefuseReq(userid: String, bookid: Long) = Action.async { implicit request: Request[AnyContent] =>
    client.delDealListOfState(userid, bookid, 22).map { _ =>
      Ok("del refuseReq Successful!")
    }
  }

  /**
    * 继续申请被拒绝的订单
    * @param userid
    * @param bookid
    * @return
    */
  def continueReq(userid: String, bookid: Long) = Action.async { implicit request: Request[AnyContent] =>
    client.continueBorrowReq(userid, bookid).map { _ =>
      Ok("Successful")
    }

  }


  def personReturnBookReq(userid: String, bookid: Long) = checkClientLogin.async { implicit request: Request[AnyContent] =>
    val date  = utils.TimeHelper.getTimeNow()
    client.returnBookReq(userid,bookid,date).map{ _ =>
      Ok(Json.obj("states" -> "1"))
    }
  }




}
