
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
import play.api.mvc._
import play.api.data._

object users extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[User],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(users:List[User]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Welcome to Play!</h1>

  """),_display_(/*6.4*/for(user <- users) yield /*6.22*/ {_display_(Seq[Any](format.raw/*6.24*/("""
    """),format.raw/*7.5*/("""<li><span>"""),_display_(/*7.16*/user/*7.20*/.name),format.raw/*7.25*/("""</span> <span> """),_display_(/*7.41*/user/*7.45*/.age),format.raw/*7.49*/(""" """),format.raw/*7.50*/("""</span></li>
  """)))}),format.raw/*8.4*/("""
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(users:List[User]): play.twirl.api.HtmlFormat.Appendable = apply(users)

  def f:((List[User]) => play.twirl.api.HtmlFormat.Appendable) = (users) => apply(users)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/users.scala.html
                  HASH: c8975729bb8c5fa7de7e28a99ae6742f81ae889f
                  MATRIX: 733->1|846->19|876->24|907->47|946->49|976->53|1033->85|1066->103|1105->105|1137->111|1174->122|1186->126|1211->131|1253->147|1265->151|1289->155|1317->156|1363->173|1395->176
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|31->6|32->7|32->7|32->7|32->7|32->7|32->7|32->7|32->7|33->8|34->9
                  -- GENERATED --
              */
          