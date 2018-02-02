
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
    </head>

    <body>

        <div class="login-boxtitle">
            <a href="home.html"><img alt="logo" src="/assets/images/logobig.png" /></a>
        </div>

        <div class="login-banner">
            <div class="login-main">
                <div class="login-banner-bg"><span></span><img src="/assets/images/big.jpg" /></div>
                <div class="login-box">

                    <h3 class="title">登录商城</h3>

                    <div class="clear"></div>


                    <form method="POST" target="_self" action=""""),_display_(/*36.65*/routes/*36.71*/.Applications.doLogin()),format.raw/*36.94*/("""" >
                    <div class="login-form">

                            <div class="user-name">
                                <label for="user"><i class="am-icon-user"></i></label>
                                <input type="text" name="phone" id="user" placeholder="邮箱/手机/用户名">
                            </div>
                            <div class="user-pass">
                                <label for="password"><i class="am-icon-lock"></i></label>
                                <input type="password" name="pasd" id="password" placeholder="请输入密码">
                            </div>

                    </div>
                    <div class="login-links">

                        <a href="#" class="am-fr">忘记密码</a>
                        <a href="register.html" class="zcnext am-fr am-btn-default">注册</a>
                        <br />
                    </div>
                    <div class="am-cf">
                        <input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm">
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
""")))}),format.raw/*73.2*/("""
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
                  DATE: Thu Feb 01 09:53:03 CST 2018
                  SOURCE: /home/yms/seed/app/views/login.scala.html
                  HASH: 348bd1a6b13af53c0d8ccfe85ce617395db40b8b
                  MATRIX: 736->1|866->36|894->39|910->47|948->48|975->49|2183->1230|2198->1236|2242->1259|3942->2929
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|61->36|61->36|61->36|98->73
                  -- GENERATED --
              */
          