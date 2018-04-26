
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
                    <a href="introduction.html"><img src="/assets/img1/MyBatis750315.jpg" /></a>
                </li>
                <li class="banner2">
                    <a><img src="/assets/img1/python.jpg" /></a>
                </li>
                <li class="banner3">
                    <a><img src="/assets/img1/PythonSparkHadoop5.jpg" /></a>
                </li>
                <li class="banner4">
                    <a><img src="/assets/img1/springCloud.jpg" /></a>
                </li>
            </ul>
        </div>
        <div class="clear"></div>
    </div>
    <div class="shopNav">
        <div class="slideall">
            <div class="long-title"><span class="all-goods">全部分类</span></div>
                <!--<div class="nav-cont">-->
                <!--<ul>-->
                <!--<li class="index">-->
                <!--<a href="#">首页</a>-->
                <!--</li>-->
                <!--</ul>-->
                <!--</div>-->

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
                                                        <dl class="dl-sort"></dl>
                                                        <dt><span>核心基础阶段</span></dt>
                                                        <dd><a href="/search?key=HTML"><span>HTML</span></a></dd>
                                                        <dd><a href="/search?key=css"><span>css</span></a></dd>
                                                        <dd><a href="/search?key=javascript"><span>javascript</span></a></dd>
                                                        <dd><a href="/search?key=DOM"><span>DOM</span></a></dd>
                                                        <dd><a href="/search?key=网页制作"><span>网页制作</span></a></dd>
                                                    </div>
                                                    <div class="sort-side">
                                                        <dl class="dl-sort"></dl>
                                                        <dt><span>核心高级阶段</span></dt>
                                                        <dd><a href="/search?key=HTML5"><span>HTML5</span></a></dd>
                                                        <dd><a href="/search?key=css3"><span>css3</span></a></dd>
                                                        <dd><a href="/search?key=jQuery"><span>jQuery</span></a></dd>
                                                        <dd><a href="/search?key=Bootstrap"><span>Bootstrap</span></a></dd>
                                                        <dd><a href="/search?key=Bootstrap"><span>Canvas</span></a></dd>
                                                            <!--<dd><a href="/search?key=Node.js"><span>Node.js</span></a></dd>-->
                                                        <dd><a href="/search?key=Ajax"><span>Ajax</span></a></dd>
                                                        <dd><a href="/search?key=网页制作"><span>网页制作</span></a></dd>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                                            <dt><span>核心基础阶段</span></dt>
                                                            <dd><a href="/search?key=C"><span>C</span></a></dd>
                                                            <dd><a href="/search?key=Java"><span>Java</span></a></dd>
                                                            <dd><a href="/search?key=Python"><span>Python</span></a></dd>
                                                            <dd><a href="/search?key=C++"><span>C++</span></a></dd>
                                                            <dd><a href="/search?key=C#"><span>C#</span></a></dd>
                                                            <dd><a href="/search?key=Ruby"><span>Ruby</span></a></dd>
                                                            <dd><a href="/search?key=Scala"><span>Scala</span></a></dd>
                                                        </dl>
                                                    </div>
                                                    <div class="sort-side">
                                                        <dl class="dl-sort"></dl>
                                                        <dt><span>核心高级阶段</span></dt>
                                                        <dd><a href="/search?key=JSP"><span>JSP</span></a></dd>
                                                        <dd><a href="/search?key=PHP"><span>PHP</span></a></dd>
                                                        <dd><a href="/search?key=Spring"><span>Spring</span></a></dd>
                                                        <dd><a href="/search?key=SpringBoot"><span>SpringBoot</span></a></dd>
                                                        <dd><a href="/search?key=J2EE"><span>J2EE</span></a></dd>
                                                        <dd><a href="/search?key=Java EE"><span>Java EE</span></a></dd>
                                                        <dd><a href="/search?key=面向对象"><span>面向对象</span></a></dd>
                                                        <dd><a href="/search?key=编译原理"><span>编译原理</span></a></dd>
                                                        <dd><a href="/search?key=软件架构"><span>软件架构</span></a></dd>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                                            <dt><span>全部</span></dt>
                                                            <dd><a href="/search?key=Android"><span>Android</span></a></dd>
                                                            <dd><a href="/search?key=iOS"><span>iOS</span></a></dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                                        <dl class="dl-sort"></dl>
                                                        <dt><span>全部</span></dt>
                                                        <dd><a href="/search?key=MySQL"><span>MySQL</span></a></dd>
                                                        <dd><a href="/search?key=Oracle"><span>Oracle</span></a></dd>
                                                        <dd><a href="/search?key=MongoDB"><span>MongoDB</span></a></dd>
                                                        <dd><a href="/search?key=Oracle"><span>Oracle</span></a></dd>
                                                        <dd><a href="/search?key=SQL Server"><span>SQL Server</span></a></dd>
                                                        <dd><a href="/search?key=数据库"><span>数据库</span></a></dd>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                        <h3 class="category-name b-category-name"><a class="ml-22" title="云计算&大数据">云计算&大数据</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort">
                                                            <dt><span>全部</span></dt>
                                                            <dd><a  href="/search?key=大数据"><span>大数据</span></a></dd>
                                                            <dd><a href="/search?key=云计算"><span>云计算</span></a></dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                                            <dt><span>全部</span></dt>
                                                            <dd><a href="/search?key=测试"><span>测试</span></a></dd>
                                                            <dd><a href="/search?key=Linux"><span>Linux</span></a></dd>

                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
                                                        </dl>
                """),
format.raw("""                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <b class="arrow"></b>
                                </li>
                                <li class="appliance js_toggle relative">
                                    <div class="category-info">
                                        <h3 class="category-name b-category-name"><a class="ml-22">计算机网络</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort"></dl>
                                                        <dt><span>全部</span></dt>
                                                        <dd><a href="/search?key=TCP/IP"><span>TCP/IP</span></a></dd>
                                                        <dd><a href="/search?key=UNIX"><span>UNIX</span></a></dd>
                                                        <dd><a href="/search?key=ASP.NET"><span>ASP.NET</span></a></dd>
                                                        <dd><a href="/search?key=HTTP"><span>HTTP</span></a></dd>
                                                        <dd><a href="/search?key=UML"><span>UML</span></a></dd>
                                                        <dd><a href="/search?key=网络信息"><span>网络信息</span></a></dd>
                                                        <dd><a href="/search?key=信息资源"><span>信息资源</span></a></dd>
                                                        <dd><a href="/search?key=计算机网络"><span>计算机网络</span></a></dd>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                                            <dt><span>全部</span></dt>
                                                            <dd><a href="/search?key=机器学习"><span>机器学习</span></a></dd>
                                                            <dd><a href="/search?key=深度学习"><span>深度学习</span></a></dd>
                                                            <dd><a href="/search?key=数据挖掘"><span>数据挖掘</span></a></dd>
                                                        </dl>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                                        <dl class="dl-sort"></dl>
                                                        <dt><span>全部</span></dt>
                                                        <dd><a href="/search?key=算法导论"><span>算法导论</span></a></dd>
                                                        <dd><a href="/search?key=程序设计竞赛"><span>程序设计竞赛</span></a></dd>
                                                        <dd><a href="/search?key=ACM-ICPC程序设计"><span>ACM-ICPC程序设计</span></a></dd>
                                                        <dd><a href="/search?key=数据结构"><span>数据结构</span></a></dd>
                                                        <dd><a href="/search?key=算法竞赛入门经典"><span>算法竞赛入门经典</span></a></dd>
                                                        <dd><a href="/search?key=图论"><span>图论</span></a></dd>
                                                        <dd><a href="/search?key=算法"><span>算法</span></a></dd>
                                                    </div>
                                                    <div class="brand-side">
                                                        <dl class="dl-sort"><dt><span>推荐学习网站</span></dt>
                                                            <dd><a rel="nofollow" title="菜鸟教程" target="_blank" href="http://www.runoob.com/" rel="nofollow"><span class="red">菜鸟教程</span></a></dd>
                                                            <dd><a rel="nofollow" title="w3cschool" target="_blank" href="https://www.w3cschool.cn/" rel="nofollow"><span>w3cschool</span></a></dd>
                                                            <dd><a rel="nofollow" title="慕课网" target="_blank" href="https://www.imooc.com/" rel="nofollow"><span class="red">慕课网</span></a></dd>
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
                                        <h3 class="category-name b-category-name"><a class="ml-22">其他</a></h3>
                                        <em>&gt;</em></div>
                                    <div class="menu-item menu-in top">
                                        <div class="area-in">
                                            <div class="area-bg">
                                                <div class="menu-srot">
                                                    <div class="sort-side">
                                                        <dl class="dl-sort"></dl>
                                                        <dt><span>全部</span></dt>
                                                        <dd><a href="/search?key=疯狂讲义"><span>疯狂讲义</span></a></dd>
                                                        <dd><a href="/search?key=权威指南"><span>权威指南</span></a></dd>
                                                        <dd><a href="/search?key=Head Fist"><span>Head Fist</span></a></dd>
                                                        <dd><a href="/search?key=大话"><span>大话</span></a></dd>
                                                        <dd><a href="/search?key=面试"><span>面试</span></a></dd>
                                                        <dd><a href="/search?key=软件设计"><span>软件设计</span></a></dd>
                                                        <dd><a href="/search?key=web"><span>web</span></a></dd>
                                                        <dd><a href="/search?key=嵌入式"><span>嵌入式</span></a></dd>
                                                        <dd><a href="/search?key=代码之道"><span>代码之道</span></a></dd>
                                                        <dd><a href="/search?key=编程珠玑"><span>编程珠玑</span></a></dd>
                                                        <dd><a href="/search?key=阿里巴巴"><span>阿里巴巴</span></a></dd>
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
                    // (function() """),format.raw/*395.36*/("""{"""),format.raw/*395.37*/("""
                    """),format.raw/*396.21*/("""// 	$('.am-slider').flexslider();
                    // """),format.raw/*397.24*/("""}"""),format.raw/*397.25*/(""");
                    //jQuery的hover方法:当鼠标指针悬停在被选元素上时运行的两个函数
                    $(document).ready(function() """),format.raw/*399.50*/("""{"""),format.raw/*399.51*/("""
                        """),format.raw/*400.25*/("""$("li").hover(function() """),format.raw/*400.50*/("""{"""),format.raw/*400.51*/("""
                            """),format.raw/*401.29*/("""$(".category-content .category-list li.first .menu-in").css("display", "none");
                            $(".category-content .category-list li.first").removeClass("hover");
                            $(this).addClass("hover");
                            $(this).children("div.menu-in").css("display", "block")
                        """),format.raw/*405.25*/("""}"""),format.raw/*405.26*/(""", function() """),format.raw/*405.39*/("""{"""),format.raw/*405.40*/("""
                            """),format.raw/*406.29*/("""$(this).removeClass("hover")
                            $(this).children("div.menu-in").css("display", "none")
                        """),format.raw/*408.25*/("""}"""),format.raw/*408.26*/(""");

                    """),format.raw/*410.21*/("""}"""),format.raw/*410.22*/(""")
            </script>

            <div class="marqueen">
                <span class="marqueen-title">热门书籍</span>
                <div class="demo">

                    <ul>
                        <li class="title-first">
                            <a target="_blank" href="#">
                                    <!--<img src="/assets/images/TJ2.jpg"></img>-->
                                <span>python爬虫技术</span>
                            </a>
                        </li>
                        <li class="title-first">
                            <a target="_blank" href="#">
                                <span>java疯狂讲义</span>
                                    <!--<img src="/assets/images/TJ.jpg"></img>-->
                            </a>
                        </li>

                        <div class="mod-vip">
                            <div class="m-baseinfo">
                                <a style="cursor: pointer;">
                                    <img src="/assets/add/img/getAvatar.do1.jpg">
                                </a>
                                <em>
                                    Hi,<span class="s-name">同学</span>
                                </em>
                            </div>
                            <div class="member-logout">
                                <a class="am-btn-warning btn" href="##">登录</a>
                                <a class="am-btn-warning btn" href="##">注册</a>
                            </div>
                            <div class="member-login">
                                <a href="#"><strong>0</strong>待收货</a>
                                <a href="#"><strong>0</strong>待发货</a>
                                <a href="#"><strong>0</strong>待付款</a>
                                <a href="#"><strong>0</strong>待评价</a>
                            </div>
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
                        <li>
                            <a target="_blank" href="#"><span>JavaScript语言精粹</span></a>
                        </li>
                    </ul>
                </div>
            </div>
            <div class="clear"></div>
        </div>
    </div>
    <div class="shopMainbg">
        <div class="shopMain" id="shopmain">
            <div class="clear "></div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>推荐书籍</h4>
                            <!--<h3>入门基础</h3>-->

                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/c专家编程.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript高级程序设计（第三版）.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/c++primer中文版（第四版）.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>

                </div>
            </div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大一推荐书籍</h4>
                            <!--<h3>入门基础</h3>-->

                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>

                </div>
            </div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大二推荐书籍</h4>
                            <!--<h3>入门基础</h3>-->

                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
     """),
format.raw("""                           <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>

                </div>
            </div>
            <div class="menu1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大三推荐书籍</h4>
                            <!--<h3>入门基础</h3>-->

                        <span class="more ">
                            <a href="# ">更多书籍<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>
                    <div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="#">
                                <img src="/assets/img1/javascript语言精粹.jpg" />
                                <h3 class="am-thumbnail-caption"><span>图片标题#1</span></h3>
                            </a>
                        </div>
                    </div>

                </div>
            </div>
            <script>
                    //设置默认高度

                    var $img = $(".menu1 img");
                    var check = function()"""),format.raw/*934.43*/("""{"""),format.raw/*934.44*/("""
                        """),format.raw/*935.25*/("""if(checkImg())"""),format.raw/*935.39*/("""{"""),format.raw/*935.40*/("""
                            """),format.raw/*936.29*/("""console.log(123);
                            for(var j = 0; j < $img.length; j += 12) """),format.raw/*937.70*/("""{"""),format.raw/*937.71*/("""
                                """),format.raw/*938.33*/("""var minnHeight = 2000;

                                for(var i = j; i < j + 12; i++) """),format.raw/*940.65*/("""{"""),format.raw/*940.66*/("""
                                    """),format.raw/*941.37*/("""var nWidth = $img[i].naturalWidth;
                                    var nHeight = $img[i].naturalHeight;
                                    var nowHeight = $img[i].width / nWidth * nHeight;
                                    console.log(nWidth);
                                    console.log(nHeight);
                                    if(minnHeight > nowHeight) """),format.raw/*946.64*/("""{"""),format.raw/*946.65*/("""
                                        """),format.raw/*947.41*/("""minnHeight = nowHeight;
                                    """),format.raw/*948.37*/("""}"""),format.raw/*948.38*/("""
                                    """),format.raw/*949.37*/("""console.log(minnHeight);
                                """),format.raw/*950.33*/("""}"""),format.raw/*950.34*/("""

                                """),format.raw/*952.33*/("""for(var i = j; i < j + 12; i++) """),format.raw/*952.65*/("""{"""),format.raw/*952.66*/("""
                                    """),format.raw/*953.37*/("""$img[i].height = minnHeight;
                                """),format.raw/*954.33*/("""}"""),format.raw/*954.34*/("""
                            """),format.raw/*955.29*/("""}"""),format.raw/*955.30*/("""
                            """),format.raw/*956.29*/("""clearInterval(set);
                        """),format.raw/*957.25*/("""}"""),format.raw/*957.26*/("""
                    """),format.raw/*958.21*/("""}"""),format.raw/*958.22*/(""";
                    function checkImg() """),format.raw/*959.41*/("""{"""),format.raw/*959.42*/("""
                        """),format.raw/*960.25*/("""var flag = true;
                        console.log($img.length);
                        for (var i = 0; i < $img.length; i++)"""),format.raw/*962.62*/("""{"""),format.raw/*962.63*/("""
                            """),format.raw/*963.29*/("""console.log($img[i].height);
                            console.log($img[i].width);
                            if($img[i].height <= 0 || $img[i].width <= 0)"""),format.raw/*965.74*/("""{"""),format.raw/*965.75*/("""
                                """),format.raw/*966.33*/("""flag = false;
                                break;
                            """),format.raw/*968.29*/("""}"""),format.raw/*968.30*/("""
                            """),format.raw/*969.29*/("""if ($img[i].naturalWidth <= 0 || $img[i].naturalHeight <= 0)"""),format.raw/*969.89*/("""{"""),format.raw/*969.90*/("""
                                """),format.raw/*970.33*/("""flag = false;
                                break;
                            """),format.raw/*972.29*/("""}"""),format.raw/*972.30*/("""
                        """),format.raw/*973.25*/("""}"""),format.raw/*973.26*/("""
                        """),format.raw/*974.25*/("""console.log(flag);
                        return flag;
                    """),format.raw/*976.21*/("""}"""),format.raw/*976.22*/("""
                    """),format.raw/*977.21*/("""var set = setInterval(check,40);
                    $(window).resize(function() """),format.raw/*978.49*/("""{"""),format.raw/*978.50*/("""
                        """),format.raw/*979.25*/("""var $img = $(".menu1 img");
                        for(var j = 0; j < $img.length; j += 12) """),format.raw/*980.66*/("""{"""),format.raw/*980.67*/("""
                            """),format.raw/*981.29*/("""var minnHeight = 200;
                            for(var i = j; i < j + 12; i++) """),format.raw/*982.61*/("""{"""),format.raw/*982.62*/("""
                                """),format.raw/*983.33*/("""var nWidth = $img[i].naturalWidth
                                var nHeight = $img[i].naturalHeight
                                var nowHeight = $img[i].width / nWidth * nHeight;
                                if(minnHeight > nowHeight) """),format.raw/*986.60*/("""{"""),format.raw/*986.61*/("""
                                    """),format.raw/*987.37*/("""minnHeight = nowHeight;
                                """),format.raw/*988.33*/("""}"""),format.raw/*988.34*/("""
                            """),format.raw/*989.29*/("""}"""),format.raw/*989.30*/("""
                            """),format.raw/*990.29*/("""for(var i = j; i < j + 12; i++) """),format.raw/*990.61*/("""{"""),format.raw/*990.62*/("""
                                """),format.raw/*991.33*/("""$img[i].height = minnHeight;
                            """),format.raw/*992.29*/("""}"""),format.raw/*992.30*/("""
                        """),format.raw/*993.25*/("""}"""),format.raw/*993.26*/("""

                    """),format.raw/*995.21*/("""}"""),format.raw/*995.22*/(""");
            </script>
        </div>
    </div>
    <div class="footer">
        <div class="footer-hd">
        </div>
        <div class="footer-bd">
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
                  DATE: Thu Apr 26 13:41:02 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/home.scala.html
                  HASH: 0a160878126e88817ccee050a04c9764aa18ff8b
                  MATRIX: 735->1|865->36|893->39|911->49|949->50|981->56|32339->31365|32369->31366|32419->31387|32505->31444|32535->31445|32675->31556|32705->31557|32759->31582|32813->31607|32843->31608|32901->31637|33270->31977|33300->31978|33342->31991|33372->31992|33430->32021|33595->32157|33625->32158|33678->32182|33708->32183|59790->58216|59820->58217|59874->58242|59917->58256|59947->58257|60005->58286|60121->58373|60151->58374|60213->58407|60330->58495|60360->58496|60426->58533|60827->58905|60857->58906|60927->58947|61016->59007|61046->59008|61112->59045|61198->59102|61228->59103|61291->59137|61352->59169|61382->59170|61448->59207|61538->59268|61568->59269|61626->59298|61656->59299|61714->59328|61787->59372|61817->59373|61867->59394|61897->59395|61968->59437|61998->59438|62052->59463|62209->59591|62239->59592|62297->59621|62484->59779|62514->59780|62576->59813|62686->59894|62716->59895|62774->59924|62863->59984|62893->59985|62955->60018|63065->60099|63095->60100|63149->60125|63179->60126|63233->60151|63338->60227|63368->60228|63418->60249|63528->60330|63558->60331|63612->60356|63734->60449|63764->60450|63822->60479|63933->60561|63963->60562|64025->60595|64297->60838|64327->60839|64393->60876|64478->60932|64508->60933|64566->60962|64596->60963|64654->60992|64715->61024|64745->61025|64807->61058|64893->61115|64923->61116|64977->61141|65007->61142|65058->61164|65088->61165
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|421->395|421->395|422->396|423->397|423->397|425->399|425->399|426->400|426->400|426->400|427->401|431->405|431->405|431->405|431->405|432->406|434->408|434->408|436->410|436->410|961->934|961->934|962->935|962->935|962->935|963->936|964->937|964->937|965->938|967->940|967->940|968->941|973->946|973->946|974->947|975->948|975->948|976->949|977->950|977->950|979->952|979->952|979->952|980->953|981->954|981->954|982->955|982->955|983->956|984->957|984->957|985->958|985->958|986->959|986->959|987->960|989->962|989->962|990->963|992->965|992->965|993->966|995->968|995->968|996->969|996->969|996->969|997->970|999->972|999->972|1000->973|1000->973|1001->974|1003->976|1003->976|1004->977|1005->978|1005->978|1006->979|1007->980|1007->980|1008->981|1009->982|1009->982|1010->983|1013->986|1013->986|1014->987|1015->988|1015->988|1016->989|1016->989|1017->990|1017->990|1017->990|1018->991|1019->992|1019->992|1020->993|1020->993|1022->995|1022->995
                  -- GENERATED --
              */
          