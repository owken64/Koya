
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._
/*3.2*/import views.html.helper.options
/*4.2*/import views.html.helper.CSRF


Seq[Any](format.raw/*1.37*/("""
"""),format.raw/*5.1*/("""
"""),_display_(/*6.2*/main("Welcome to Play")/*6.25*/ {_display_(Seq[Any](format.raw/*6.27*/("""
  """),format.raw/*7.3*/("""<h1>Welcome to Play!</h1>

  """),_display_(/*9.4*/helper/*9.10*/.form(action = CSRF( routes.UserController.createUser) )/*9.66*/ {_display_(Seq[Any](format.raw/*9.68*/("""
    """),format.raw/*10.5*/("""Name: <input type="text" name="name">
    Age : <input type="text" name="age">
    <input type="submit">
 """)))}),format.raw/*13.3*/("""
""")))}),format.raw/*14.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/index.scala.html
                  HASH: 0374a7cd0a3600fa12409466968280caf42b314b
                  MATRIX: 736->1|844->39|867->57|907->92|966->36|994->123|1022->126|1053->149|1092->151|1122->155|1179->187|1193->193|1257->249|1296->251|1329->257|1469->367|1502->370
                  LINES: 21->1|24->2|25->3|26->4|29->1|30->5|31->6|31->6|31->6|32->7|34->9|34->9|34->9|34->9|35->10|38->13|39->14
                  -- GENERATED --
              */
          