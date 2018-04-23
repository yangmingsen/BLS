
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

object login extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/footer()/*3.10*/{_display_(Seq[Any](format.raw/*3.11*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>

    <head lang="en">
        <meta charset="UTF-8">
        <title>登录</title>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <meta name="format-detection" content="telephone=no">
        <meta name="renderer" content="webkit">
        <meta http-equiv="Cache-Control" content="no-siteapp" />

        <link rel="stylesheet" href="/assets/AmazeUI-2.4.2/assets/css/amazeui.css" />
        <link href="/assets/css/dlstyle.css" rel="stylesheet" type="text/css">
        <script src="/assets/add/js/jquery-3.3.1.min.js"></script>
    </head>

    <body>

        <div class="login-boxtitle">
            <a href="home.html"><img alt="logo" src="/assets/images/logobig.png" /></a>
        </div>

        <div class="login-banner">
            <div class="login-main">
                <div class="login-banner-bg"><span></span><img src="/assets/images/big.jpg" /></div>
                <div class="login-box">

                    <h3 class="title">登录CCWLibrary</h3>

                    <div class="clear"></div>

                    <script type="text/javascript">
                        function doLogin() """),format.raw/*37.44*/("""{"""),format.raw/*37.45*/("""
                            """),format.raw/*38.29*/("""$.ajax("""),format.raw/*38.36*/("""{"""),format.raw/*38.37*/("""
                                 """),format.raw/*39.34*/("""type: "POST",
                                dataType: "json",
                                url: "/login",
                                data: $('#form1').serialize(),
                                success: function (data) """),format.raw/*43.58*/("""{"""),format.raw/*43.59*/("""
                                     """),format.raw/*44.38*/("""var tmp = "";
                                     for( var i in data) """),format.raw/*45.58*/("""{"""),format.raw/*45.59*/("""
                                         """),format.raw/*46.42*/("""tmp +=data[i];
                                     """),format.raw/*47.38*/("""}"""),format.raw/*47.39*/("""
                                     """),format.raw/*48.38*/("""if( tmp == "0") """),format.raw/*48.54*/("""{"""),format.raw/*48.55*/("""
                                         """),format.raw/*49.42*/("""window.location.href = "/";
                                     """),format.raw/*50.38*/("""}"""),format.raw/*50.39*/(""" """),format.raw/*50.40*/("""else if( tmp == "1" ) """),format.raw/*50.62*/("""{"""),format.raw/*50.63*/("""
                                         """),format.raw/*51.42*/("""document.getElementById("txtHint").innerText = "密码错误!"
                                     """),format.raw/*52.38*/("""}"""),format.raw/*52.39*/(""" """),format.raw/*52.40*/("""else if( tmp == "2" )"""),format.raw/*52.61*/("""{"""),format.raw/*52.62*/("""
                                         """),format.raw/*53.42*/("""document.getElementById("txtHint").innerText = "该用户不存在!"
                                     """),format.raw/*54.38*/("""}"""),format.raw/*54.39*/("""
                                    """),format.raw/*55.37*/("""$("#txtHint").animate("""),format.raw/*55.59*/("""{"""),format.raw/*55.60*/("""
                                        """),format.raw/*56.41*/("""left: '+=20px'
                                    """),format.raw/*57.37*/("""}"""),format.raw/*57.38*/(""",200)
                                            .animate("""),format.raw/*58.54*/("""{"""),format.raw/*58.55*/("""
                                                """),format.raw/*59.49*/("""left: "-=20px"
                                            """),format.raw/*60.45*/("""}"""),format.raw/*60.46*/(""",200)

                                """),format.raw/*62.33*/("""}"""),format.raw/*62.34*/(""",
                                error : function () """),format.raw/*63.53*/("""{"""),format.raw/*63.54*/("""
                                    """),format.raw/*64.37*/("""document.getElementById("txtHint").innerText = "请求错误!"
                                     $("#txtHint").animate("""),format.raw/*65.60*/("""{"""),format.raw/*65.61*/("""
                                         """),format.raw/*66.42*/("""left: '+=20px'
                                     """),format.raw/*67.38*/("""}"""),format.raw/*67.39*/(""",200)
                                    .animate("""),format.raw/*68.46*/("""{"""),format.raw/*68.47*/("""
                                        """),format.raw/*69.41*/("""left: "-=20px"
                                    """),format.raw/*70.37*/("""}"""),format.raw/*70.38*/(""",200)


                                """),format.raw/*73.33*/("""}"""),format.raw/*73.34*/("""
                            """),format.raw/*74.29*/("""}"""),format.raw/*74.30*/(""");
                        """),format.raw/*75.25*/("""}"""),format.raw/*75.26*/("""
                    """),format.raw/*76.21*/("""</script>


                    """),format.raw/*79.153*/("""
                    """),format.raw/*80.21*/("""<p>提示信息: <span id="txtHint" style="font-size: 15px; color: red;position: relative;" ></span></p>
                    <form id="form1" target="_self"  >
                    <div class="login-form">

                            <div class="user-name">
                                <label for="user"><i class="am-icon-user"></i></label>
                                <input type="text" name="acct" id="user" placeholder="学号">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="pasd" id="password" placeholder="请输入密码">
                            </div>

                    </div>

                    <div class="am-cf">
                        <input  type="button" value="登 录" onclick="doLogin()" class="am-btn am-btn-primary am-btn-sm">
                    </div>
                    </form>


                    <div class="partner">
                        <h3>合作账号</h3>
                        <div class="am-btn-group">
                            <li><a href="#"><i class="am-icon-qq am-icon-sm"></i><span>QQ登录</span></a></li>
                            <li><a href="#"><i class="am-icon-weibo am-icon-sm"></i><span>微博登录</span> </a></li>
                            <li><a href="#"><i class="am-icon-weixin am-icon-sm"></i><span>微信登录</span> </a></li>
                        </div>
                    </div>

                </div>
            </div>
        </div>
""")))}),format.raw/*113.2*/("""
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
                  DATE: Sun Apr 22 21:10:16 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/login.scala.html
                  HASH: 46ee94aa067e8b87ac7d1541924188fe38b27234
                  MATRIX: 736->1|866->36|894->39|910->47|948->48|975->49|2289->1335|2318->1336|2375->1365|2410->1372|2439->1373|2501->1407|2760->1638|2789->1639|2855->1677|2954->1748|2983->1749|3053->1791|3133->1843|3162->1844|3228->1882|3272->1898|3301->1899|3371->1941|3464->2006|3493->2007|3522->2008|3572->2030|3601->2031|3671->2073|3791->2165|3820->2166|3849->2167|3898->2188|3927->2189|3997->2231|4119->2325|4148->2326|4213->2363|4263->2385|4292->2386|4361->2427|4440->2478|4469->2479|4556->2538|4585->2539|4662->2588|4749->2647|4778->2648|4845->2687|4874->2688|4956->2742|4985->2743|5050->2780|5192->2894|5221->2895|5291->2937|5371->2989|5400->2990|5479->3041|5508->3042|5577->3083|5656->3134|5685->3135|5753->3175|5782->3176|5839->3205|5868->3206|5923->3233|5952->3234|6001->3255|6062->3419|6111->3440|7711->5009
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|62->37|62->37|63->38|63->38|63->38|64->39|68->43|68->43|69->44|70->45|70->45|71->46|72->47|72->47|73->48|73->48|73->48|74->49|75->50|75->50|75->50|75->50|75->50|76->51|77->52|77->52|77->52|77->52|77->52|78->53|79->54|79->54|80->55|80->55|80->55|81->56|82->57|82->57|83->58|83->58|84->59|85->60|85->60|87->62|87->62|88->63|88->63|89->64|90->65|90->65|91->66|92->67|92->67|93->68|93->68|94->69|95->70|95->70|98->73|98->73|99->74|99->74|100->75|100->75|101->76|104->79|105->80|138->113
                  -- GENERATED --
              */
          