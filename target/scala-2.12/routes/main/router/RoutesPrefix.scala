
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/seed/conf/routes
// @DATE:Fri Feb 02 11:08:54 CST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
