
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Sun Apr 22 12:40:39 CST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers {

  // @LINE:47
  class ReverseAdmin(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def refusePass(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "refReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:59
    def main(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/main")
    }
  
    // @LINE:57
    def left(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/left")
    }
  
    // @LINE:63
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "admin/login")
    }
  
    // @LINE:55
    def head(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/head")
    }
  
    // @LINE:47
    def checkPass(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "agrReq" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:51
    def returnBook(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "retSuc" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:65
    def agreeList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/arelt")
    }
  
    // @LINE:67
    def adminLogOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/eixt")
    }
  
    // @LINE:53
    def index(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin")
    }
  
    // @LINE:61
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "admin/login")
    }
  
  }

  // @LINE:71
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
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

  
    // @LINE:19
    def addCart(id:Long = -1, title:String = ""): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Cart/add" + play.core.routing.queryString(List(if(id == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("id", id)), if(title == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("title", title)))))
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
    def personReturn(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/retbk")
    }
  
    // @LINE:21
    def showCart(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "cart")
    }
  
    // @LINE:11
    def doLogin(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:43
    def continueReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/conApy" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:35
    def personOrder(): Call = {
    
      () match {
      
        // @LINE:35
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "person")
      
      }
    
    }
  
    // @LINE:41
    def delRefuseReq(userid:String = "", bookid:Long = -1): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "person/delRef" + play.core.routing.queryString(List(if(userid == "") None else Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("userid", userid)), if(bookid == -1) None else Some(implicitly[play.api.mvc.QueryStringBindable[Long]].unbind("bookid", bookid)))))
    }
  
    // @LINE:25
    def addToAdminDealList(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "subReq")
    }
  
    // @LINE:23
    def logOut(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "giveUp")
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
