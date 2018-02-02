
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

object regsiter extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

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
            <title>注册</title>
            <meta http-equiv="X-UA-Compatible" content="IE=edge">
            <meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
            <meta name="format-detection" content="telephone=no">
            <meta name="renderer" content="webkit">
            <meta http-equiv="Cache-Control" content="no-siteapp" />

            <link rel="stylesheet" href="/assets/AmazeUI-2.4.2/assets/css/amazeui.min.css" />
            <link href="/assets/css/dlstyle.css" rel="stylesheet" type="text/css">
            <script src="/assets/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
            <script src="/assets/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

        </head>

        <body>

            <div class="login-boxtitle">
                <a href="home/demo.html"><img alt="" src="/assets/images/logobig.png" /></a>
            </div>

            <div class="res-banner">


                <div class="res-main">
                    <div class="login-banner-bg"><span></span><img src="/assets/images/big.jpg" /></div>
                    <div class="login-box">

                        <div class="am-tabs" id="doc-my-tabs">
                            <ul class="am-tabs-nav am-nav am-nav-tabs am-nav-justify">
                                <li class="am-active"><a href="">邮箱注册</a></li>
                                <li><a href="">手机号注册</a></li>
                            </ul>

                            <div class="am-tabs-bd">

                                <div class="am-tab-panel am-active">

                                    <form target="_self" action=""""),_display_(/*46.67*/routes/*46.73*/.Applications.doRegisterEmail()),format.raw/*46.104*/("""" method="POST">

                                        <div class="user-email">
                                            <label for="email"><i class="am-icon-envelope-o"></i></label>
                                            <input type="email" name="email" id="email" placeholder="请输入邮箱账号">
                                        </div>

                                        <div class="user-pass">
                                            <label for="password"><i class="am-icon-lock"></i></label>
                                            <input type="password" name="pasd" id="pasd" placeholder="设置密码">
                                        </div>
                                        <div class="user-pass">
                                            <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                            <input type="password" name="rpasd" id="rpasd" placeholder="确认密码">
                                        </div>
                                        <div class="user-pass">
                                            <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                            <input type="text" name="realName" id="realName" placeholder="你的真实姓名">
                                        </div>



                                        <!--  <div class="login-links">
										<label for="reader-me">
											<input id="reader-me" type="checkbox"> 点击表示您同意商城《服务协议》
										</label>
							  	</div> -->
                                        <div class="am-cf">
                                            <input type="submit" name="" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                                        </div>
                                    </form>
                                </div>


                                <div class="am-tab-panel">
                                    <form method="post">
                                        <div class="user-phone">
                                            <label for="phone"><i class="am-icon-mobile-phone am-icon-md"></i></label>
                                            <input type="tel" name="" id="phone" placeholder="请输入手机号">
                                        </div>
                                        <div class="verification">
                                            <label for="code"><i class="am-icon-code-fork"></i></label>
                                            <input type="tel" name="" id="code" placeholder="请输入验证码">
                                            <a class="btn" href="javascript:void(0);" onclick="sendMobileCode();" id="sendMobileCode">
                                                <span id="dyMobileButton">获取</span></a>
                                        </div>
                                        <div class="user-pass">
                                            <label for="password"><i class="am-icon-lock"></i></label>
                                            <input type="password" name="" id="password" placeholder="设置密码">
                                        </div>
                                        <div class="user-pass">
                                            <label for="passwordRepeat"><i class="am-icon-lock"></i></label>
                                            <input type="password" name="" id="passwordRepeat" placeholder="确认密码">
                                        </div>

                                            <!--  <div class="login-links">
										<label for="reader-me">
											<input id="reader-me" type="checkbox"> 点击表示您同意商城《服务协议》
										</label>
							  	</div> -->
                                        <div class="am-cf">
                                            <input type="submit" name="" value="注册" class="am-btn am-btn-primary am-btn-sm am-fl">
                                        </div>

                                        <hr>
                                    </form>
                                </div>

                                <script>
                                        $(function() """),format.raw/*115.54*/("""{"""),format.raw/*115.55*/("""
                                            """),format.raw/*116.45*/("""$('#doc-my-tabs').tabs();
                                        """),format.raw/*117.41*/("""}"""),format.raw/*117.42*/(""")
                                </script>

                            </div>
                        </div>

                    </div>
                </div>
            </div>

""")))}))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply()(request)

  def f:(() => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = () => (request) => apply()(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 01 11:53:38 CST 2018
                  SOURCE: /home/yms/seed/app/views/regsiter.scala.html
                  HASH: 2f10bbcf6800634f10e05768f7ea6a916c5ea46c
                  MATRIX: 739->1|869->36|897->39|913->47|951->48|978->49|2790->1834|2805->1840|2858->1871|7092->6076|7122->6077|7196->6122|7291->6188|7321->6189
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|71->46|71->46|71->46|140->115|140->115|141->116|142->117|142->117
                  -- GENERATED --
              */
          