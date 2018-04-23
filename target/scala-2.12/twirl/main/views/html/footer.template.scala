
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
  def apply/*2.2*/()(content: Html)(implicit requestHeader: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.58*/("""


"""),_display_(/*5.2*/content),format.raw/*5.9*/("""

"""),format.raw/*7.1*/("""<div class="footer ">
    <div class="footer-hd ">
        <p>
            <a href="# ">恒望科技</a>
            <b>|</b>
            <a href=""""),_display_(/*12.23*/routes/*12.29*/.Applications.index()),format.raw/*12.50*/(""" """),format.raw/*12.51*/("""">商城首页</a>
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
                  DATE: Sat Apr 07 15:17:01 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/footer.scala.html
                  HASH: 4fd7a56e7ba6b076b2baf6f7ec58b4749e1618a6
                  MATRIX: 742->2|893->58|922->62|948->69|976->71|1143->211|1158->217|1200->238|1229->239
                  LINES: 21->2|26->2|29->5|29->5|31->7|36->12|36->12|36->12|36->12
                  -- GENERATED --
              */
          