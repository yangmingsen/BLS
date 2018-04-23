
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
                                <a href="###" target="_top" class="h">亲爱的..."""),_display_(/*22.78*/user),format.raw/*22.82*/("""</a>
                            </div>
                        """)))}/*25.25*/case None =>/*25.37*/ {_display_(Seq[Any](format.raw/*25.39*/("""
                            """),format.raw/*26.29*/("""<div class="menu-hd">
                                <a href=""""),_display_(/*27.43*/routes/*27.49*/.Applications.login()),format.raw/*27.70*/("""" target="_top" class="h">你好！请登录</a>
                                <a href="######" target="_top">免费注册</a>
                            </div>
                         """)))}}),format.raw/*31.22*/("""


                """),format.raw/*34.17*/("""</div>
            </ul>
            <ul class="message-r">
                <div class="topMessage home">
                    <div class="menu-hd"><a href=""""),_display_(/*38.52*/routes/*38.58*/.Applications.index()),format.raw/*38.79*/("""" target="_top" class="h">首页</a></div>
                </div>
                <div class="topMessage my-shangcheng">
                    <div class="menu-hd MyShangcheng"><a href="/person" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
                </div>
                <div class="topMessage mini-cart">
                    <div class="menu-hd"><a id="mc-menu-hd" href=""""),_display_(/*44.68*/routes/*44.74*/.Applications.showCart()),format.raw/*44.98*/("""" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>喜欢</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
                </div>
                <div class="topMessage favorite">
                    <div class="menu-hd"><a href=""""),_display_(/*47.52*/routes/*47.58*/.Applications.logOut()),format.raw/*47.80*/("""" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>退出</span></a></div>
            </ul>
        </div>

            <!--悬浮搜索框-->

        <div class="nav white">
            <div class="logo"><img src="/assets/images/logo.png" /></div>
            <div class="logoBig">
                <li><img src="/assets/images/logobig.png" /></li>
            </div>

            <div class="search-bar pr">
                <a name="index_none_header_sysc" href="#"></a>

                        """),_display_(/*62.26*/helper/*62.32*/.form(action=routes.Applications.search())/*62.74*/{_display_(Seq[Any](format.raw/*62.75*/("""
                            """),format.raw/*63.29*/("""<input id="searchInput" name="key" type="text"  placeholder="搜索" autocomplete="off">
                            <input id="ai-topsearch" class="submit am-btn"  value="搜索" index="1" type="submit">
                        """)))}),format.raw/*65.26*/("""

            """),format.raw/*67.13*/("""</div>
        </div>
        <div class="clear"></div>
        """),format.raw/*70.33*/("""

        """),_display_(/*72.10*/content),format.raw/*72.17*/("""
        
        """),format.raw/*74.9*/("""<script>
                    window.jQuery || document.write('<script src="basic/js/jquery.min.js "><\/script>');
            </script>
        <script type="text/javascript " src="../basic/js/quick_links.js "></script>

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
                  DATE: Mon Apr 23 10:11:52 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/main.scala.html
                  HASH: f39cfe995278f654f9dbaab69c8a3f5d3553cebb
                  MATRIX: 747->1|905->64|933->66|1244->351|1269->356|1497->557|1513->564|1546->588|1561->594|1572->621|1599->639|1639->641|1696->670|1822->769|1847->773|1931->863|1952->875|1992->877|2049->906|2140->970|2155->976|2197->997|2399->1189|2446->1208|2630->1365|2645->1371|2687->1392|3112->1790|3127->1796|3172->1820|3461->2082|3476->2088|3519->2110|4043->2607|4058->2613|4109->2655|4148->2656|4205->2685|4458->2907|4500->2921|4592->3009|4630->3020|4658->3027|4703->3045
                  LINES: 21->1|26->1|28->3|33->8|33->8|44->19|44->19|44->19|44->19|44->20|44->20|44->20|45->21|46->22|46->22|48->25|48->25|48->25|49->26|50->27|50->27|50->27|53->31|56->34|60->38|60->38|60->38|66->44|66->44|66->44|69->47|69->47|69->47|84->62|84->62|84->62|84->62|85->63|87->65|89->67|92->70|94->72|94->72|96->74
                  -- GENERATED --
              */
          