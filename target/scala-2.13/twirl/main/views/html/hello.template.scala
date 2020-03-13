
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


Seq[Any](format.raw/*1.16*/(""" """),_display_(/*1.18*/main("Hello")/*1.31*/ {_display_(Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""<section id="content">
	<div class="wrapper doc">
		<article>
			<h1>Hello """),_display_(/*5.15*/name),format.raw/*5.19*/("""</h1>
		</article>
		<!-- <aside>
        """),_display_(/*8.10*/commonSidebar()),format.raw/*8.25*/("""
      """),format.raw/*9.7*/("""</aside> -->
		<!-- 		<script>
			var ws = new WebSocket("ws://localhost:9000/ws");
			console.log(ws)
		</script> -->
	</div>
</section>
""")))}),format.raw/*16.2*/("""
"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-03-13T12:38:21.901
                  SOURCE: /home/gulshan/Documents/projects/rockwell_airport/collins2020/simulator/examples/hello-world/app/views/hello.scala.html
                  HASH: 58c1dc354c4590b2002e1b55fef6f782cb696e7f
                  MATRIX: 908->1|1017->15|1045->17|1066->30|1105->32|1132->33|1234->109|1258->113|1327->156|1362->171|1395->178|1564->317
                  LINES: 27->1|32->1|32->1|32->1|32->1|33->2|36->5|36->5|39->8|39->8|40->9|47->16
                  -- GENERATED --
              */
          