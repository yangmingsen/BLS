
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Tue May 01 10:16:44 CST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:5
package controllers.javascript {

  // @LINE:60
  class ReverseAdmin(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:84
    def getClientRetBookReq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.getClientRetBookReq",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/cliRetReq"})
        }
      """
    )
  
    // @LINE:62
    def refusePass: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.refusePass",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "refReq" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:64
    def agreClientReturnBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.agreClientReturnBook",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/retSuc" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:72
    def main: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.main",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/main"})
        }
      """
    )
  
    // @LINE:70
    def left: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.left",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/left"})
        }
      """
    )
  
    // @LINE:76
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/login"})
        }
      """
    )
  
    // @LINE:86
    def getClientHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.getClientHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/hisAll"})
        }
      """
    )
  
    // @LINE:68
    def head: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.head",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/head"})
        }
      """
    )
  
    // @LINE:60
    def checkPass: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.checkPass",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "agrReq" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:78
    def agreeList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.agreeList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/arelt"})
        }
      """
    )
  
    // @LINE:80
    def adminLogOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.adminLogOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/eixt"})
        }
      """
    )
  
    // @LINE:66
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
    // @LINE:82
    def getRefuseByAdminList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.getRefuseByAdminList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/refCliReq"})
        }
      """
    )
  
    // @LINE:74
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Admin.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/login"})
        }
      """
    )
  
  }

  // @LINE:90
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:90
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

  
    // @LINE:39
    def personIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
    // @LINE:41
    def personBorrowHistory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personBorrowHistory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/hisy"})
        }
      """
    )
  
    // @LINE:23
    def addCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.addCart",
      """
        function(id0,title1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Cart/add" + _qS([(id0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)), (title1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("title", title1))])})
        }
      """
    )
  
    // @LINE:9
    def search: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.search",
      """
        function(key0,page1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "search" + _qS([(key0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("key", key0)), (page1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("page", page1))])})
        }
      """
    )
  
    // @LINE:55
    def personReturnBookReq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personReturnBookReq",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/retBoReq" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:21
    def introdution: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.introdution",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "introdution/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:31
    def subSuccessful: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.subSuccessful",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subSuc"})
        }
      """
    )
  
    // @LINE:33
    def delCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.delCart",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delCart" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:43
    def personBorrowList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personBorrowList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/borlis"})
        }
      """
    )
  
    // @LINE:11
    def searchNew: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.searchNew",
      """
        function(key0,page1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "searchN" + _qS([(key0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("key", key0)), (page1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("page", page1))])})
        }
      """
    )
  
    // @LINE:25
    def showCart: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.showCart",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cart"})
        }
      """
    )
  
    // @LINE:45
    def personChecking: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personChecking",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/chec"})
        }
      """
    )
  
    // @LINE:15
    def doLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.doLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:53
    def continueReq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.continueReq",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/conApy" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:51
    def delRefuseReq: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.delRefuseReq",
      """
        function(userid0,bookid1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/delRef" + _qS([(userid0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("userid", userid0)), (bookid1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Long]].javascriptUnbind + """)("bookid", bookid1))])})
        }
      """
    )
  
    // @LINE:29
    def addToAdminDealList: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.addToAdminDealList",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "subReq"})
        }
      """
    )
  
    // @LINE:47
    def personPassed: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personPassed",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/psed"})
        }
      """
    )
  
    // @LINE:27
    def logOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.logOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "giveUp"})
        }
      """
    )
  
    // @LINE:49
    def personDisagree: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.personDisagree",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "person/disage"})
        }
      """
    )
  
    // @LINE:7
    def indexN: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Applications.indexN",
      """
        function(who0,page1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "New" + _qS([(who0 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("who", who0)), (page1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Int]].javascriptUnbind + """)("page", page1))])})
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
  
    // @LINE:13
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
