
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Sun Apr 22 12:40:39 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers.javascript {

  // @LINE:47
  class ReverseAdmin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:49
    def refusePass: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.refusePass",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "refReq" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:59
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/main"})
        }
      """
    )
  
    // @LINE:57
    def left: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.left",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/left"})
        }
      """
    )
  
    // @LINE:63
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/login"})
        }
      """
    )
  
    // @LINE:55
    def head: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.head",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/head"})
        }
      """
    )
  
    // @LINE:47
    def checkPass: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.checkPass",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agrReq" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:51
    def returnBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.returnBook",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "retSuc" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:65
    def agreeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.agreeList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/arelt"})
        }
      """
    )
  
    // @LINE:67
    def adminLogOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.adminLogOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/eixt"})
        }
      """
    )
  
    // @LINE:53
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:61
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/login"})
        }
      """
    )
  
  }

  // @LINE:71
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:71
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseApplications(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def addCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.addCart",
      """
        function(id0,title1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Cart/add" + _qS([(id0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)), (title1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("title", title1))])})
        }
      """
    )
  
    // @LINE:17
    def introdution: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.introdution",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "introdution/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:7
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.search",
      """
        function(key0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(key0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("key", key0))])})
        }
      """
    )
  
    // @LINE:27
    def subSuccessful: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.subSuccessful",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subSuc"})
        }
      """
    )
  
    // @LINE:29
    def delCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.delCart",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delCart" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:39
    def personReturn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personReturn",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/retbk"})
        }
      """
    )
  
    // @LINE:21
    def showCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.showCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:11
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:43
    def continueReq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.continueReq",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/conApy" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:35
    def personOrder: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personOrder",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
          }
        
        }
      """
    )
  
    // @LINE:41
    def delRefuseReq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.delRefuseReq",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/delRef" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:25
    def addToAdminDealList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.addToAdminDealList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subReq"})
        }
      """
    )
  
    // @LINE:23
    def logOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.logOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "giveUp"})
        }
      """
    )
  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:9
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
