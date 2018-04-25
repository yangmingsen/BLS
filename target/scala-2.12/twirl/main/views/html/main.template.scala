
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
        <div class="am-container header">
            <ul class="message-l">
                <div class="topMessage">

                    """),_display_(/*19.22*/request/*19.29*/.session.get("userName")/*19.53*/ match/*19.59*/ {/*20.25*/case Some(user) =>/*20.43*/ {_display_(Seq[Any](format.raw/*20.45*/("""
                            """),format.raw/*21.29*/("""<div class="menu-hd">
                                <a href="###" target="_top" class="h">学生:"""),_display_(/*22.75*/user),format.raw/*22.79*/("""</a>
                            </div>
                        """)))}/*25.25*/case None =>/*25.37*/ {_display_(Seq[Any](format.raw/*25.39*/("""
                            """),format.raw/*26.29*/("""<div class="menu-hd">
                                <a href=""""),_display_(/*27.43*/routes/*27.49*/.Applications.login()),format.raw/*27.70*/("""" target="_top" class="h">你好！请登录</a>
                            </div>
                         """)))}}),format.raw/*30.22*/("""


                """),format.raw/*33.17*/("""</div>
            </ul>
            <ul class="message-r">
                <div class="topMessage home">
                    <div class="menu-hd"><a href=""""),_display_(/*37.52*/routes/*37.58*/.Applications.index()),format.raw/*37.79*/("""" target="_top" class="h">首页</a></div>
                </div>
                <div class="topMessage my-shangcheng">
                    <div class="menu-hd MyShangcheng"><a href="/person" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
                </div>
                <div class="topMessage mini-cart">
                    <div class="menu-hd"><a id="mc-menu-hd" href=""""),_display_(/*43.68*/routes/*43.74*/.Applications.showCart()),format.raw/*43.98*/("""" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>喜欢</span><strong id="J_MiniCartNum" class="h"></strong></a></div>
                </div>
                <div class="topMessage favorite">
                    <div class="menu-hd"><a href=""""),_display_(/*46.52*/routes/*46.58*/.Applications.logOut()),format.raw/*46.80*/("""" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>退出</span></a></div>
                </div>
                <div class="topMessage favorite">
                    <div class="menu-hd"><a href="https://github.com/yangmingsen/BLS" target="_blank"><i class="am-icon-heart am-icon-fw"></i><span>源码</span></a></div>
                </div>
            </ul>
        </div>

            <!--悬浮搜索框-->

        <div class="nav white">
            <div class="logo"><img src="/assets/add/img/cllogo.png" /></div>
            <div class="logoBig">
                <li><img src="/assets/add/img/cllogo.png" /></li>
            </div>

            <div class="search-bar pr">
                <a name="index_none_header_sysc" href="#"></a>

                        """),_display_(/*65.26*/helper/*65.32*/.form(action=routes.Applications.search())/*65.74*/{_display_(Seq[Any](format.raw/*65.75*/("""
                            """),format.raw/*66.29*/("""<input id="searchInput" name="key" type="text"  placeholder="搜索" autocomplete="off">
                            <input id="ai-topsearch" class="submit am-btn"  value="搜索" index="1" type="submit">
                        """)))}),format.raw/*68.26*/("""

            """),format.raw/*70.13*/("""</div>
        </div>
        <div class="clear"></div>
        """),format.raw/*73.33*/("""

        """),_display_(/*75.10*/content),format.raw/*75.17*/("""


    """),format.raw/*78.5*/("""</body>
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
                  DATE: Wed Apr 25 18:56:59 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/main.scala.html
                  HASH: 30acc5371d5974b4a66f34c88396ff59c804a0ca
                  MATRIX: 747->1|905->64|933->66|1244->351|1269->356|1497->557|1513->564|1546->588|1561->594|1572->621|1599->639|1639->641|1696->670|1819->766|1844->770|1928->860|1949->872|1989->874|2046->903|2137->967|2152->973|2194->994|2324->1114|2371->1133|2555->1290|2570->1296|2612->1317|3037->1715|3052->1721|3097->1745|3385->2006|3400->2012|3443->2034|4234->2798|4249->2804|4300->2846|4339->2847|4396->2876|4649->3098|4691->3112|4783->3200|4821->3211|4849->3218|4883->3225
                  LINES: 21->1|26->1|28->3|33->8|33->8|44->19|44->19|44->19|44->19|44->20|44->20|44->20|45->21|46->22|46->22|48->25|48->25|48->25|49->26|50->27|50->27|50->27|52->30|55->33|59->37|59->37|59->37|65->43|65->43|65->43|68->46|68->46|68->46|87->65|87->65|87->65|87->65|88->66|90->68|92->70|95->73|97->75|97->75|100->78
                  -- GENERATED --
              */
          