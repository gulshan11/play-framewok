// @GENERATOR:play-routes-compiler
// @SOURCE:/home/gulshan/Documents/projects/rockwell_airport/collins2020/simulator/examples/hello-world/conf/routes
// @DATE:Fri Mar 13 16:06:56 IST 2020


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
