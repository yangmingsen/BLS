
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Tue May 01 10:16:44 CST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Applications_0: controllers.Applications,
  // @LINE:60
  Admin_2: controllers.Admin,
  // @LINE:90
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Applications_0: controllers.Applications,
    // @LINE:60
    Admin_2: controllers.Admin,
    // @LINE:90
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """New""", """controllers.Applications.indexN(who:Int ?= 0, page:Int ?= 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """search""", """controllers.Applications.search(key:String ?= "", page:Int ?= 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """searchN""", """controllers.Applications.searchNew(key:String ?= "", page:Int ?= 1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Applications.login"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.Applications.doLogin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """introdution/""" + "$" + """id<[^/]+>""", """controllers.Applications.introdution(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Cart/add""", """controllers.Applications.addCart(id:Long ?= -1, title:String ?= "")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """cart""", """controllers.Applications.showCart"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """giveUp""", """controllers.Applications.logOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subReq""", """controllers.Applications.addToAdminDealList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """subSuc""", """controllers.Applications.subSuccessful"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delCart""", """controllers.Applications.delCart(userid:String ?= "", bookid:Long ?= -1)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.Applications.personIndex"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/hisy""", """controllers.Applications.personBorrowHistory"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/borlis""", """controllers.Applications.personBorrowList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/chec""", """controllers.Applications.personChecking"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/psed""", """controllers.Applications.personPassed"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person/disage""", """controllers.Applications.personDisagree"""),
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
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/refCliReq""", """controllers.Admin.getRefuseByAdminList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/cliRetReq""", """controllers.Admin.getClientRetBookReq"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/hisAll""", """controllers.Admin.getClientHistory"""),
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
  private[this] lazy val controllers_Applications_indexN1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("New")))
  )
  private[this] lazy val controllers_Applications_indexN1_invoker = createInvoker(
    Applications_0.indexN(fakeValue[Int], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "indexN",
      Seq(classOf[Int], classOf[Int]),
      "GET",
      this.prefix + """New""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Applications_search2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("search")))
  )
  private[this] lazy val controllers_Applications_search2_invoker = createInvoker(
    Applications_0.search(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "search",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """search""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Applications_searchNew3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("searchN")))
  )
  private[this] lazy val controllers_Applications_searchNew3_invoker = createInvoker(
    Applications_0.searchNew(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "searchNew",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """searchN""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_Applications_login4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Applications_login4_invoker = createInvoker(
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

  // @LINE:15
  private[this] lazy val controllers_Applications_doLogin5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_Applications_doLogin5_invoker = createInvoker(
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

  // @LINE:21
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

  // @LINE:23
  private[this] lazy val controllers_Applications_addCart7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Cart/add")))
  )
  private[this] lazy val controllers_Applications_addCart7_invoker = createInvoker(
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

  // @LINE:25
  private[this] lazy val controllers_Applications_showCart8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("cart")))
  )
  private[this] lazy val controllers_Applications_showCart8_invoker = createInvoker(
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

  // @LINE:27
  private[this] lazy val controllers_Applications_logOut9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("giveUp")))
  )
  private[this] lazy val controllers_Applications_logOut9_invoker = createInvoker(
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

  // @LINE:29
  private[this] lazy val controllers_Applications_addToAdminDealList10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subReq")))
  )
  private[this] lazy val controllers_Applications_addToAdminDealList10_invoker = createInvoker(
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

  // @LINE:31
  private[this] lazy val controllers_Applications_subSuccessful11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("subSuc")))
  )
  private[this] lazy val controllers_Applications_subSuccessful11_invoker = createInvoker(
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

  // @LINE:33
  private[this] lazy val controllers_Applications_delCart12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delCart")))
  )
  private[this] lazy val controllers_Applications_delCart12_invoker = createInvoker(
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

  // @LINE:39
  private[this] lazy val controllers_Applications_personIndex13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_Applications_personIndex13_invoker = createInvoker(
    Applications_0.personIndex,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personIndex",
      Nil,
      "GET",
      this.prefix + """person""",
      """Person manager""",
      Seq()
    )
  )

  // @LINE:41
  private[this] lazy val controllers_Applications_personBorrowHistory14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/hisy")))
  )
  private[this] lazy val controllers_Applications_personBorrowHistory14_invoker = createInvoker(
    Applications_0.personBorrowHistory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personBorrowHistory",
      Nil,
      "GET",
      this.prefix + """person/hisy""",
      """""",
      Seq()
    )
  )

  // @LINE:43
  private[this] lazy val controllers_Applications_personBorrowList15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/borlis")))
  )
  private[this] lazy val controllers_Applications_personBorrowList15_invoker = createInvoker(
    Applications_0.personBorrowList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personBorrowList",
      Nil,
      "GET",
      this.prefix + """person/borlis""",
      """""",
      Seq()
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Applications_personChecking16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/chec")))
  )
  private[this] lazy val controllers_Applications_personChecking16_invoker = createInvoker(
    Applications_0.personChecking,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personChecking",
      Nil,
      "GET",
      this.prefix + """person/chec""",
      """""",
      Seq()
    )
  )

  // @LINE:47
  private[this] lazy val controllers_Applications_personPassed17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/psed")))
  )
  private[this] lazy val controllers_Applications_personPassed17_invoker = createInvoker(
    Applications_0.personPassed,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personPassed",
      Nil,
      "GET",
      this.prefix + """person/psed""",
      """""",
      Seq()
    )
  )

  // @LINE:49
  private[this] lazy val controllers_Applications_personDisagree18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/disage")))
  )
  private[this] lazy val controllers_Applications_personDisagree18_invoker = createInvoker(
    Applications_0.personDisagree,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Applications",
      "personDisagree",
      Nil,
      "GET",
      this.prefix + """person/disage""",
      """""",
      Seq()
    )
  )

  // @LINE:51
  private[this] lazy val controllers_Applications_delRefuseReq19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/delRef")))
  )
  private[this] lazy val controllers_Applications_delRefuseReq19_invoker = createInvoker(
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

  // @LINE:53
  private[this] lazy val controllers_Applications_continueReq20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/conApy")))
  )
  private[this] lazy val controllers_Applications_continueReq20_invoker = createInvoker(
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

  // @LINE:55
  private[this] lazy val controllers_Applications_personReturnBookReq21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person/retBoReq")))
  )
  private[this] lazy val controllers_Applications_personReturnBookReq21_invoker = createInvoker(
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

  // @LINE:60
  private[this] lazy val controllers_Admin_checkPass22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("agrReq")))
  )
  private[this] lazy val controllers_Admin_checkPass22_invoker = createInvoker(
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

  // @LINE:62
  private[this] lazy val controllers_Admin_refusePass23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("refReq")))
  )
  private[this] lazy val controllers_Admin_refusePass23_invoker = createInvoker(
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

  // @LINE:64
  private[this] lazy val controllers_Admin_agreClientReturnBook24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/retSuc")))
  )
  private[this] lazy val controllers_Admin_agreClientReturnBook24_invoker = createInvoker(
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

  // @LINE:66
  private[this] lazy val controllers_Admin_index25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_Admin_index25_invoker = createInvoker(
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

  // @LINE:68
  private[this] lazy val controllers_Admin_head26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/head")))
  )
  private[this] lazy val controllers_Admin_head26_invoker = createInvoker(
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

  // @LINE:70
  private[this] lazy val controllers_Admin_left27_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/left")))
  )
  private[this] lazy val controllers_Admin_left27_invoker = createInvoker(
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

  // @LINE:72
  private[this] lazy val controllers_Admin_main28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/main")))
  )
  private[this] lazy val controllers_Admin_main28_invoker = createInvoker(
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

  // @LINE:74
  private[this] lazy val controllers_Admin_login29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/login")))
  )
  private[this] lazy val controllers_Admin_login29_invoker = createInvoker(
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

  // @LINE:76
  private[this] lazy val controllers_Admin_doLogin30_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/login")))
  )
  private[this] lazy val controllers_Admin_doLogin30_invoker = createInvoker(
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

  // @LINE:78
  private[this] lazy val controllers_Admin_agreeList31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/arelt")))
  )
  private[this] lazy val controllers_Admin_agreeList31_invoker = createInvoker(
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

  // @LINE:80
  private[this] lazy val controllers_Admin_adminLogOut32_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/eixt")))
  )
  private[this] lazy val controllers_Admin_adminLogOut32_invoker = createInvoker(
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

  // @LINE:82
  private[this] lazy val controllers_Admin_getRefuseByAdminList33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/refCliReq")))
  )
  private[this] lazy val controllers_Admin_getRefuseByAdminList33_invoker = createInvoker(
    Admin_2.getRefuseByAdminList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "getRefuseByAdminList",
      Nil,
      "GET",
      this.prefix + """admin/refCliReq""",
      """""",
      Seq()
    )
  )

  // @LINE:84
  private[this] lazy val controllers_Admin_getClientRetBookReq34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/cliRetReq")))
  )
  private[this] lazy val controllers_Admin_getClientRetBookReq34_invoker = createInvoker(
    Admin_2.getClientRetBookReq,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "getClientRetBookReq",
      Nil,
      "GET",
      this.prefix + """admin/cliRetReq""",
      """""",
      Seq()
    )
  )

  // @LINE:86
  private[this] lazy val controllers_Admin_getClientHistory35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/hisAll")))
  )
  private[this] lazy val controllers_Admin_getClientHistory35_invoker = createInvoker(
    Admin_2.getClientHistory,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Admin",
      "getClientHistory",
      Nil,
      "GET",
      this.prefix + """admin/hisAll""",
      """""",
      Seq()
    )
  )

  // @LINE:90
  private[this] lazy val controllers_Assets_at36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at36_invoker = createInvoker(
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
    case controllers_Applications_indexN1_route(params@_) =>
      call(params.fromQuery[Int]("who", Some(0)), params.fromQuery[Int]("page", Some(1))) { (who, page) =>
        controllers_Applications_indexN1_invoker.call(Applications_0.indexN(who, page))
      }
  
    // @LINE:9
    case controllers_Applications_search2_route(params@_) =>
      call(params.fromQuery[String]("key", Some("")), params.fromQuery[Int]("page", Some(1))) { (key, page) =>
        controllers_Applications_search2_invoker.call(Applications_0.search(key, page))
      }
  
    // @LINE:11
    case controllers_Applications_searchNew3_route(params@_) =>
      call(params.fromQuery[String]("key", Some("")), params.fromQuery[Int]("page", Some(1))) { (key, page) =>
        controllers_Applications_searchNew3_invoker.call(Applications_0.searchNew(key, page))
      }
  
    // @LINE:13
    case controllers_Applications_login4_route(params@_) =>
      call { 
        controllers_Applications_login4_invoker.call(Applications_0.login)
      }
  
    // @LINE:15
    case controllers_Applications_doLogin5_route(params@_) =>
      call { 
        controllers_Applications_doLogin5_invoker.call(Applications_0.doLogin)
      }
  
    // @LINE:21
    case controllers_Applications_introdution6_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Applications_introdution6_invoker.call(Applications_0.introdution(id))
      }
  
    // @LINE:23
    case controllers_Applications_addCart7_route(params@_) =>
      call(params.fromQuery[Long]("id", Some(-1)), params.fromQuery[String]("title", Some(""))) { (id, title) =>
        controllers_Applications_addCart7_invoker.call(Applications_0.addCart(id, title))
      }
  
    // @LINE:25
    case controllers_Applications_showCart8_route(params@_) =>
      call { 
        controllers_Applications_showCart8_invoker.call(Applications_0.showCart)
      }
  
    // @LINE:27
    case controllers_Applications_logOut9_route(params@_) =>
      call { 
        controllers_Applications_logOut9_invoker.call(Applications_0.logOut)
      }
  
    // @LINE:29
    case controllers_Applications_addToAdminDealList10_route(params@_) =>
      call { 
        controllers_Applications_addToAdminDealList10_invoker.call(Applications_0.addToAdminDealList)
      }
  
    // @LINE:31
    case controllers_Applications_subSuccessful11_route(params@_) =>
      call { 
        controllers_Applications_subSuccessful11_invoker.call(Applications_0.subSuccessful)
      }
  
    // @LINE:33
    case controllers_Applications_delCart12_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_delCart12_invoker.call(Applications_0.delCart(userid, bookid))
      }
  
    // @LINE:39
    case controllers_Applications_personIndex13_route(params@_) =>
      call { 
        controllers_Applications_personIndex13_invoker.call(Applications_0.personIndex)
      }
  
    // @LINE:41
    case controllers_Applications_personBorrowHistory14_route(params@_) =>
      call { 
        controllers_Applications_personBorrowHistory14_invoker.call(Applications_0.personBorrowHistory)
      }
  
    // @LINE:43
    case controllers_Applications_personBorrowList15_route(params@_) =>
      call { 
        controllers_Applications_personBorrowList15_invoker.call(Applications_0.personBorrowList)
      }
  
    // @LINE:45
    case controllers_Applications_personChecking16_route(params@_) =>
      call { 
        controllers_Applications_personChecking16_invoker.call(Applications_0.personChecking)
      }
  
    // @LINE:47
    case controllers_Applications_personPassed17_route(params@_) =>
      call { 
        controllers_Applications_personPassed17_invoker.call(Applications_0.personPassed)
      }
  
    // @LINE:49
    case controllers_Applications_personDisagree18_route(params@_) =>
      call { 
        controllers_Applications_personDisagree18_invoker.call(Applications_0.personDisagree)
      }
  
    // @LINE:51
    case controllers_Applications_delRefuseReq19_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_delRefuseReq19_invoker.call(Applications_0.delRefuseReq(userid, bookid))
      }
  
    // @LINE:53
    case controllers_Applications_continueReq20_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_continueReq20_invoker.call(Applications_0.continueReq(userid, bookid))
      }
  
    // @LINE:55
    case controllers_Applications_personReturnBookReq21_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Applications_personReturnBookReq21_invoker.call(Applications_0.personReturnBookReq(userid, bookid))
      }
  
    // @LINE:60
    case controllers_Admin_checkPass22_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Admin_checkPass22_invoker.call(Admin_2.checkPass(userid, bookid))
      }
  
    // @LINE:62
    case controllers_Admin_refusePass23_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Admin_refusePass23_invoker.call(Admin_2.refusePass(userid, bookid))
      }
  
    // @LINE:64
    case controllers_Admin_agreClientReturnBook24_route(params@_) =>
      call(params.fromQuery[String]("userid", Some("")), params.fromQuery[Long]("bookid", Some(-1))) { (userid, bookid) =>
        controllers_Admin_agreClientReturnBook24_invoker.call(Admin_2.agreClientReturnBook(userid, bookid))
      }
  
    // @LINE:66
    case controllers_Admin_index25_route(params@_) =>
      call { 
        controllers_Admin_index25_invoker.call(Admin_2.index)
      }
  
    // @LINE:68
    case controllers_Admin_head26_route(params@_) =>
      call { 
        controllers_Admin_head26_invoker.call(Admin_2.head)
      }
  
    // @LINE:70
    case controllers_Admin_left27_route(params@_) =>
      call { 
        controllers_Admin_left27_invoker.call(Admin_2.left)
      }
  
    // @LINE:72
    case controllers_Admin_main28_route(params@_) =>
      call { 
        controllers_Admin_main28_invoker.call(Admin_2.main)
      }
  
    // @LINE:74
    case controllers_Admin_login29_route(params@_) =>
      call { 
        controllers_Admin_login29_invoker.call(Admin_2.login)
      }
  
    // @LINE:76
    case controllers_Admin_doLogin30_route(params@_) =>
      call { 
        controllers_Admin_doLogin30_invoker.call(Admin_2.doLogin)
      }
  
    // @LINE:78
    case controllers_Admin_agreeList31_route(params@_) =>
      call { 
        controllers_Admin_agreeList31_invoker.call(Admin_2.agreeList)
      }
  
    // @LINE:80
    case controllers_Admin_adminLogOut32_route(params@_) =>
      call { 
        controllers_Admin_adminLogOut32_invoker.call(Admin_2.adminLogOut)
      }
  
    // @LINE:82
    case controllers_Admin_getRefuseByAdminList33_route(params@_) =>
      call { 
        controllers_Admin_getRefuseByAdminList33_invoker.call(Admin_2.getRefuseByAdminList)
      }
  
    // @LINE:84
    case controllers_Admin_getClientRetBookReq34_route(params@_) =>
      call { 
        controllers_Admin_getClientRetBookReq34_invoker.call(Admin_2.getClientRetBookReq)
      }
  
    // @LINE:86
    case controllers_Admin_getClientHistory35_route(params@_) =>
      call { 
        controllers_Admin_getClientHistory35_invoker.call(Admin_2.getClientHistory)
      }
  
    // @LINE:90
    case controllers_Assets_at36_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at36_invoker.call(Assets_1.at(path, file))
      }
  }
}
