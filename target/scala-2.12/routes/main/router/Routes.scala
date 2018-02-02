
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/seed/conf/routes
// @DATE:Fri Feb 02 11:08:54 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  Applications_0: controllers.Applications,
  // @LINE:22
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    Applications_0: controllers.Applications,
    // @LINE:22
    Assets_1: controllers.Assets
  ) = this(errorHandler, Applications_0, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Applications_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Applications.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Applications.search(key:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Applications.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Applications.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Applications.register"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """register""", """controllers.Applications.doRegisterEmail"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """introdution/""" + "$" + """id<[^/]+>""", """controllers.Applications.introdution(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_Applications_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Applications_index0_invoker = createInvoker(
    Applications_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Applications_search1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Applications_search1_invoker = createInvoker(
    Applications_0.search(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "search",
      Seq(classOf[String]),
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Applications_login2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Applications_login2_invoker = createInvoker(
    Applications_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Applications_doLogin3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Applications_doLogin3_invoker = createInvoker(
    Applications_0.doLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_Applications_register4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Applications_register4_invoker = createInvoker(
    Applications_0.register,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "register",
      Nil,
      "GET",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Applications_doRegisterEmail5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("register")))
  )
  private[this] lazy val controllers_Applications_doRegisterEmail5_invoker = createInvoker(
    Applications_0.doRegisterEmail,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "doRegisterEmail",
      Nil,
      "POST",
      this.prefix + """register""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_Applications_introdution6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("introdution/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Applications_introdution6_invoker = createInvoker(
    Applications_0.introdution(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "introdution",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """introdution/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_Assets_at7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_Applications_index0_route(params@_) =>
      call { 
        controllers_Applications_index0_invoker.call(Applications_0.index)
      }
  
    // @LINE:9
    case controllers_Applications_search1_route(params@_) =>
      call(params.fromQuery[String]("key", Some(""))) { (key) =>
        controllers_Applications_search1_invoker.call(Applications_0.search(key))
      }
  
    // @LINE:11
    case controllers_Applications_login2_route(params@_) =>
      call { 
        controllers_Applications_login2_invoker.call(Applications_0.login)
      }
  
    // @LINE:12
    case controllers_Applications_doLogin3_route(params@_) =>
      call { 
        controllers_Applications_doLogin3_invoker.call(Applications_0.doLogin)
      }
  
    // @LINE:14
    case controllers_Applications_register4_route(params@_) =>
      call { 
        controllers_Applications_register4_invoker.call(Applications_0.register)
      }
  
    // @LINE:15
    case controllers_Applications_doRegisterEmail5_route(params@_) =>
      call { 
        controllers_Applications_doRegisterEmail5_invoker.call(Applications_0.doRegisterEmail)
      }
  
    // @LINE:17
    case controllers_Applications_introdution6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Applications_introdution6_invoker.call(Applications_0.introdution(id))
      }
  
    // @LINE:22
    case controllers_Assets_at7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(Assets_1.at(path, file))
      }
  }
}
