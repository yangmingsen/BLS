
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Wed Apr 25 22:25:37 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Applications_0: controllers.Applications,
  // @LINE:50
  Admin_2: controllers.Admin,
  // @LINE:74
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Applications_0: controllers.Applications,
    // @LINE:50
    Admin_2: controllers.Admin,
    // @LINE:74
    Assets_1: controllers.Assets
  ) = this(errorHandler, Applications_0, Admin_2, Assets_1, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Applications_0, Admin_2, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Applications.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Applications.search(key:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Applications.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Applications.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """introdution/""" + "$" + """id<[^/]+>""", """controllers.Applications.introdution(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Cart/add""", """controllers.Applications.addCart(id:Long ?= -1, title:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.Applications.showCart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """giveUp""", """controllers.Applications.logOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subReq""", """controllers.Applications.addToAdminDealList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subSuc""", """controllers.Applications.subSuccessful"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delCart""", """controllers.Applications.delCart(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.Applications.personOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/order""", """controllers.Applications.personOrder"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/retbk""", """controllers.Applications.personReturn"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/delRef""", """controllers.Applications.delRefuseReq(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/conApy""", """controllers.Applications.continueReq(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/retBoReq""", """controllers.Applications.personReturnBookReq(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """agrReq""", """controllers.Admin.checkPass(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """refReq""", """controllers.Admin.refusePass(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/retSuc""", """controllers.Admin.agreClientReturnBook(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.Admin.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/head""", """controllers.Admin.head"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/left""", """controllers.Admin.left"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/main""", """controllers.Admin.main"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/login""", """controllers.Admin.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/login""", """controllers.Admin.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/arelt""", """controllers.Admin.agreeList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/eixt""", """controllers.Admin.adminLogOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
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
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~
Application""",
      Seq()
    )
  )

  // @LINE:7
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

  // @LINE:9
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

  // @LINE:11
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

  // @LINE:17
  private[this] lazy val controllers_Applications_introdution4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("introdution/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_Applications_introdution4_invoker = createInvoker(
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

  // @LINE:19
  private[this] lazy val controllers_Applications_addCart5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Cart/add")))
  )
  private[this] lazy val controllers_Applications_addCart5_invoker = createInvoker(
    Applications_0.addCart(fakeValue[Long], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "addCart",
      Seq(classOf[Long], classOf[String]),
      "GET",
      this.prefix + """Cart/add""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_Applications_showCart6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Applications_showCart6_invoker = createInvoker(
    Applications_0.showCart,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "showCart",
      Nil,
      "GET",
      this.prefix + """cart""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_Applications_logOut7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("giveUp")))
  )
  private[this] lazy val controllers_Applications_logOut7_invoker = createInvoker(
    Applications_0.logOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "logOut",
      Nil,
      "GET",
      this.prefix + """giveUp""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_Applications_addToAdminDealList8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subReq")))
  )
  private[this] lazy val controllers_Applications_addToAdminDealList8_invoker = createInvoker(
    Applications_0.addToAdminDealList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "addToAdminDealList",
      Nil,
      "GET",
      this.prefix + """subReq""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_Applications_subSuccessful9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subSuc")))
  )
  private[this] lazy val controllers_Applications_subSuccessful9_invoker = createInvoker(
    Applications_0.subSuccessful,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "subSuccessful",
      Nil,
      "GET",
      this.prefix + """subSuc""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Applications_delCart10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delCart")))
  )
  private[this] lazy val controllers_Applications_delCart10_invoker = createInvoker(
    Applications_0.delCart(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "delCart",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """delCart""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_Applications_personOrder11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_Applications_personOrder11_invoker = createInvoker(
    Applications_0.personOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personOrder",
      Nil,
      "GET",
      this.prefix + """person""",
      """Person manager""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_Applications_personOrder12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/order")))
  )
  private[this] lazy val controllers_Applications_personOrder12_invoker = createInvoker(
    Applications_0.personOrder,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personOrder",
      Nil,
      "GET",
      this.prefix + """person/order""",
      """""",
      Seq()
    )
  )

  // @LINE:39
  private[this] lazy val controllers_Applications_personReturn13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/retbk")))
  )
  private[this] lazy val controllers_Applications_personReturn13_invoker = createInvoker(
    Applications_0.personReturn,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personReturn",
      Nil,
      "GET",
      this.prefix + """person/retbk""",
      """""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Applications_delRefuseReq14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/delRef")))
  )
  private[this] lazy val controllers_Applications_delRefuseReq14_invoker = createInvoker(
    Applications_0.delRefuseReq(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "delRefuseReq",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """person/delRef""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Applications_continueReq15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/conApy")))
  )
  private[this] lazy val controllers_Applications_continueReq15_invoker = createInvoker(
    Applications_0.continueReq(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "continueReq",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """person/conApy""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Applications_personReturnBookReq16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/retBoReq")))
  )
  private[this] lazy val controllers_Applications_personReturnBookReq16_invoker = createInvoker(
    Applications_0.personReturnBookReq(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personReturnBookReq",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """person/retBoReq""",
      """""",
      Seq()
    )
  )

  // @LINE:50
  private[this] lazy val controllers_Admin_checkPass17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agrReq")))
  )
  private[this] lazy val controllers_Admin_checkPass17_invoker = createInvoker(
    Admin_2.checkPass(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "checkPass",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """agrReq""",
      """""",
      Seq()
    )
  )

  // @LINE:52
  private[this] lazy val controllers_Admin_refusePass18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("refReq")))
  )
  private[this] lazy val controllers_Admin_refusePass18_invoker = createInvoker(
    Admin_2.refusePass(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "refusePass",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """refReq""",
      """""",
      Seq()
    )
  )

  // @LINE:54
  private[this] lazy val controllers_Admin_agreClientReturnBook19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/retSuc")))
  )
  private[this] lazy val controllers_Admin_agreClientReturnBook19_invoker = createInvoker(
    Admin_2.agreClientReturnBook(fakeValue[String], fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "agreClientReturnBook",
      Seq(classOf[String], classOf[Long]),
      "GET",
      this.prefix + """admin/retSuc""",
      """""",
      Seq()
    )
  )

  // @LINE:56
  private[this] lazy val controllers_Admin_index20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Admin_index20_invoker = createInvoker(
    Admin_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "index",
      Nil,
      "GET",
      this.prefix + """admin""",
      """""",
      Seq()
    )
  )

  // @LINE:58
  private[this] lazy val controllers_Admin_head21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/head")))
  )
  private[this] lazy val controllers_Admin_head21_invoker = createInvoker(
    Admin_2.head,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "head",
      Nil,
      "GET",
      this.prefix + """admin/head""",
      """""",
      Seq()
    )
  )

  // @LINE:60
  private[this] lazy val controllers_Admin_left22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/left")))
  )
  private[this] lazy val controllers_Admin_left22_invoker = createInvoker(
    Admin_2.left,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "left",
      Nil,
      "GET",
      this.prefix + """admin/left""",
      """""",
      Seq()
    )
  )

  // @LINE:62
  private[this] lazy val controllers_Admin_main23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/main")))
  )
  private[this] lazy val controllers_Admin_main23_invoker = createInvoker(
    Admin_2.main,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "main",
      Nil,
      "GET",
      this.prefix + """admin/main""",
      """""",
      Seq()
    )
  )

  // @LINE:64
  private[this] lazy val controllers_Admin_login24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/login")))
  )
  private[this] lazy val controllers_Admin_login24_invoker = createInvoker(
    Admin_2.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "login",
      Nil,
      "GET",
      this.prefix + """admin/login""",
      """""",
      Seq()
    )
  )

  // @LINE:66
  private[this] lazy val controllers_Admin_doLogin25_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/login")))
  )
  private[this] lazy val controllers_Admin_doLogin25_invoker = createInvoker(
    Admin_2.doLogin,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "doLogin",
      Nil,
      "POST",
      this.prefix + """admin/login""",
      """""",
      Seq()
    )
  )

  // @LINE:68
  private[this] lazy val controllers_Admin_agreeList26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/arelt")))
  )
  private[this] lazy val controllers_Admin_agreeList26_invoker = createInvoker(
    Admin_2.agreeList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "agreeList",
      Nil,
      "GET",
      this.prefix + """admin/arelt""",
      """""",
      Seq()
    )
  )

  // @LINE:70
  private[this] lazy val controllers_Admin_adminLogOut27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/eixt")))
  )
  private[this] lazy val controllers_Admin_adminLogOut27_invoker = createInvoker(
    Admin_2.adminLogOut,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "adminLogOut",
      Nil,
      "GET",
      this.prefix + """admin/eixt""",
      """""",
      Seq()
    )
  )

  // @LINE:74
  private[this] lazy val controllers_Assets_at28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at28_invoker = createInvoker(
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
  
    // @LINE:5
    case controllers_Applications_index0_route(params@_) =>
      call { 
        controllers_Applications_index0_invoker.call(Applications_0.index)
      }
  
    // @LINE:7
    case controllers_Applications_search1_route(params@_) =>
      call(params.fromQuery[String]("key", Some(""))) { (key) =>
        controllers_Applications_search1_invoker.call(Applications_0.search(key))
      }
  
    // @LINE:9
    case controllers_Applications_login2_route(params@_) =>
      call { 
        controllers_Applications_login2_invoker.call(Applications_0.login)
      }
  
    // @LINE:11
    case controllers_Applications_doLogin3_route(params@_) =>
      call { 
        controllers_Applications_doLogin3_invoker.call(Applications_0.doLogin)
      }
  
    // @LINE:17
    case controllers_Applications_introdution4_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Applications_introdution4_invoker.call(Applications_0.introdution(id))
      }
  
    // @LINE:19
    case controllers_Applications_addCart5_route(params@_) =>
      call(params.fromQuery[Long]("id", Some(-1)), params.fromQuery[String]("title", Some(""))) { (id, title) =>
        controllers_Applications_addCart5_invoker.call(Applications_0.addCart(id, title))
      }
  
    // @LINE:21
    case controllers_Applications_showCart6_route(params@_) =>
      call { 
        controllers_Applications_showCart6_invoker.call(Applications_0.showCart)
      }
  
    // @LINE:23
    case controllers_Applications_logOut7_route(params@_) =>
      call { 
        controllers_Applications_logOut7_invoker.call(Applications_0.logOut)
      }
  
    // @LINE:25
    case controllers_Applications_addToAdminDealList8_route(params@_) =>
      call { 
        controllers_Applications_addToAdminDealList8_invoker.call(Applications_0.addToAdminDealList)
      }
  
    // @LINE:27
    case controllers_Applications_subSuccessful9_route(params@_) =>
      call { 
        controllers_Applications_subSuccessful9_invoker.call(Applications_0.subSuccessful)
      }
  
    // @LINE:29
    case controllers_Applications_delCart10_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_delCart10_invoker.call(Applications_0.delCart(userid, bookid))
      }
  
    // @LINE:35
    case controllers_Applications_personOrder11_route(params@_) =>
      call { 
        controllers_Applications_personOrder11_invoker.call(Applications_0.personOrder)
      }
  
    // @LINE:37
    case controllers_Applications_personOrder12_route(params@_) =>
      call { 
        controllers_Applications_personOrder12_invoker.call(Applications_0.personOrder)
      }
  
    // @LINE:39
    case controllers_Applications_personReturn13_route(params@_) =>
      call { 
        controllers_Applications_personReturn13_invoker.call(Applications_0.personReturn)
      }
  
    // @LINE:41
    case controllers_Applications_delRefuseReq14_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_delRefuseReq14_invoker.call(Applications_0.delRefuseReq(userid, bookid))
      }
  
    // @LINE:43
    case controllers_Applications_continueReq15_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_continueReq15_invoker.call(Applications_0.continueReq(userid, bookid))
      }
  
    // @LINE:45
    case controllers_Applications_personReturnBookReq16_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_personReturnBookReq16_invoker.call(Applications_0.personReturnBookReq(userid, bookid))
      }
  
    // @LINE:50
    case controllers_Admin_checkPass17_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Admin_checkPass17_invoker.call(Admin_2.checkPass(userid, bookid))
      }
  
    // @LINE:52
    case controllers_Admin_refusePass18_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Admin_refusePass18_invoker.call(Admin_2.refusePass(userid, bookid))
      }
  
    // @LINE:54
    case controllers_Admin_agreClientReturnBook19_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Admin_agreClientReturnBook19_invoker.call(Admin_2.agreClientReturnBook(userid, bookid))
      }
  
    // @LINE:56
    case controllers_Admin_index20_route(params@_) =>
      call { 
        controllers_Admin_index20_invoker.call(Admin_2.index)
      }
  
    // @LINE:58
    case controllers_Admin_head21_route(params@_) =>
      call { 
        controllers_Admin_head21_invoker.call(Admin_2.head)
      }
  
    // @LINE:60
    case controllers_Admin_left22_route(params@_) =>
      call { 
        controllers_Admin_left22_invoker.call(Admin_2.left)
      }
  
    // @LINE:62
    case controllers_Admin_main23_route(params@_) =>
      call { 
        controllers_Admin_main23_invoker.call(Admin_2.main)
      }
  
    // @LINE:64
    case controllers_Admin_login24_route(params@_) =>
      call { 
        controllers_Admin_login24_invoker.call(Admin_2.login)
      }
  
    // @LINE:66
    case controllers_Admin_doLogin25_route(params@_) =>
      call { 
        controllers_Admin_doLogin25_invoker.call(Admin_2.doLogin)
      }
  
    // @LINE:68
    case controllers_Admin_agreeList26_route(params@_) =>
      call { 
        controllers_Admin_agreeList26_invoker.call(Admin_2.agreeList)
      }
  
    // @LINE:70
    case controllers_Admin_adminLogOut27_route(params@_) =>
      call { 
        controllers_Admin_adminLogOut27_invoker.call(Admin_2.adminLogOut)
      }
  
    // @LINE:74
    case controllers_Assets_at28_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at28_invoker.call(Assets_1.at(path, file))
      }
  }
}
