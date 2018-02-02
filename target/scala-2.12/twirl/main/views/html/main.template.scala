
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

        <title>"""),_display_(/*9.17*/title),format.raw/*9.22*/("""</title>

        <link href="/assets/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
        <link href="/assets/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

        <link href="/assets/basic/css/demo.css" rel="stylesheet" type="text/css" />

        <link href="/assets/css/seastyle.css" rel="stylesheet" type="text/css" />
        <link href="/assets/basic/css/demo.css" rel="stylesheet" type="text/css" />

        <link href="/assets/css/hmstyle.css" rel="stylesheet" type="text/css"/>
        <link href="/assets/css/skin.css" rel="stylesheet" type="text/css" />

        <script src="/assets/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
        <script src="/assets/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

        <script type="text/javascript" src="/assets/basic/js/jquery-1.7.min.js"></script>
        <script type="text/javascript" src="/assets/js/script.js"></script>
    </head>

    <body>

            <!--顶部导航条 -->
        <div class="am-container header">
            <ul class="message-l">
                <div class="topMessage">
                    <div class="menu-hd">
                        <a href=""""),_display_(/*36.35*/routes/*36.41*/.Applications.login()),format.raw/*36.62*/("""" target="_top" class="h">亲，请登录</a>
                        <a href=""""),_display_(/*37.35*/routes/*37.41*/.Applications.register()),format.raw/*37.65*/("""" target="_top">免费注册</a>
                    </div>
                </div>
            </ul>
            <ul class="message-r">
                <div class="topMessage home">
                    <div class="menu-hd"><a href=""""),_display_(/*43.52*/routes/*43.58*/.Applications.index()),format.raw/*43.79*/("""" target="_top" class="h">商城首页</a></div>
                </div>
                <div class="topMessage my-shangcheng">
                    <div class="menu-hd MyShangcheng"><a href="#" target="_top"><i class="am-icon-user am-icon-fw"></i>个人中心</a></div>
                </div>
                <div class="topMessage mini-cart">
                    <div class="menu-hd"><a id="mc-menu-hd" href="#" target="_top"><i class="am-icon-shopping-cart  am-icon-fw"></i><span>购物车</span><strong id="J_MiniCartNum" class="h">0</strong></a></div>
                </div>
                <div class="topMessage favorite">
                    <div class="menu-hd"><a href="#" target="_top"><i class="am-icon-heart am-icon-fw"></i><span>收藏夹</span></a></div>
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

                        """),_display_(/*67.26*/helper/*67.32*/.form(action=routes.Applications.search())/*67.74*/{_display_(Seq[Any](format.raw/*67.75*/("""
                            """),format.raw/*68.29*/("""<input id="searchInput" name="key" type="text" placeholder="搜索" autocomplete="off">
                            <input id="ai-topsearch" class="submit am-btn"  value="搜索" index="1" type="submit">
                        """)))}),format.raw/*70.26*/("""

            """),format.raw/*72.13*/("""</div>
        </div>

        """),_display_(/*75.10*/content),format.raw/*75.17*/("""

        """),format.raw/*77.9*/("""<div class="footer ">
            <div class="footer-hd ">
                <p>
                    <a href="# ">恒望科技</a>
                    <b>|</b>
                    <a href=""""),_display_(/*82.31*/routes/*82.37*/.Applications.index()),format.raw/*82.58*/(""" """),format.raw/*82.59*/("""">商城首页</a>
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


            <!--引导 -->
        <div class="navCir">
            <li class="active"><a href="home.html"><i class="am-icon-home "></i>首页</a></li>
            <li><a href="sort.html"><i class="am-icon-list"></i>分类</a></li>
            <li><a href="shopcart.html"><i class="am-icon-shopping-basket"></i>购物车</a></li>
            <li><a href="../person/index.html"><i class="am-icon-user"></i>我的</a></li>
        </div>


            <!--菜单 -->
        <div class=tip>
            <div id="sidebar">
                <div id="wrap">
                    <div id="prof" class="item ">
                        <a href="# ">
                            <span class="setting "></span>
                        </a>
                        <div class="ibar_login_box status_login ">
                            <div class="avatar_box ">
                                <p class="avatar_imgbox "><img src="/assets/images/no-img_mid_.jpg " /></p>
                                <ul class="user_info ">
                                    <li>用户名sl1903</li>
                                    <li>级&nbsp;别普通会员</li>
                                </ul>
                            </div>
                            <div class="login_btnbox ">
                                <a href="# " class="login_order ">我的订单</a>
                                <a href="# " class="login_favorite ">我的收藏</a>
                            </div>
                            <i class="icon_arrow_white "></i>
                        </div>

                    </div>
                    <div id="shopCart " class="item ">
                        <a href="# ">
                            <span class="message "></span>
                        </a>
                        <p>
							购物车
                        </p>
                        <p class="cart_num ">0</p>
                    </div>
                    <div id="asset " class="item ">
                        <a href="# ">
                            <span class="view "></span>
                        </a>
                        <div class="mp_tooltip ">
							我的资产
                            <i class="icon_arrow_right_black "></i>
                        </div>
                    </div>

                    <div id="foot " class="item ">
                        <a href="# ">
                            <span class="zuji "></span>
                        </a>
                        <div class="mp_tooltip ">
							我的足迹
                            <i class="icon_arrow_right_black "></i>
                        </div>
                    </div>

                    <div id="brand " class="item ">
                        <a href="#">
                            <span class="wdsc "><img src="/assets/images/wdsc.png " /></span>
                        </a>
                        <div class="mp_tooltip ">
							我的收藏
                            <i class="icon_arrow_right_black "></i>
                        </div>
                    </div>

                    <div id="broadcast " class="item ">
                        <a href="# ">
                            <span class="chongzhi "><img src="/assets/images/chongzhi.png " /></span>
                        </a>
                        <div class="mp_tooltip ">
							我要充值
                            <i class="icon_arrow_right_black "></i>
                        </div>
                    </div>

                    <div class="quick_toggle ">
                        <li class="qtitem ">
                            <a href="# "><span class="kfzx "></span></a>
                            <div class="mp_tooltip ">客服中心<i class="icon_arrow_right_black "></i></div>
                        </li>
                            <!--二维码 -->
                        <li class="qtitem ">
                            <a href="#none "><span class="mpbtn_qrcode "></span></a>
                            <div class="mp_qrcode " style="display:none; "><img src="/assets/images/weixin_code_145.png " /><i class="icon_arrow_white "></i></div>
                        </li>
                        <li class="qtitem ">
                            <a href="#top " class="return_top "><span class="top "></span></a>
                        </li>
                    </div>

                        <!--回到顶部 -->
                    <div id="quick_links_pop " class="quick_links_pop hide "></div>

                </div>

            </div>
            <div id="prof-content " class="nav-content ">
                <div class="nav-con-close ">
                    <i class="am-icon-angle-right am-icon-fw "></i>
                </div>
                <div>
					我
                </div>
            </div>
            <div id="shopCart-content " class="nav-content ">
                <div class="nav-con-close ">
                    <i class="am-icon-angle-right am-icon-fw "></i>
                </div>
                <div>
					购物车
                </div>
            </div>
            <div id="asset-content " class="nav-content ">
                <div class="nav-con-close ">
                    <i class="am-icon-angle-right am-icon-fw "></i>
                </div>
                <div>
					资产
                </div>

                <div class="ia-head-list ">
                    <a href="# " target="_blank " class="pl ">
                        <div class="num ">0</div>
                        <div class="text ">优惠券</div>
                    </a>
                    <a href="# " target="_blank " class="pl ">
                        <div class="num ">0</div>
                        <div class="text ">红包</div>
                    </a>
                    <a href="# " target="_blank " class="pl money ">
                        <div class="num ">￥0</div>
                        <div class="text ">余额</div>
                    </a>
                </div>

            </div>
            <div id="foot-content " class="nav-content ">
                <div class="nav-con-close ">
                    <i class="am-icon-angle-right am-icon-fw "></i>
                </div>
                <div>
					足迹
                </div>
            </div>
            <div id="brand-content " class="nav-content ">
                <div class="nav-con-close ">
                    <i class="am-icon-angle-right am-icon-fw "></i>
                </div>
                <div>
					收藏
                </div>
            </div>
            <div id="broadcast-content " class="nav-content ">
                <div class="nav-con-close ">
                    <i class="am-icon-angle-right am-icon-fw "></i>
                </div>
                <div>
					充值
                </div>
            </div>
        </div>
        <script>
			window.jQuery || document.write('<script src="basic/js/jquery.min.js "><\/script>');
		</script>
        <script type="text/javascript " src="../basic/js/quick_links.js "></script>
    </body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)(request)

  def f:((String) => (Html) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => (request) => apply(title)(content)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Feb 02 11:32:31 CST 2018
                  SOURCE: /home/yms/seed/app/views/main.scala.html
                  HASH: 6a05bf75936a108b29e94d1ba3bb67d0716685bd
                  MATRIX: 747->1|905->64|933->66|1245->352|1270->357|2490->1550|2505->1556|2547->1577|2644->1647|2659->1653|2704->1677|2956->1902|2971->1908|3013->1929|4195->3084|4210->3090|4261->3132|4300->3133|4357->3162|4609->3383|4651->3397|4710->3429|4738->3436|4775->3446|4982->3626|4997->3632|5039->3653|5068->3654
                  LINES: 21->1|26->1|28->3|34->9|34->9|61->36|61->36|61->36|62->37|62->37|62->37|68->43|68->43|68->43|92->67|92->67|92->67|92->67|93->68|95->70|97->72|100->75|100->75|102->77|107->82|107->82|107->82|107->82
                  -- GENERATED --
              */
          