
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

     object index_Scope1 {
import java.util

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[util.List[Fruit],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(fruits: util.List[Fruit]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.28*/("""

"""),_display_(/*4.2*/main("Application")/*4.21*/ {_display_(Seq[Any](format.raw/*4.23*/("""
    """),format.raw/*5.5*/("""<nav class="navbar navbar-inverse navbar-fixed-top">
        <div class="container">
            <div class="navbar-header">
                <a class="navbar-brand" href=" ">Application</a>
            </div>
            <div id="navbar" class="navbar-collapse collapse">
            </div>
        </div>
    </nav>
    <div class="jumbotron">
        <div class="container">
            <h2>Information</h2>
           <p>This chapter has been dense, and we saw a lot. We learned how to handle user input—
               from a simple form submission to a more complex file submission. We also learned
               how all this was possible through the use of body parsers. We saw in detail how the
               Play binding process transforms user-submitted data into data that our application
               can understand.</p>
        </div>
    </div>
    <div class="container">
              <h2>StorehouseFruits</h2>
               <table class="table table-striped">
            <thead>
                <tr>
                    <th>id</th>
                    <th>name</th>
                    <th>sum</th>
                    <th></th>
                </tr>
            </thead>
<tbody>
"""),_display_(/*36.2*/for(fruit <- fruits) yield /*36.22*/ {_display_(Seq[Any](format.raw/*36.24*/("""
    """),format.raw/*37.5*/("""<tr>
        <td><a href=""""),_display_(/*38.23*/routes/*38.29*/.Application.index()),format.raw/*38.49*/("""">"""),_display_(/*38.52*/fruit/*38.57*/.id),format.raw/*38.60*/("""</a></td>
        <td><a href=""""),_display_(/*39.23*/routes/*39.29*/.Application.index()),format.raw/*39.49*/("""">"""),_display_(/*39.52*/fruit/*39.57*/.name),format.raw/*39.62*/("""</a></td>
        <td><a href=""""),_display_(/*40.23*/routes/*40.29*/.Application.index()),format.raw/*40.49*/("""">"""),_display_(/*40.52*/fruit/*40.57*/.sum),format.raw/*40.61*/("""</a></td>
    </tr>
""")))}),format.raw/*42.2*/("""
            """),format.raw/*43.13*/("""</tbody>
        </table>
    </div>
""")))}),format.raw/*46.2*/("""

"""))
      }
    }
  }

  def render(fruits:util.List[Fruit]): play.twirl.api.HtmlFormat.Appendable = apply(fruits)

  def f:((util.List[Fruit]) => play.twirl.api.HtmlFormat.Appendable) = (fruits) => apply(fruits)

  def ref: this.type = this

}


}
}

/**/
object index extends index_Scope0.index_Scope1.index
              /*
                  -- GENERATED --
                  DATE: Thu Jun 09 14:07:01 EEST 2016
                  SOURCE: C:/Users/OL4ik/Desktop/project2/app/views/index.scala.html
                  HASH: 72d08c27f5f38b8fa7cb9f27b7534e200fed803a
                  MATRIX: 800->19|921->45|949->48|976->67|1015->69|1046->74|2275->1277|2311->1297|2351->1299|2383->1304|2437->1331|2452->1337|2493->1357|2523->1360|2537->1365|2561->1368|2620->1400|2635->1406|2676->1426|2706->1429|2720->1434|2746->1439|2805->1471|2820->1477|2861->1497|2891->1500|2905->1505|2930->1509|2981->1530|3022->1543|3090->1581
                  LINES: 30->2|35->2|37->4|37->4|37->4|38->5|69->36|69->36|69->36|70->37|71->38|71->38|71->38|71->38|71->38|71->38|72->39|72->39|72->39|72->39|72->39|72->39|73->40|73->40|73->40|73->40|73->40|73->40|75->42|76->43|79->46
                  -- GENERATED --
              */
          