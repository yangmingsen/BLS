
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[scala.List[BookInfos],scala.List[BookInfos],scala.List[BookInfos],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(one: scala.List[BookInfos], two: scala.List[BookInfos], three: scala.List[BookInfos])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.121*/("""

"""),_display_(/*3.2*/main("主页")/*3.12*/{_display_(Seq[Any](format.raw/*3.13*/("""

    """),format.raw/*5.5*/("""<link href="/assets/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="/assets/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="/assets/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="/assets/css/hmstyle.css" rel="stylesheet" type="text/css" />
    <link href="/assets/css/skin.css" rel="stylesheet" type="text/css" />
    <link rel="stylesheet" href="/assets/add/css/home.css">
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
                  """),
format.raw("""                                      </dl>
                                                    </div>
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
                    // (function() """),format.raw/*396.36*/("""{"""),format.raw/*396.37*/("""
                    """),format.raw/*397.21*/("""// 	$('.am-slider').flexslider();
                    // """),format.raw/*398.24*/("""}"""),format.raw/*398.25*/(""");
                    //jQuery的hover方法:当鼠标指针悬停在被选元素上时运行的两个函数
                    $(document).ready(function() """),format.raw/*400.50*/("""{"""),format.raw/*400.51*/("""
                        """),format.raw/*401.25*/("""$("li").hover(function() """),format.raw/*401.50*/("""{"""),format.raw/*401.51*/("""
                            """),format.raw/*402.29*/("""$(".category-content .category-list li.first .menu-in").css("display", "none");
                            $(".category-content .category-list li.first").removeClass("hover");
                            $(this).addClass("hover");
                            $(this).children("div.menu-in").css("display", "block")
                        """),format.raw/*406.25*/("""}"""),format.raw/*406.26*/(""", function() """),format.raw/*406.39*/("""{"""),format.raw/*406.40*/("""
                            """),format.raw/*407.29*/("""$(this).removeClass("hover")
                            $(this).children("div.menu-in").css("display", "none")
                        """),format.raw/*409.25*/("""}"""),format.raw/*409.26*/(""");

                    """),format.raw/*411.21*/("""}"""),format.raw/*411.22*/(""")
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
                                """),_display_(/*437.34*/request/*437.41*/.session.get("userName")/*437.65*/ match/*437.71*/ {/*438.37*/case Some(ha) =>/*438.53*/ {_display_(Seq[Any](format.raw/*438.55*/("""
                                     """),format.raw/*439.38*/("""<em>
                                         Hi,<span class="s-name">"""),_display_(/*440.67*/{ha}),format.raw/*440.71*/("""</span>
                                     </em>
                                    """)))}/*443.37*/case None =>/*443.49*/ {_display_(Seq[Any](format.raw/*443.51*/("""
                                        """),format.raw/*444.41*/("""<div class="member-logout">
                                            <a class="am-btn-warning btn" href="/login">登录</a>
                                            <a class="am-btn-warning btn" href="##">注册</a>
                                        </div>
                                    """)))}}),format.raw/*449.34*/("""

                            """),format.raw/*451.29*/("""<div class="clear"></div>
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

            <script type="text/javascript" >
                    function goTo(goUrl,who) """),format.raw/*485.46*/("""{"""),format.raw/*485.47*/("""
                        """),format.raw/*486.25*/("""$.ajax("""),format.raw/*486.32*/("""{"""),format.raw/*486.33*/("""
                            """),format.raw/*487.29*/("""type: "GET",
                            datatype: "html",
                            url: goUrl,
                            async: true,
                            success: function (data) """),format.raw/*491.54*/("""{"""),format.raw/*491.55*/("""
                                """),format.raw/*492.33*/("""$("#Contents"+who).html(data);
                            """),format.raw/*493.29*/("""}"""),format.raw/*493.30*/(""",
                            error: function () """),format.raw/*494.48*/("""{"""),format.raw/*494.49*/("""
                                """),format.raw/*495.33*/("""alert("请求错误!!");
                            """),format.raw/*496.29*/("""}"""),format.raw/*496.30*/("""
                        """),format.raw/*497.25*/("""}"""),format.raw/*497.26*/(""");
                    """),format.raw/*498.21*/("""}"""),format.raw/*498.22*/("""
            """),format.raw/*499.13*/("""</script>

            <div class="menu1" id="Contents1">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大一推荐书籍</h4>
                            <!--<h3>入门基础</h3>-->

                        <span class="more ">
                            <a href="###" onclick="goTo('/New?who=1&page=1',1)" >换一换<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                    """),_display_(/*514.22*/for(o <- one) yield /*514.35*/ {_display_(Seq[Any](format.raw/*514.37*/("""
                        """),format.raw/*515.25*/("""<div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                            <div class="thumbnail outer-border">
                                <a href="/introdution/"""),_display_(/*517.56*/o/*517.57*/.id),format.raw/*517.60*/("""">
                                    <img src="/assets/ProjectImg/"""),_display_(/*518.67*/o/*518.68*/.id),format.raw/*518.71*/("""-1.jpg" />
                                    <h3 class="am-thumbnail-caption"><span title=""""),_display_(/*519.84*/{o.title}),format.raw/*519.93*/("""">"""),_display_(/*519.96*/{o.title}),format.raw/*519.105*/("""</span></h3>
                                </a>
                            </div>
                        </div>
                    """)))}),format.raw/*523.22*/("""
                """),format.raw/*524.17*/("""</div>
            </div>
            <div class="menu1" id="Contents2">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大二推荐书籍</h4>
                            <!--<h3>入门基础</h3>-->

                        <span class="more ">
                            <a href="###"  onclick="goTo('/New?who=2&page=1',2)">换一换<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">

                """),_display_(/*540.18*/for(t <- two) yield /*540.31*/ {_display_(Seq[Any](format.raw/*540.33*/("""
                    """),format.raw/*541.21*/("""<div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="/introdution/"""),_display_(/*543.52*/t/*543.53*/.id),format.raw/*543.56*/("""">
                                <img src="/assets/ProjectImg/"""),_display_(/*544.63*/t/*544.64*/.id),format.raw/*544.67*/("""-1.jpg" />
                                <h3 class="am-thumbnail-caption"><span>"""),_display_(/*545.73*/{t.title}),format.raw/*545.82*/("""</span></h3>
                            </a>
                        </div>
                    </div>
                """)))}),format.raw/*549.18*/("""

                """),format.raw/*551.17*/("""</div>
            </div>
            <div class="menu1" id="Contents3">
                    <!--前端开发-->
                <div class="am-container ">
                    <div class="shopTitle ">
                        <h4>大三推荐书籍</h4>
                            <!--<h3>入门基础</h3>-->

                        <span class="more ">
                            <a href="###"  onclick="goTo('/New?who=3&page=1',3)">换一换<i class="am-icon-angle-right" style="padding-left:10px ;" ></i></a>
                        </span>
                    </div>
                </div>
                <div class="am-g am-g-fixed">
                """),_display_(/*566.18*/for(t <- three) yield /*566.33*/ {_display_(Seq[Any](format.raw/*566.35*/("""
                    """),format.raw/*567.21*/("""<div class="am-u-sm-4 am-u-md-3 am-u-lg-2">
                        <div class="thumbnail outer-border">
                            <a href="/introdution/"""),_display_(/*569.52*/t/*569.53*/.id),format.raw/*569.56*/("""">
                                <img src="/assets/ProjectImg/"""),_display_(/*570.63*/t/*570.64*/.id),format.raw/*570.67*/("""-1.jpg" />
                                <h3 class="am-thumbnail-caption"><span>"""),_display_(/*571.73*/{t.title}),format.raw/*571.82*/("""</span></h3>
                            </a>
                        </div>
                    </div>
                """)))}),format.raw/*575.18*/("""

                """),format.raw/*577.17*/("""</div>
            </div>
            <script>
                    //设置默认高度

                    var $img = $(".menu1 img");
                    var check = function()"""),format.raw/*583.43*/("""{"""),format.raw/*583.44*/("""
                        """),format.raw/*584.25*/("""if(checkImg())"""),format.raw/*584.39*/("""{"""),format.raw/*584.40*/("""
                            """),format.raw/*585.29*/("""console.log(123);
                            for(var j = 0; j < $img.length; j += 12) """),format.raw/*586.70*/("""{"""),format.raw/*586.71*/("""
                                """),format.raw/*587.33*/("""var minnHeight = 2000;

                                for(var i = j; i < j + 12; i++) """),format.raw/*589.65*/("""{"""),format.raw/*589.66*/("""
                                    """),format.raw/*590.37*/("""var nWidth = $img[i].naturalWidth;
                                    var nHeight = $img[i].naturalHeight;
                                    var nowHeight = $img[i].width / nWidth * nHeight;
                                    console.log(nWidth);
                                    console.log(nHeight);
                                    if(minnHeight > nowHeight) """),format.raw/*595.64*/("""{"""),format.raw/*595.65*/("""
                                        """),format.raw/*596.41*/("""minnHeight = nowHeight;
                                    """),format.raw/*597.37*/("""}"""),format.raw/*597.38*/("""
                                    """),format.raw/*598.37*/("""console.log(minnHeight);
                                """),format.raw/*599.33*/("""}"""),format.raw/*599.34*/("""

                                """),format.raw/*601.33*/("""for(var i = j; i < j + 12; i++) """),format.raw/*601.65*/("""{"""),format.raw/*601.66*/("""
                                    """),format.raw/*602.37*/("""$img[i].height = minnHeight;
                                """),format.raw/*603.33*/("""}"""),format.raw/*603.34*/("""
                            """),format.raw/*604.29*/("""}"""),format.raw/*604.30*/("""
                            """),format.raw/*605.29*/("""clearInterval(set);
                        """),format.raw/*606.25*/("""}"""),format.raw/*606.26*/("""
                    """),format.raw/*607.21*/("""}"""),format.raw/*607.22*/(""";
                    function checkImg() """),format.raw/*608.41*/("""{"""),format.raw/*608.42*/("""
                        """),format.raw/*609.25*/("""var flag = true;
                        console.log($img.length);
                        for (var i = 0; i < $img.length; i++)"""),format.raw/*611.62*/("""{"""),format.raw/*611.63*/("""
                            """),format.raw/*612.29*/("""console.log($img[i].height);
                            console.log($img[i].width);
                            if($img[i].height <= 0 || $img[i].width <= 0)"""),format.raw/*614.74*/("""{"""),format.raw/*614.75*/("""
                                """),format.raw/*615.33*/("""flag = false;
                                break;
                            """),format.raw/*617.29*/("""}"""),format.raw/*617.30*/("""
                            """),format.raw/*618.29*/("""if ($img[i].naturalWidth <= 0 || $img[i].naturalHeight <= 0)"""),format.raw/*618.89*/("""{"""),format.raw/*618.90*/("""
                                """),format.raw/*619.33*/("""flag = false;
                                break;
                            """),format.raw/*621.29*/("""}"""),format.raw/*621.30*/("""
                        """),format.raw/*622.25*/("""}"""),format.raw/*622.26*/("""
                        """),format.raw/*623.25*/("""console.log(flag);
                        return flag;
                    """),format.raw/*625.21*/("""}"""),format.raw/*625.22*/("""
                    """),format.raw/*626.21*/("""var set = setInterval(check,40);
                    $(window).resize(function() """),format.raw/*627.49*/("""{"""),format.raw/*627.50*/("""
                        """),format.raw/*628.25*/("""var $img = $(".menu1 img");
                        for(var j = 0; j < $img.length; j += 12) """),format.raw/*629.66*/("""{"""),format.raw/*629.67*/("""
                            """),format.raw/*630.29*/("""var minnHeight = 200;
                            for(var i = j; i < j + 12; i++) """),format.raw/*631.61*/("""{"""),format.raw/*631.62*/("""
                                """),format.raw/*632.33*/("""var nWidth = $img[i].naturalWidth
                                var nHeight = $img[i].naturalHeight
                                var nowHeight = $img[i].width / nWidth * nHeight;
                                if(minnHeight > nowHeight) """),format.raw/*635.60*/("""{"""),format.raw/*635.61*/("""
                                    """),format.raw/*636.37*/("""minnHeight = nowHeight;
                                """),format.raw/*637.33*/("""}"""),format.raw/*637.34*/("""
                            """),format.raw/*638.29*/("""}"""),format.raw/*638.30*/("""
                            """),format.raw/*639.29*/("""for(var i = j; i < j + 12; i++) """),format.raw/*639.61*/("""{"""),format.raw/*639.62*/("""
                                """),format.raw/*640.33*/("""$img[i].height = minnHeight;
                            """),format.raw/*641.29*/("""}"""),format.raw/*641.30*/("""
                        """),format.raw/*642.25*/("""}"""),format.raw/*642.26*/("""

                    """),format.raw/*644.21*/("""}"""),format.raw/*644.22*/(""");
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

  def render(one:scala.List[BookInfos],two:scala.List[BookInfos],three:scala.List[BookInfos],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(one,two,three)(request)

  def f:((scala.List[BookInfos],scala.List[BookInfos],scala.List[BookInfos]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (one,two,three) => (request) => apply(one,two,three)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 01 10:16:44 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/home.scala.html
                  HASH: 2a6178b46ad5a971ca6673c570ee9cdd05c8e0f3
                  MATRIX: 801->1|1016->120|1044->123|1062->133|1100->134|1132->140|32550->31509|32580->31510|32630->31531|32716->31588|32746->31589|32886->31700|32916->31701|32970->31726|33024->31751|33054->31752|33112->31781|33481->32121|33511->32122|33553->32135|33583->32136|33641->32165|33806->32301|33836->32302|33889->32326|33919->32327|35053->33433|35070->33440|35104->33464|35120->33470|35132->33509|35158->33525|35199->33527|35266->33565|35365->33636|35391->33640|35499->33765|35521->33777|35562->33779|35632->33820|35963->34152|36022->34182|37443->35574|37473->35575|37527->35600|37563->35607|37593->35608|37651->35637|37873->35830|37903->35831|37965->35864|38053->35923|38083->35924|38161->35973|38191->35974|38253->36007|38327->36052|38357->36053|38411->36078|38441->36079|38493->36102|38523->36103|38565->36116|39209->36732|39239->36745|39280->36747|39334->36772|39526->36936|39537->36937|39562->36940|39659->37009|39670->37010|39695->37013|39817->37107|39848->37116|39879->37119|39911->37128|40080->37265|40126->37282|40782->37910|40812->37923|40853->37925|40903->37946|41087->38102|41098->38103|41123->38106|41216->38171|41227->38172|41252->38175|41363->38258|41394->38267|41547->38388|41594->38406|42249->39033|42281->39048|42322->39050|42372->39071|42556->39227|42567->39228|42592->39231|42685->39296|42696->39297|42721->39300|42832->39383|42863->39392|43016->39513|43063->39531|43259->39698|43289->39699|43343->39724|43386->39738|43416->39739|43474->39768|43590->39855|43620->39856|43682->39889|43799->39977|43829->39978|43895->40015|44296->40387|44326->40388|44396->40429|44485->40489|44515->40490|44581->40527|44667->40584|44697->40585|44760->40619|44821->40651|44851->40652|44917->40689|45007->40750|45037->40751|45095->40780|45125->40781|45183->40810|45256->40854|45286->40855|45336->40876|45366->40877|45437->40919|45467->40920|45521->40945|45678->41073|45708->41074|45766->41103|45953->41261|45983->41262|46045->41295|46155->41376|46185->41377|46243->41406|46332->41466|46362->41467|46424->41500|46534->41581|46564->41582|46618->41607|46648->41608|46702->41633|46807->41709|46837->41710|46887->41731|46997->41812|47027->41813|47081->41838|47203->41931|47233->41932|47291->41961|47402->42043|47432->42044|47494->42077|47766->42320|47796->42321|47862->42358|47947->42414|47977->42415|48035->42444|48065->42445|48123->42474|48184->42506|48214->42507|48276->42540|48362->42597|48392->42598|48446->42623|48476->42624|48527->42646|48557->42647
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|422->396|422->396|423->397|424->398|424->398|426->400|426->400|427->401|427->401|427->401|428->402|432->406|432->406|432->406|432->406|433->407|435->409|435->409|437->411|437->411|463->437|463->437|463->437|463->437|463->438|463->438|463->438|464->439|465->440|465->440|467->443|467->443|467->443|468->444|472->449|474->451|508->485|508->485|509->486|509->486|509->486|510->487|514->491|514->491|515->492|516->493|516->493|517->494|517->494|518->495|519->496|519->496|520->497|520->497|521->498|521->498|522->499|537->514|537->514|537->514|538->515|540->517|540->517|540->517|541->518|541->518|541->518|542->519|542->519|542->519|542->519|546->523|547->524|563->540|563->540|563->540|564->541|566->543|566->543|566->543|567->544|567->544|567->544|568->545|568->545|572->549|574->551|589->566|589->566|589->566|590->567|592->569|592->569|592->569|593->570|593->570|593->570|594->571|594->571|598->575|600->577|606->583|606->583|607->584|607->584|607->584|608->585|609->586|609->586|610->587|612->589|612->589|613->590|618->595|618->595|619->596|620->597|620->597|621->598|622->599|622->599|624->601|624->601|624->601|625->602|626->603|626->603|627->604|627->604|628->605|629->606|629->606|630->607|630->607|631->608|631->608|632->609|634->611|634->611|635->612|637->614|637->614|638->615|640->617|640->617|641->618|641->618|641->618|642->619|644->621|644->621|645->622|645->622|646->623|648->625|648->625|649->626|650->627|650->627|651->628|652->629|652->629|653->630|654->631|654->631|655->632|658->635|658->635|659->636|660->637|660->637|661->638|661->638|662->639|662->639|662->639|663->640|664->641|664->641|665->642|665->642|667->644|667->644
                  -- GENERATED --
              */
          