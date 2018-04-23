import play.api.mvc._
import utils.RequestHelper

import scala.concurrent.{Future,ExecutionContext}

package object controllers {

    def checkAdminLogin[A](implicit parser: BodyParser[A], ec: ExecutionContext): ActionBuilderImpl[A]= new ActionBuilderImpl(parser) with Rendering with AcceptExtractors {
        override def invokeBlock[A](request: Request[A], block: (Request[A] => Future[Result]) )  = {
            if( RequestHelper.isALogin(request) ) {
                block(request)
            } else {
                Future.successful{
                    render{
                        case Accepts.Html() => Results.Ok(views.html.admin.login()(request))
                    }(request)
                }
            }
        }
    }

    def checkClientLogin[A](implicit parser: BodyParser[A], ec: ExecutionContext): ActionBuilderImpl[A] = new ActionBuilderImpl(parser) with Rendering with AcceptExtractors {
        override def invokeBlock[A](request: Request[A], block: (Request[A] => Future[Result]) ) = {
            if( RequestHelper.isCLogin(request) ) {
                block(request)
            } else {
                Future.successful {
                    render {
                        case Accepts.Html() => Results.Ok(views.html.login()(request))
                    }(request)
                }
            }
        }
    }

}
