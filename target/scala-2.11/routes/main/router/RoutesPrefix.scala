
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/OL4ik/Desktop/project2/conf/routes
// @DATE:Thu Jun 09 12:37:17 EEST 2016


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
