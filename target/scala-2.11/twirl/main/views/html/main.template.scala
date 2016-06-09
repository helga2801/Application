
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html lang="en">
    <head>
     <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <title>"""),_display_(/*11.17*/title),format.raw/*11.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*12.59*/routes/*12.65*/.Assets.at("images/favicon.png")),format.raw/*12.97*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.at("lib/bootstrap/css/bootstrap.css")),format.raw/*13.105*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*14.54*/routes/*14.60*/.Assets.at("stylesheets/main.css")),format.raw/*14.94*/("""">
        <script type='text/javascript' src='"""),_display_(/*15.46*/routes/*15.52*/.Assets.at("javascripts/index.js")),format.raw/*15.86*/("""'></script>
            <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    </head>
    <body>
        """),_display_(/*22.10*/content),format.raw/*22.17*/("""
        """),format.raw/*23.9*/("""<script src=""""),_display_(/*23.23*/routes/*23.29*/.Assets.at("lib/jquery/jquery.js")),format.raw/*23.63*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*24.23*/routes/*24.29*/.Assets.at("lib/bootstrap/js/bootstrap.js")),format.raw/*24.72*/("""" type="text/javascript"></script>

    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Jun 09 00:26:44 EEST 2016
                  SOURCE: C:/Users/OL4ik/Desktop/project2/app/views/main.scala.html
                  HASH: ed145933672d59eda8ddbccd2fc8d07676244fbd
                  MATRIX: 748->1|873->31|901->33|1157->262|1183->267|1277->334|1292->340|1345->372|1428->428|1443->434|1510->479|1593->535|1608->541|1663->575|1738->623|1753->629|1808->663|2094->922|2122->929|2158->938|2199->952|2214->958|2269->992|2353->1049|2368->1055|2432->1098
                  LINES: 27->1|32->1|34->3|42->11|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24
                  -- GENERATED --
              */
          