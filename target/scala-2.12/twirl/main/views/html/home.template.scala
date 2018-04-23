
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/()(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),_display_(/*3.2*/main("主页")/*3.12*/{_display_(Seq[Any](format.raw/*3.13*/("""

    """),format.raw/*5.5*/("""<link href="/assets/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="/assets/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="/assets/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="/assets/css/hmstyle.css" rel="stylesheet" type="text/css" />
    <link href="/assets/css/skin.css" rel="stylesheet" type="text/css" />
    <script src="/assets/AmazeUI-2.4.2/assets/js/jquery.min.js"></script>
    <script src="/assets/AmazeUI-2.4.2/assets/js/amazeui.min.js"></script>

    <div class="banner">
            <!--轮播 -->
        <div class="am-slider am-slider-default scoll" data-am-flexslider id="demo-slider-0">
            <ul class="am-slides">
                <li class="banner1">
                    <a href="introduction.html"><img src="/assets/img1/python.jpg" /></a>
                </li>
                <li class="banner2">
                    <a><img src="/assets/img1/PythonSparkHadoop5.jpg" /></a>
                </li>
                <li class="banner3">
                    <a><img src="/assets/img1/springCloud.jpg" /></a>
                </li>
                <li class="banner4">
                    <a><img src="/assets/img1/MyBatis750315.jpg" /></a>
                </li>

            </ul>
        </div>
        <div class="clear"></div>
    </div>
    <div class="shopNav">
        <div class="slideall">
            <div class="long-title"><span class="all-goods">全部分类</span></div>
            <div class="nav-cont">
                <ul>
                    <li class="index">
                        <a href="#">首页</a>
                    </li>
                </ul>

            </div>

                <!--侧边导航 -->
            <div id="nav" class="navfull">
                <div class="area clearfix">
                    <div class="category-content" id="guide_2">

                        <div class="category">
                            <ul class="category-list" id="js_climit_li">
                                <li class="appliance js_toggle relative first">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="前端开发">前端开发</a></h3>
                                        <em>&gt;</em>
                                    </div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="基础">基础</span></dt>
                                                            <dd>
                                                                <a title="HTML" href="/search?key=HTML"><span>HTML</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="css" href="/search?key=css"><span>css</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="javascript" href="#"><span>javascript</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="jQuery" href="#"><span>jQuery</span></a>
                                                            </dd>
                                                        </dl>
                                                        <dl class="dl-sort">
                                                            <dt><span title="进阶">进阶</span></dt>
                                                            <dd>
                                                                <a title="HTML5" href="#"><span>HTML5</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="css3" href="#"><span>css3</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Node.js" href="#"><span>Node.js</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="AngularJS" href="#"><span>AngularJS</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Bootstrap" href="#"><span>Bootstrap</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="React" href="#"><span>React</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Sass/Less" href="#"><span>Sass/Less</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Vue.js" href="#"><span>Vue.js</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="WebApp" href="#"><span>WebApp</span></a>
                                                            </dd>
                                                        </dl>

                                                    </div>
                                                    <div class="brand-side">

                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>

                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name">
                                            <a class="ml-22" title="后端开发">后端开发</a>
                                        </h3>
                                        <em>&gt;</em>
                                    </div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="饼干">全部</span></dt>
                                                            <dd>
                                                                <a title="蒸蛋糕" href="#"><span>PHP</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="脱水蛋糕" href="#"><span>SpringBoot</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="瑞士卷" href="#"><span>Python</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="软面包" href="#"><span>C</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>C++</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>Go</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>C#</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>Ruby</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="移动开发">移动开发</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="全部">全部</span></dt>
                                                            <dd>
                                                                <a title="Android" href="#"><span>Android</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="iOS" href="#"><span>iOS</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Unity 3D" href="#"><span>Unity 3D</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Cocos2d" href="#"><span>Cocos2d-x</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="数据库">数据库</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="豆干">全部</span></dt>
                                                            <dd>
                                                                <a title="MySQL" href="#"><span>MySQL</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="MongoDB" href="#"><span>MongoDB</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Oracle" href="#"><span>Oracle</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="SQL" href="#"><span>SQL</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Server" href="#"><span>Server</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <d"""),
format.raw("""iv class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="云计算&大数据">云计算&大数据</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="蛋糕">全部</span></dt>
                                                            <dd>
                                                                <a title="大数据" href="#"><span>大数据</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="云计算" href="#"><span>云计算</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="运维&测试">运维&测试</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="糖果">全部</span></dt>
                                                            <dd>
                                                                <a title="测试" href="#"><span>测试</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="Linux" href="#"><span>Linux</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="UI设计">UI设计</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="蛋糕">全部</span></dt>
                                                            <dd>
                                                                <a title="蒸蛋糕" href="#"><span>动效动画   </span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="脱水蛋糕" href="#"><span>APPUI设计</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="瑞士卷" href="#"><span>设计工具</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="软面包" href="#"><span>设计基础</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="人工智能">人工智能</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="海带丝">全部</span></dt>
                                                            <dd>
                                                                <a title="蒸蛋糕" href="#"><span>机器学习</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="脱水蛋糕" href="#"><span>深度学习</span></a>
                                                            </dd>
                                                        </dl>

                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd>
                                                                <a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="花茶、果茶">算法</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="全部">全部</span></dt>
                                                            <dd>
                                                                <a title="蒸蛋糕" href="#"><span>算法导论</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="软面包" href="#"><span>软面包</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>马卡龙</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="千层饼" href="#"><span>千层饼</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="甜甜圈" href="#"><span>甜甜圈</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="蒸三明治" href="#"><span>蒸三明治</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="铜锣烧" href="#"><span>铜锣烧</span></a>
                                                            </dd>
                                                        </dl>
                                                        <dl class="dl-sort">
                                                            <dt><span title="蛋糕">点心</span></dt>
                                                            <dd>
                                                                <a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="瑞士卷" href="#"><span>瑞士卷</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="软面包" href="#"><span>软面包</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>马卡龙</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="千层饼" href="#"><span>千层饼</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="甜甜圈" href="#"><span>甜甜圈</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="蒸三明治" href="#"><span>蒸三明治</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="铜锣烧" href="#"><span>铜锣烧</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>实力商家</span></dt>
                                                            <dd>
                                                                <a title="今生只围你" target="_blank" href="#" rel="nofollow"><span>今生只围你</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="忆佳人" target="_blank" href="#" rel="nofollow"><span class="red">忆佳人</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="斐洱普斯" target="_blank" href="#" rel="nofollow"><span class="red">斐洱普斯</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="聚百坊" target="_blank" href="#" rel="nofollow"><span class="red">聚百坊</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="朵朵棉织直营店" target="_blank" href="#" rel="nofollow"><span>朵朵棉织直营店</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative last">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="品牌、礼包">品牌/礼包</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                  """),
format.raw("""                              <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span title="大包装">大包装</span></dt>
                                                            <dd>
                                                                <a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="瑞士卷" href="#"><span>瑞士卷</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="软面包" href="#"><span>软面包</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>马卡龙</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="千层饼" href="#"><span>千层饼</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="甜甜圈" href="#"><span>甜甜圈</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="蒸三明治" href="#"><span>蒸三明治</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="铜锣烧" href="#"><span>铜锣烧</span></a>
                                                            </dd>
                                                        </dl>
                                                        <dl class="dl-sort">
                                                            <dt><span title="两件套">两件套</span></dt>
                                                            <dd>
                                                                <a title="蒸蛋糕" href="#"><span>蒸蛋糕</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="脱水蛋糕" href="#"><span>脱水蛋糕</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="瑞士卷" href="#"><span>瑞士卷</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="软面包" href="#"><span>软面包</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="马卡龙" href="#"><span>马卡龙</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="千层饼" href="#"><span>千层饼</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="甜甜圈" href="#"><span>甜甜圈</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="蒸三明治" href="#"><span>蒸三明治</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="铜锣烧" href="#"><span>铜锣烧</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>实力商家</span></dt>
                                                            <dd>
                                                                <a title="琳琅鞋业" target="_blank" href="#" rel="nofollow"><span>琳琅鞋业</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="宏利鞋业" target="_blank" href="#" rel="nofollow"><span>宏利鞋业</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="比爱靓点鞋业" target="_blank" href="#" rel="nofollow"><span>比爱靓点鞋业</span></a>
                                                            </dd>
                                                            <dd>
                                                                <a title="浪人怪怪" target="_blank" href="#" rel="nofollow"><span>浪人怪怪</span></a>
                                                            </dd>
                                                        </dl>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                </li>
                            </ul>
                        </div>
                    </div>

                </div>
            </div>

                <!--轮播-->

            <script type="text/javascript">
                    //                          (function() """),format.raw/*633.61*/("""{"""),format.raw/*633.62*/("""
                    """),format.raw/*634.21*/("""//                              $('.am-slider').flexslider();
                    //                          """),format.raw/*635.49*/("""}"""),format.raw/*635.50*/(""");
                    //                          jQuery的hover方法:当鼠标指针悬停在被选元素上时运行的两个函数
                    $(document).ready(function() """),format.raw/*637.50*/("""{"""),format.raw/*637.51*/("""
                        """),format.raw/*638.25*/("""$("li").hover(function() """),format.raw/*638.50*/("""{"""),format.raw/*638.51*/("""
                            """),format.raw/*639.29*/("""$(".category-content .category-list li.first .menu-in").css("display", "none");
                            $(".category-content .category-list li.first").removeClass("hover");
                            $(this).addClass("hover");
                            $(this).children("div.menu-in").css("display", "block")
                        """),format.raw/*643.25*/("""}"""),format.raw/*643.26*/(""", function() """),format.raw/*643.39*/("""{"""),format.raw/*643.40*/("""
                            """),format.raw/*644.29*/("""$(this).removeClass("hover")
                            $(this).children("div.menu-in").css("display", "none")
                        """),format.raw/*646.25*/("""}"""),format.raw/*646.26*/(""");

                    """),format.raw/*648.21*/("""}"""),format.raw/*648.22*/(""")
            </script>

                <!--小导航 -->
            <div class="am-g am-g-fixed smallnav">
                <div class="am-u-sm-3">
                    <a href="sort.html"><img src="/assets/images/navsmall.jpg" />
                        <div class="title">商品分类</div>
                    </a>
                </div>
                <div class="am-u-sm-3">
                    <a href="#"><img src="/assets/images/huismall.jpg" />
                        <div class="title">大聚惠</div>
                    </a>
                </div>
                <div class="am-u-sm-3">
                    <a href="#"><img src="/assets/images/mansmall.jpg" />
                        <div class="title">个人中心</div>
                    </a>
                </div>
                <div class="am-u-sm-3">
                    <a href="#"><img src="/assets/images/moneysmall.jpg" />
                        <div class="title">投资理财</div>
                    </a>
                </div>
            </div>

                <!--走马灯 -->

            <div class="marqueen">
                <span class="marqueen-title">热门书籍</span>
                <div class="demo">

                    <ul>
                        <li class="title-first">
                            <a target="_blank" href="#">
                                <span>python爬虫技术</span>
                            </a>
                        </li>
                        <li class="title-first">
                            <a target="_blank" href="#">
                                <span>java疯狂讲义</span>
                            </a>
                        </li>

                        <div class="mod-vip">
                            <div class="m-baseinfo">
                                <a href="/assets/person/index.html">
                                    <img src="/assets/images/getAvatar.do.jpg">
                                </a>
                                <em>
                                    Hi,<span class="s-name">你好！</span>
                                    <a href="#"><p>点击更多优惠活动</p></a>
                                </em>
                            </div>
                            <div class="member-logout">
                                <a class="am-btn-warning btn" href=""""),_display_(/*704.70*/routes/*704.76*/.Applications.login()),format.raw/*704.97*/("""">登录</a>
                                """),format.raw/*705.112*/("""
                            """),format.raw/*706.29*/("""</div>

                            <div class="clear"></div>
                        </div>

                        <li>
                            <a target="_blank" href="#"><span>代码大全</span></a>
                        </li>
                        <li>
                            <a target="_blank" href="#"><span>算法导论</span></a>
                        </li>
                        <li>
                            <a target="_blank" href="#"><span>CSS禅意花园</span></a>
                        </li>
                        <li>
                            <a target="_blank" href="#"><span>JavaScript语言精粹</span></a>
                        </li>
                        <li>
                            <a target="_blank" href="#"><span>Android开发精要</span></a>
                        </li>
                        <li>
                            <a target="_blank" href="#"><span>JavaScript语言精粹</span></a>
                        </li>

                    </ul>
                        <!--<div class="advTip"><img src="/assets/images/advTip.jpg" /></div>-->
                </div>
            </div>
            <div class="clear"></div>
        </div>
        <script type="text/javascript">
                if($(window).width() < 640) """),format.raw/*737.45*/("""{"""),format.raw/*737.46*/("""
                    """),format.raw/*738.21*/("""function autoScroll(obj) """),format.raw/*738.46*/("""{"""),format.raw/*738.47*/("""
                        """),format.raw/*739.25*/("""$(obj).find("ul").animate("""),format.raw/*739.51*/("""{"""),format.raw/*739.52*/("""
                            """),format.raw/*740.29*/("""marginTop: "-39px"
                        """),format.raw/*741.25*/("""}"""),format.raw/*741.26*/(""", 500, function() """),format.raw/*741.44*/("""{"""),format.raw/*741.45*/("""
                            """),format.raw/*742.29*/("""$(this).css("""),format.raw/*742.41*/("""{"""),format.raw/*742.42*/("""
                                """),format.raw/*743.33*/("""marginTop: "0px"
                            """),format.raw/*744.29*/("""}"""),format.raw/*744.30*/(""").find("li:first").appendTo(this);
                        """),format.raw/*745.25*/("""}"""),format.raw/*745.26*/(""")
                    """),format.raw/*746.21*/("""}"""),format.raw/*746.22*/("""
                    """),format.raw/*747.21*/("""$(function() """),format.raw/*747.34*/("""{"""),format.raw/*747.35*/("""
                        """),format.raw/*748.25*/("""setInterval('autoScroll(".demo")', 3000);
                    """),format.raw/*749.21*/("""}"""),format.raw/*749.22*/(""")
                """),format.raw/*750.17*/("""}"""),format.raw/*750.18*/("""
        """),format.raw/*751.9*/("""</script>
    </div>
    <div class="shopMainbg">
        <div class="shopMain" id="shopmain">
            <div class="clear "></div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>他们都在看</h4>
                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript语言精粹.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript高级程序设计（第三版）.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/python基础教程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/python编程 ：从入门到实践.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>

                </div>
            </div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大一推荐</h4>
                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript语言精粹.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript高级程序设计（第三版）.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/python基础教程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/python编程 ：从入门到实践.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>

                </div>
            </div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大二推荐</h4>

                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript语言精粹.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript高级程序设计（第三版）.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/python基础教程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/python编程 ：从入门到实践.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>

                </div>
            </div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大三推荐</h4>
                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript语言精粹.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/javascript高级程序设计（第三版）.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/算法（第四版）.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/python编程 ：从入门到实践.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <img src="/assets/img1/c专家编程.jpg" />
                            <h3 class="am-thumbnail-caption"><a href="#">图片标题#1</a></h3>
                        </div>
                    </div>

                </div>
            </div>
            <script>
                    //设置默认高度
                    var $img = $(".menu1 img");
                    for(var j = 0; j < $img.length; j += 12) """),format.raw/*1104.62*/("""{"""),format.raw/*1104.63*/("""
                        """),format.raw/*1105.25*/("""var minnHeight = 20000;
                        for(var i = j; i < j + 12; i++) """),format.raw/*1106.57*/("""{"""),format.raw/*1106.58*/("""
                            """),format.raw/*1107.29*/("""var nWidth = $img[i].naturalWidth
                            var nHeight = $img[i].naturalHeight
                            var nowHeight = $img[i].width / nWidth * nHeight;
                            if(minnHeight > nowHeight) """),format.raw/*1110.56*/("""{"""),format.raw/*1110.57*/("""
                                """),format.raw/*1111.33*/("""minnHeight = nowHeight;
                            """),format.raw/*1112.29*/("""}"""),format.raw/*1112.30*/("""
                        """),format.raw/*1113.25*/("""}"""),format.raw/*1113.26*/("""
                        """),format.raw/*1114.25*/("""for(var i = j; i < j + 12; i++) """),format.raw/*1114.57*/("""{"""),format.raw/*1114.58*/("""
                            """),format.raw/*1115.29*/("""$img[i].height = minnHeight;
                        """),format.raw/*1116.25*/("""}"""),format.raw/*1116.26*/("""
                    """),format.raw/*1117.21*/("""}"""),format.raw/*1117.22*/("""

                    """),format.raw/*1119.21*/("""$(window).resize(function() """),format.raw/*1119.49*/("""{"""),format.raw/*1119.50*/("""
                        """),format.raw/*1120.25*/("""var $img = $(".menu1 img");
                        for(var j = 0; j < $img.length; j += 12) """),format.raw/*1121.66*/("""{"""),format.raw/*1121.67*/("""
                            """),format.raw/*1122.29*/("""var minnHeight = 20000;
                            for(var i = j; i < j + 12; i++) """),format.raw/*1123.61*/("""{"""),format.raw/*1123.62*/("""
                                """),format.raw/*1124.33*/("""var nWidth = $img[i].naturalWidth
                                var nHeight = $img[i].naturalHeight
                                var nowHeight = $img[i].width / nWidth * nHeight;
                                if(minnHeight > nowHeight) """),format.raw/*1127.60*/("""{"""),format.raw/*1127.61*/("""
                                    """),format.raw/*1128.37*/("""minnHeight = nowHeight;
                                """),format.raw/*1129.33*/("""}"""),format.raw/*1129.34*/("""
                            """),format.raw/*1130.29*/("""}"""),format.raw/*1130.30*/("""
                            """),format.raw/*1131.29*/("""for(var i = j; i < j + 12; i++) """),format.raw/*1131.61*/("""{"""),format.raw/*1131.62*/("""
                                """),format.raw/*1132.33*/("""$img[i].height = minnHeight;
                            """),format.raw/*1133.29*/("""}"""),format.raw/*1133.30*/("""
                        """),format.raw/*1134.25*/("""}"""),format.raw/*1134.26*/("""

                    """),format.raw/*1136.21*/("""}"""),format.raw/*1136.22*/(""");
            </script>



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
                  DATE: Sun Apr 22 12:41:38 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/home.scala.html
                  HASH: cae98380e5a41da01fb91120998c081b0cb66e3f
                  MATRIX: 735->1|865->36|893->39|911->49|949->50|981->56|47940->46946|47970->46947|48020->46968|48159->47078|48189->47079|48355->47216|48385->47217|48439->47242|48493->47267|48523->47268|48581->47297|48950->47637|48980->47638|49022->47651|49052->47652|49110->47681|49275->47817|49305->47818|49358->47842|49388->47843|51703->50130|51719->50136|51762->50157|51833->50277|51891->50306|53169->51555|53199->51556|53249->51577|53303->51602|53333->51603|53387->51628|53442->51654|53472->51655|53530->51684|53602->51727|53632->51728|53679->51746|53709->51747|53767->51776|53808->51788|53838->51789|53900->51822|53974->51867|54004->51868|54092->51927|54122->51928|54173->51950|54203->51951|54253->51972|54295->51985|54325->51986|54379->52011|54470->52073|54500->52074|54547->52092|54577->52093|54614->52102|73348->70806|73379->70807|73434->70832|73544->70912|73575->70913|73634->70942|73895->71173|73926->71174|73989->71207|74071->71259|74102->71260|74157->71285|74188->71286|74243->71311|74305->71343|74336->71344|74395->71373|74478->71426|74509->71427|74560->71448|74591->71449|74643->71471|74701->71499|74732->71500|74787->71525|74910->71618|74941->71619|75000->71648|75114->71732|75145->71733|75208->71766|75481->72009|75512->72010|75579->72047|75665->72103|75696->72104|75755->72133|75786->72134|75845->72163|75907->72195|75938->72196|76001->72229|76088->72286|76119->72287|76174->72312|76205->72313|76257->72335|76288->72336
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|660->633|660->633|661->634|662->635|662->635|664->637|664->637|665->638|665->638|665->638|666->639|670->643|670->643|670->643|670->643|671->644|673->646|673->646|675->648|675->648|731->704|731->704|731->704|732->705|733->706|764->737|764->737|765->738|765->738|765->738|766->739|766->739|766->739|767->740|768->741|768->741|768->741|768->741|769->742|769->742|769->742|770->743|771->744|771->744|772->745|772->745|773->746|773->746|774->747|774->747|774->747|775->748|776->749|776->749|777->750|777->750|778->751|1131->1104|1131->1104|1132->1105|1133->1106|1133->1106|1134->1107|1137->1110|1137->1110|1138->1111|1139->1112|1139->1112|1140->1113|1140->1113|1141->1114|1141->1114|1141->1114|1142->1115|1143->1116|1143->1116|1144->1117|1144->1117|1146->1119|1146->1119|1146->1119|1147->1120|1148->1121|1148->1121|1149->1122|1150->1123|1150->1123|1151->1124|1154->1127|1154->1127|1155->1128|1156->1129|1156->1129|1157->1130|1157->1130|1158->1131|1158->1131|1158->1131|1159->1132|1160->1133|1160->1133|1161->1134|1161->1134|1163->1136|1163->1136
                  -- GENERATED --
              */
          