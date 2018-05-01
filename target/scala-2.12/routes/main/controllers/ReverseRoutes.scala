
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Tue May 01 10:16:44 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:60
  class ReverseAdmin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def getClientRetBookReq(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cliRetReq")
    }
  
    // @LINE:62
    def refusePass(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "refReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:64
    def agreClientReturnBook(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/retSuc" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:72
    def main(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/main")
    }
  
    // @LINE:70
    def left(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/left")
    }
  
    // @LINE:76
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/login")
    }
  
    // @LINE:86
    def getClientHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/hisAll")
    }
  
    // @LINE:68
    def head(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/head")
    }
  
    // @LINE:60
    def checkPass(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "agrReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:78
    def agreeList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/arelt")
    }
  
    // @LINE:80
    def adminLogOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/eixt")
    }
  
    // @LINE:66
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:82
    def getRefuseByAdminList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/refCliReq")
    }
  
    // @LINE:74
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/login")
    }
  
  }

  // @LINE:90
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }

  // @LINE:5
  class ReverseApplications(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:39
    def personIndex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person")
    }
  
    // @LINE:41
    def personBorrowHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/hisy")
    }
  
    // @LINE:23
    def addCart(id:Long = -1, title:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Cart/add" + play.core.routing.queryString(List(if(id == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)), if(title == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("title", title)))))
    }
  
    // @LINE:9
    def search(key:String = "", page:Int = 1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search" + play.core.routing.queryString(List(if(key == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("key", key)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:55
    def personReturnBookReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/retBoReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:21
    def introdution(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "introdution/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:31
    def subSuccessful(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subSuc")
    }
  
    // @LINE:33
    def delCart(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delCart" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:43
    def personBorrowList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/borlis")
    }
  
    // @LINE:11
    def searchNew(key:String = "", page:Int = 1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "searchN" + play.core.routing.queryString(List(if(key == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("key", key)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:25
    def showCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:45
    def personChecking(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/chec")
    }
  
    // @LINE:15
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:53
    def continueReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/conApy" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:51
    def delRefuseReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/delRef" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:29
    def addToAdminDealList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subReq")
    }
  
    // @LINE:47
    def personPassed(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/psed")
    }
  
    // @LINE:27
    def logOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "giveUp")
    }
  
    // @LINE:49
    def personDisagree(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/disage")
    }
  
    // @LINE:7
    def indexN(who:Int = 0, page:Int = 1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "New" + play.core.routing.queryString(List(if(who == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("who", who)), if(page == 1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Int]].unbind("page", page)))))
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:13
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
