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



  def index() = Action { implicit request =>
    Ok(views.html.home())
  }

  def search(key: String) = Action.async{ implicit request =>
    books.findByName(key).map { page =>
      Ok(views.html.search(page))
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
    * 个人首页
    * @return
    */
  def personIndex() = Action { implicit  request: Request[AnyContent] =>
    request.session.get("userAcct") match {
      case Some(p) => Ok(views.html.person.index())
      case None => Ok(views.html.login())
    }
  }

  /**
    * 个人订单管理
    * @return
    */
  def personOrder() = Action { implicit request: Request[AnyContent] =>
    //历史记录,购物车,审核中,已通过
      request.session.get("userAcct").map { user =>
        val history = admin.getHistoryFromDb(user)
        val cart = client.getCart(user)
        val check = admin.getDealList(user,1)
        val pass = admin.getDealList(user,2)
        val refuse = admin.getDealList(user,22)
        Ok(views.html.person.order(history,cart,check,pass,refuse))
    }.getOrElse {
        Redirect(routes.Applications.login())
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

  /**
    * 用户还书界面
    * @return
    */
  def personReturn() = Action { implicit request: Request[AnyContent] =>
      request.session.get("userAcct").map { user =>
        Ok(views.html.person.returnbook(admin.getDealList(user,2)))
      }.getOrElse {
        Ok(views.html.login())
      }
  }

  def personReturnBookReq(userid: String, bookid: Long) = checkClientLogin.async { implicit request: Request[AnyContent] =>
    val date  = utils.TimeHelper.getTimeNow()
    client.returnBookReq(userid,bookid,date).map{ _ =>
      Ok("申请成功!")
    }
  }


}
