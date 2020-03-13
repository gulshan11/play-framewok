
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* * This template is called from the `index` template. This template *
handles the rendering of the page header and body tags. It takes * two
arguments, a `String` for the title of the page and an `Html` * object
to insert into the body of the page. */
  def apply/*4.42*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.1*/("""
"""),format.raw/*6.1*/("""<!DOCTYPE html>
<html lang="en">

<head>
<title>"""),_display_(/*10.9*/title),format.raw/*10.14*/("""</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" media="screen"
	href='"""),_display_(/*13.9*/routes/*13.15*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.56*/("""'>
<link rel="stylesheet" media="screen"
	href='"""),_display_(/*15.9*/routes/*15.15*/.Assets.versioned("stylesheets/prism.css")),format.raw/*15.57*/("""'>
<link rel="shortcut icon" type="image/png"
	href='"""),_display_(/*17.9*/routes/*17.15*/.Assets.versioned("images/favicon.png")),format.raw/*17.54*/("""'>
<script src='"""),_display_(/*18.15*/routes/*18.21*/.Assets.versioned("javascripts/hello.js")),format.raw/*18.62*/("""'
	type="text/javascript"></script>
<script src='"""),_display_(/*20.15*/routes/*20.21*/.Assets.versioned("javascripts/prism.js")),format.raw/*20.62*/("""'
	type="text/javascript"></script>
</head>

<body>
	<section id="top">
		<div class="wrapper">
			<img class="resize" src="assets/images/play_icon_reverse.svg"
				alt="logo" />
			<h1>Play Hello World Web Tutorial</h1>
		</div>
	</section>
	"""),_display_(/*32.3*/content),format.raw/*32.10*/("""
"""),format.raw/*33.1*/("""</body>

</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-03-13T12:16:04.099
                  SOURCE: /home/gulshan/Documents/projects/rockwell_airport/collins2020/simulator/examples/hello-world/app/views/main.scala.html
                  HASH: 78a1b955928d284011bc97e5debdffaa2aecd4f5
                  MATRIX: 1162->255|1286->286|1313->287|1388->336|1414->341|1566->467|1581->473|1643->514|1718->563|1733->569|1796->611|1876->665|1891->671|1951->710|1995->727|2010->733|2072->774|2149->824|2164->830|2226->871|2496->1115|2524->1122|2552->1123
                  LINES: 30->4|35->5|36->6|40->10|40->10|43->13|43->13|43->13|45->15|45->15|45->15|47->17|47->17|47->17|48->18|48->18|48->18|50->20|50->20|50->20|62->32|62->32|63->33
                  -- GENERATED --
              */
          