
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



"""),format.raw/*5.1*/("""<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <title>登录界面</title>
        <link rel="stylesheet" href="/assets/add/css/reset.css" />
        <link rel="stylesheet" href="/assets/add/css/common.css" />
        <link rel="stylesheet" href="/assets/add/css/font-awesome.min.css" />
        <script src="/assets/add/js/jquery-3.3.1.min.js"></script>


    </head>
    <body>
        <div class="wrap login_wrap">
            <div class="content">
                <div class="logo"></div>
                <div class="login_box">

                    <div class="login_form">
                        <div class="login_title">
                            登录
                        </div>
                        <div class="login_error">

                        </div>

                        <form id="form1"  >

                            <div class="form_text_ipt">
                                <input name="acct" type="text" placeholder="学号">
                            </div>
                            <div class="ececk_warning"><span>学号不能为空</span></div>
                            <div class="form_text_ipt">
                                <input name="pasd" type="password" placeholder="密码">
                            </div>
                            <div class="ececk_warning"><span>密码不能为空</span></div>
                            <div class="form_check_ipt">
                                <div class="left check_left">
                                        <!--<label><input name="" type="checkbox"> 下次自动登录</label>-->
                                </div>
                                <div class="right check_right">
                                        <!--<a href="#">忘记密码</a>-->
                                </div>
                            </div>
                            <div class="form_btn">
                                <button type="button" onclick="doLogin()">登录</button>
                            </div>
                                <!--<div class="form_reg_btn">
								<span>还没有帐号？</span><a href="register.html">马上注册</a>
							</div>-->
                        </form>
                        <div class="other_login">
                                <!--<div class="left other_left">
								<span>其它登录方式</span>
							</div>-->
                                <!--<div class="right other_right">
								<a href="#"><i class="fa fa-qq fa-2x"></i></a>
								<a href="#"><i class="fa fa-weixin fa-2x"></i></a>
								<a href="#"><i class="fa fa-weibo fa-2x"></i></a>
							</div>-->
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script type="text/javascript" src="/assets/add/js/common.js" ></script>
        <script type="text/javascript">
                function doLogin() """),format.raw/*73.36*/("""{"""),format.raw/*73.37*/("""
                    """),format.raw/*74.21*/("""$.ajax("""),format.raw/*74.28*/("""{"""),format.raw/*74.29*/("""
                        """),format.raw/*75.25*/("""type: "POST",
                        dataType: "json",
                        url: "/login",
                        data: $('#form1').serialize(),
                        success: function (data) """),format.raw/*79.50*/("""{"""),format.raw/*79.51*/("""
                            """),format.raw/*80.29*/("""var tmp = "";
                            for( var i in data) """),format.raw/*81.49*/("""{"""),format.raw/*81.50*/("""
                                """),format.raw/*82.33*/("""tmp +=data[i];
                            """),format.raw/*83.29*/("""}"""),format.raw/*83.30*/("""
                            """),format.raw/*84.29*/("""if( tmp == "0") """),format.raw/*84.45*/("""{"""),format.raw/*84.46*/("""
                                """),format.raw/*85.33*/("""window.location.href = "/";
                            """),format.raw/*86.29*/("""}"""),format.raw/*86.30*/(""" """),format.raw/*86.31*/("""else if( tmp == "1" ) """),format.raw/*86.53*/("""{"""),format.raw/*86.54*/("""

                                """),format.raw/*88.33*/("""$(".login_error").css("display","block");
                                $(".login_error").html("用户密码错误");

                            """),format.raw/*91.29*/("""}"""),format.raw/*91.30*/(""" """),format.raw/*91.31*/("""else if( tmp == "2" )"""),format.raw/*91.52*/("""{"""),format.raw/*91.53*/("""
                                """),format.raw/*92.33*/("""$(".login_error").css("display","block");
                                $(".login_error").html("用户不存在");

                            """),format.raw/*95.29*/("""}"""),format.raw/*95.30*/("""

                        """),format.raw/*97.25*/("""}"""),format.raw/*97.26*/(""",
                        error : function () """),format.raw/*98.45*/("""{"""),format.raw/*98.46*/("""
                            """),format.raw/*99.29*/("""alert("qqcw")
                        """),format.raw/*100.25*/("""}"""),format.raw/*100.26*/("""
                    """),format.raw/*101.21*/("""}"""),format.raw/*101.22*/(""");

                """),format.raw/*103.17*/("""}"""),format.raw/*103.18*/("""
        """),format.raw/*104.9*/("""</script>
        <div style="text-align:center;">
        </div>
    </body>
</html>


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
                  DATE: Tue Apr 24 07:55:37 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/login.scala.html
                  HASH: 94e23f5dd37cb1ae3d258ac8ff9ba73459154cc7
                  MATRIX: 736->1|866->36|896->40|3770->2886|3799->2887|3848->2908|3883->2915|3912->2916|3965->2941|4192->3140|4221->3141|4278->3170|4368->3232|4397->3233|4458->3266|4529->3309|4558->3310|4615->3339|4659->3355|4688->3356|4749->3389|4833->3445|4862->3446|4891->3447|4941->3469|4970->3470|5032->3504|5197->3641|5226->3642|5255->3643|5304->3664|5333->3665|5394->3698|5558->3834|5587->3835|5641->3861|5670->3862|5744->3908|5773->3909|5830->3938|5897->3976|5927->3977|5977->3998|6007->3999|6056->4019|6086->4020|6123->4029
                  LINES: 21->1|26->1|30->5|98->73|98->73|99->74|99->74|99->74|100->75|104->79|104->79|105->80|106->81|106->81|107->82|108->83|108->83|109->84|109->84|109->84|110->85|111->86|111->86|111->86|111->86|111->86|113->88|116->91|116->91|116->91|116->91|116->91|117->92|120->95|120->95|122->97|122->97|123->98|123->98|124->99|125->100|125->100|126->101|126->101|128->103|128->103|129->104
                  -- GENERATED --
              */
          