
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

object footer extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Html,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(content: Html)(implicit requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.58*/("""


"""),_display_(/*4.2*/content),format.raw/*4.9*/("""

"""),format.raw/*6.1*/("""<div class="footer ">
    <div class="footer-hd ">
        <p>
            <a href="# ">恒望科技</a>
            <b>|</b>
            <a href=""""),_display_(/*11.23*/routes/*11.29*/.Applications.index()),format.raw/*11.50*/(""" """),format.raw/*11.51*/("""">商城首页</a>
            <b>|</b>
            <a href="# ">支付宝</a>
            <b>|</b>
            <a href="# ">物流</a>
        </p>
    </div>
    <div class="footer-bd ">
        <p>
            <a href="# ">关于恒望</a>
            <a href="# ">合作伙伴</a>
            <a href="# ">联系我们</a>
            <a href="# ">网站地图</a>
            <em>© 2015-2025 Hengwang.com 版权所有. 更多模板 <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></em>
        </p>
    </div>
</div>
</body>
</html>"""))
      }
    }
  }

  def render(content:Html,requestHeader:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(content)(requestHeader)

  def f:(() => (Html) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (content) => (requestHeader) => apply()(content)(requestHeader)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 02 11:32:31 CST 2018
                  SOURCE: /home/yms/seed/app/views/footer.scala.html
                  HASH: 919b79ddab4057844dfb36ff1de6bf1a4deffa30
                  MATRIX: 742->1|893->57|922->61|948->68|976->70|1143->210|1158->216|1200->237|1229->238
                  LINES: 21->1|26->1|29->4|29->4|31->6|36->11|36->11|36->11|36->11
                  -- GENERATED --
              */
          