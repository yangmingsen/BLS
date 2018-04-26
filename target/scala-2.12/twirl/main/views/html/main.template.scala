
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

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,Html,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*3.1*/("""<html xmlns="http://www.w3.org/1999/xhtml">

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <title>"""),_display_(/*8.17*/title),format.raw/*8.22*/("""</title>

    </head>

    <body>

            <!--顶部导航条 -->
        <div class="hmtop">
            <div class="am-container header">
                <ul class="message-l">
                    <div class="topMessage">

                    """),_display_(/*20.22*/request/*20.29*/.session.get("userName")/*20.53*/ match/*20.59*/ {/*21.25*/case Some(user) =>/*21.43*/ {_display_(Seq[Any](format.raw/*21.45*/("""
                            """),format.raw/*22.29*/("""<div class="menu-hd">
                                <a href="###" target="_top" class="h">学生:"""),_display_(/*23.75*/user),format.raw/*23.79*/("""</a>
                            </div>
                        """)))}/*26.25*/case None =>/*26.37*/ {_display_(Seq[Any](format.raw/*26.39*/("""
                            """),format.raw/*27.29*/("""<div class="menu-hd">
                                <a href=""""),_display_(/*28.43*/routes/*28.49*/.Applications.login()),format.raw/*28.70*/("""" target="_top" class="h">你好！请登录</a>
                            </div>
                        """)))}}),format.raw/*31.22*/("""

                    """),format.raw/*33.21*/("""</div>
                </ul>
                <ul class="message-r">
                    <div class="topMessage home">
                        <div class="menu-hd"><a href=""""),_display_(/*37.56*/routes/*37.62*/.Applications.index()),format.raw/*37.83*/("""" target="_top" class="h">首页</a></div>
                    </div>
                    <div class="topMessage my-shangcheng">
                        <div class="menu-hd MyShangcheng"><a href="/person" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
                    </div>
                    <div class="topMessage mini-cart">
                        <div class="menu-hd"><a id="mc-menu-hd" href=""""),_display_(/*43.72*/routes/*43.78*/.Applications.showCart()),format.raw/*43.102*/("""" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>喜欢</span><strong id="J_MiniCartNum" class="h"></strong></a></div>
                    </div>
                    <div class="topMessage favorite">
                        <div class="menu-hd"><a href=""""),_display_(/*46.56*/routes/*46.62*/.Applications.logOut()),format.raw/*46.84*/("""" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>退出</span></a></div>
                    </div>
                    <div class="topMessage favorite">
                        <div class="menu-hd"><a href="https://github.com/yangmingsen/BLS" target="_blank"><i class="am-icon-heart am-icon-fw"></i><span>源码</span></a></div>
                    </div>
                </ul>
            </div>
            <div class="nav white">

                <div class="logoBig">
                    <li><img src="/assets/add/img/logo.png" /></li>
                </div>

                <div class="search-bar pr">
                    <a name="index_none_header_sysc" href="#"></a>

                    """),_display_(/*62.22*/helper/*62.28*/.form(action=routes.Applications.search())/*62.70*/{_display_(Seq[Any](format.raw/*62.71*/("""
                        """),format.raw/*63.25*/("""<input id="searchInput" name="key" type="text"  placeholder="搜索" autocomplete="off">
                        <input id="ai-topsearch" class="submit am-btn"  value="搜索" index="1" type="submit">
                        """)))}),format.raw/*65.26*/("""

                """),format.raw/*67.17*/("""</div>
            </div>
            <div class="clear"></div>
        </div>

        """),_display_(/*72.10*/content),format.raw/*72.17*/("""

        """),format.raw/*74.9*/("""<script type="text/javascript " src="/assets/basic/js/quick_links.js "></script>
        <link rel="stylesheet" href="/assets/add/css/base.css">
    </body>
</html>

"""))
      }
    }
  }

  def render(title:String,content:Html,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(request)

  def f:((String) => (Html) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (request) => apply(title)(content)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Apr 26 13:41:02 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/main.scala.html
                  HASH: 891120e153e7f4ab02f02c59ba90313d50a7ac50
                  MATRIX: 747->1|905->64|933->66|1244->351|1269->356|1537->597|1553->604|1586->628|1601->634|1612->661|1639->679|1679->681|1736->710|1859->806|1884->810|1968->900|1989->912|2029->914|2086->943|2177->1007|2192->1013|2234->1034|2363->1153|2413->1175|2613->1348|2628->1354|2670->1375|3119->1797|3134->1803|3180->1827|3480->2100|3495->2106|3538->2128|4268->2831|4283->2837|4334->2879|4373->2880|4426->2905|4675->3123|4721->3141|4837->3230|4865->3237|4902->3247
                  LINES: 21->1|26->1|28->3|33->8|33->8|45->20|45->20|45->20|45->20|45->21|45->21|45->21|46->22|47->23|47->23|49->26|49->26|49->26|50->27|51->28|51->28|51->28|53->31|55->33|59->37|59->37|59->37|65->43|65->43|65->43|68->46|68->46|68->46|84->62|84->62|84->62|84->62|85->63|87->65|89->67|94->72|94->72|96->74
                  -- GENERATED --
              */
          