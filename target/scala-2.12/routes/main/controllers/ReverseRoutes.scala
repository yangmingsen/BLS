
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Thu Apr 26 22:03:37 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:58
  class ReverseAdmin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:82
    def getClientRetBookReq(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/cliRetReq")
    }
  
    // @LINE:60
    def refusePass(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "refReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:62
    def agreClientReturnBook(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/retSuc" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:70
    def main(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/main")
    }
  
    // @LINE:68
    def left(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/left")
    }
  
    // @LINE:74
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/login")
    }
  
    // @LINE:84
    def getClientHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/hisAll")
    }
  
    // @LINE:66
    def head(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/head")
    }
  
    // @LINE:58
    def checkPass(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "agrReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:76
    def agreeList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/arelt")
    }
  
    // @LINE:78
    def adminLogOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/eixt")
    }
  
    // @LINE:64
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:80
    def getRefuseByAdminList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/refCliReq")
    }
  
    // @LINE:72
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/login")
    }
  
  }

  // @LINE:88
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
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

  
    // @LINE:35
    def personIndex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person")
    }
  
    // @LINE:37
    def personBorrowHistory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/hisy")
    }
  
    // @LINE:19
    def addCart(id:Long = -1, title:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Cart/add" + play.core.routing.queryString(List(if(id == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)), if(title == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("title", title)))))
    }
  
    // @LINE:53
    def personReturnBookReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/retBoReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:17
    def introdution(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "introdution/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:7
    def search(key:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "search" + play.core.routing.queryString(List(if(key == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("key", key)))))
    }
  
    // @LINE:27
    def subSuccessful(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subSuc")
    }
  
    // @LINE:29
    def delCart(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "delCart" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:39
    def personBorrowList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/borlis")
    }
  
    // @LINE:21
    def showCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:41
    def personChecking(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/chec")
    }
  
    // @LINE:11
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:51
    def continueReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/conApy" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:49
    def delRefuseReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/delRef" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:25
    def addToAdminDealList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subReq")
    }
  
    // @LINE:43
    def personPassed(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/psed")
    }
  
    // @LINE:23
    def logOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "giveUp")
    }
  
    // @LINE:45
    def personDisagree(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/disage")
    }
  
    // @LINE:5
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:9
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
