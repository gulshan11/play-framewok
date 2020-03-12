
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.data._
import play.core.j.PlayFormsMagicForJava._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.2*/main("Hello")/*2.15*/ {_display_(Seq[Any](format.raw/*2.17*/("""
  """),format.raw/*3.3*/("""<section id="content">
    <div class="wrapper doc">
      <article>
        <h1>Hello """),_display_(/*6.20*/name),format.raw/*6.24*/("""</h1>
      </article>  
      <!-- <aside>
        """),_display_(/*9.10*/commonSidebar()),format.raw/*9.25*/("""
      """),format.raw/*10.7*/("""</aside> -->
    </div>
  </section>
""")))}))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-03-12T11:07:15.494
                  SOURCE: /home/gulshan/Documents/projects/rockwell_airport/collins2020/simulator/examples/hello-world/app/views/hello.scala.html
                  HASH: 957c865b9b5f55e6543733378d3ed2d2067bb9ca
                  MATRIX: 908->1|1016->17|1037->30|1076->32|1105->35|1219->123|1243->127|1322->180|1357->195|1391->202
                  LINES: 27->1|32->2|32->2|32->2|33->3|36->6|36->6|39->9|39->9|40->10
                  -- GENERATED --
              */
          