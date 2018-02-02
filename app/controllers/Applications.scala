package controllers

import java.sql.Date
import javax.inject.Inject

import models._
import play.api.data.Forms._
import play.api.data._
import play.api.mvc._
import views._

import scala.concurrent.{ExecutionContext, Future}

class Applications @Inject() ( books: BookInfosRepository,
                               client: ClientsRepository,
                               cc: MessagesControllerComponents)(implicit ec: ExecutionContext)
                              extends MessagesAbstractController(cc) {

  private val logger = play.api.Logger(this.getClass)

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

    Form(tuple("phone" -> nonEmptyText,"pasd" -> nonEmptyText)).bindFromRequest().fold(
      error => Future.successful(Ok("绑定出错")),
      tup => {
      val(phone,pasd) = tup
        client.checkAcct(phone).map{
          case Some(p) => if(p.pasd.equals(pasd)) {Redirect(routes.Applications.index())}
                          else {Ok("密码错误")}
          case None => Ok("该用户不存在")
        }
     }
    )
  }

  def register() = Action{ implicit request: Request[AnyContent] =>
    Ok(views.html.regsiter())
  }

  def doRegisterEmail() = Action.async { implicit request: Request[AnyContent] =>
    Form(tuple("email" -> nonEmptyText, "pasd" -> nonEmptyText, "rpasd" -> nonEmptyText, "realName" -> nonEmptyText)).bindFromRequest().fold(
      error => Future.successful(Ok("绑定出错了")),
      tup => {
        val (email, pasd, rpasd, realName) = tup
        if (!pasd.equals(rpasd)) {
          Future.successful(Ok("两次密码不一至"))
        } else {
          client.insertUserFromEmail(email, pasd, realName).map {
            case _ => Ok(views.html.login())
          }
        }
      }
    )
  }
    def introdution(id: Long) = Action.async { implicit request: Request[AnyContent] =>
      println("id = "+id)
      books.findById(id).map{
        case Some(b) => Ok(views.html.introdution(b))
        case _ => Ok("hell world")
      }

    }


}
