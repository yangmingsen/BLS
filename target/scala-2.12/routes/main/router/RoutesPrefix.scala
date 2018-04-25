
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/yms/Documents/Play2.x/BLS/conf/routes
// @DATE:Wed Apr 25 22:25:37 CST 2018


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
