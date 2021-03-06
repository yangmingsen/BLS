package controllers

import java.sql.Date

import javax.inject.Inject
import models._
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._
import views._
import play.api.routing._

import play.api.libs.json._
import play.api.libs.functional.syntax._

import scala.concurrent.{ExecutionContext, Future}


/*
 *
 * created by yangmingsen on 2018/04
 */
class Admin @Inject() ( books: BookInfosRepository,
                        client: ClientsRepository,
                        cc: MessagesControllerComponents,
                        admin: AdminRepository)(implicit ec: ExecutionContext,  parser: BodyParsers.Default) extends MessagesAbstractController(cc) {


  private val LOGGERADMIN = play.api.Logger(this.getClass)

//  implicit val adminWrites: Writes[AdminM] = (
//    (JsPath \ "acct").write[String] and
//    (JsPath \ "pasd").write[String]
//  )(unlift(AdminM.unapply))

  /**
    * 同意申请人的借阅请求
    * @param userid
    * @param bookid
    * @return
    */
  def checkPass(userid: String, bookid: Long) = checkAdminLogin.async { implicit request: Request[AnyContent] =>

      val date = utils.TimeHelper.getTimeNow()
      admin.agreeClientRequest(userid,bookid,date)
      books.bookNumReduce(bookid)
      Future.successful(Ok("已同意"))
  }

  /**
    * 拒绝用户申请
    * @param userid
    * @param bookid
    * @return
    */
  def refusePass( userid: String , bookid: Long ) = checkAdminLogin.async { implicit request: Request[AnyContent] =>
    admin.refuseClientRequest(userid,bookid)
    Future.successful(Ok("已拒绝"))
  }

  /**同意用户还书
    *
    * @param userid
    * @param bookid
    * @return
    */
  def agreClientReturnBook(userid: String, bookid: Long) = checkAdminLogin.async { implicit request: Request[AnyContent] =>
    val date = utils.TimeHelper.getTimeNow()
      admin.addToHistory(userid,bookid,date)
     Future.successful(Ok(Json.obj("states" -> "1")))
  }

  def index() = checkAdminLogin.async { implicit request: Request[AnyContent] =>
    Future.successful(Ok(views.html.admin.index()))
  }

  def head() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.admin.head())
  }

  def left() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.admin.left())
  }

  /**
    * 打开管理主页
    * @return
    */
  def main() = checkAdminLogin.async{ implicit request: Request[AnyContent] =>
    for{
        data <- admin.getDealListAll(1)
       } yield {
         Ok(views.html.admin.main(data))
      }
  }

  /**
    * 登录界面
    * @return
    */
  def login() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.admin.login())
  }

  def doLogin() = Action.async { implicit request: Request[AnyContent] =>
    Form(tuple("acct" -> nonEmptyText,"pasd" -> nonEmptyText)).bindFromRequest().fold(
      error => Future.successful(Ok("绑定出错！")),
      yes => {
       val (acct,pasd) = yes
        admin.getAdmin(acct).map {
          case Some(h) => if(h.pasd.equals(pasd)) {
            Ok(Json.obj("states" -> "0")).withSession("AdminAcct" -> acct)
          } else {
            Ok(Json.obj("states" -> "1"))
          }
          case None => Ok(Json.obj("states" -> "2"))
        }

     }
    )
  }

  /**
    * 返回所有已同意的Client列表
    * @return
    */
  def agreeList() = checkAdminLogin.async{ implicit request: Request[AnyContent] =>
      for{
        arg <- admin.getDealListAll(2)
      } yield {
        Ok(views.html.admin.Agrtable(arg))
      }
  }

  /**
    * admin退出
    * @return
    */
  def adminLogOut() = Action.async { implicit request: Request[AnyContent] =>
    Future.successful(Ok(views.html.admin.login()).withNewSession)
  }

  /**
    * 获取用户还书申请列表
    * @return
    */
  def getClientRetBookReq() = checkAdminLogin.async { implicit request: Request[AnyContent] =>
    for {
      data <- admin.getDealListAll(3)
    } yield {
      Ok(views.html.admin.retbookreq(data))
    }
  }

  /**
    * 获取拒绝用户列表
    * @return
    */
  def getRefuseByAdminList() = checkAdminLogin.async { implicit request: Request[AnyContent] =>
    for {
      data <- admin.getDealListAll(22)
    } yield {
      Ok(views.html.admin.refuse(data))
    }
  }

  /**
    * 获取所有用户历史记录
    * @return
    */
  def getClientHistory() = checkAdminLogin.async { implicit request: Request[AnyContent] =>
    for {
      data <- admin.getHistoryAll()
    } yield {
      Ok(views.html.admin.history(data))
    }

  }



}