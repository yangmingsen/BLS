
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
                    <a href="###"><img src="/assets/img1/python.jpg" /></a>
                </li>
                <li class="banner2">
                    <a href="###"><img src="/assets/img1/PythonSparkHadoop5.jpg" /></a>
                </li>
                <li class="banner3">
                    <a href="###"><img src="/assets/img1/springCloud.jpg" /></a>
                </li>
                <li class="banner4">
                    <a href="###"><img src="/assets/img1/MyBatis750315.jpg" /></a>
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
                        <a href="/">首页</a>
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
format.raw("""                </div>
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
                    // (function() """),format.raw/*397.36*/("""{"""),format.raw/*397.37*/("""
                    """),format.raw/*398.21*/("""// 	$('.am-slider').flexslider();
                    // """),format.raw/*399.24*/("""}"""),format.raw/*399.25*/(""");
                    //jQuery的hover方法:当鼠标指针悬停在被选元素上时运行的两个函数
                    $(document).ready(function() """),format.raw/*401.50*/("""{"""),format.raw/*401.51*/("""
                        """),format.raw/*402.25*/("""$("li").hover(function() """),format.raw/*402.50*/("""{"""),format.raw/*402.51*/("""
                            """),format.raw/*403.29*/("""$(".category-content .category-list li.first .menu-in").css("display", "none");
                            $(".category-content .category-list li.first").removeClass("hover");
                            $(this).addClass("hover");
                            $(this).children("div.menu-in").css("display", "block")
                        """),format.raw/*407.25*/("""}"""),format.raw/*407.26*/(""", function() """),format.raw/*407.39*/("""{"""),format.raw/*407.40*/("""
                            """),format.raw/*408.29*/("""$(this).removeClass("hover")
                            $(this).children("div.menu-in").css("display", "none")
                        """),format.raw/*410.25*/("""}"""),format.raw/*410.26*/(""");

                    """),format.raw/*412.21*/("""}"""),format.raw/*412.22*/(""")
            </script>


            <div class="marqueen">
                <span class="marqueen-title">热门书籍</span>
                <div class="demo">

                    <ul>
                        <li class="title-first">
                            <a target="_self" href="/search?key=python">
                                    <!--<img src="/assets/images/TJ2.jpg"></img>-->
                                <span>python</span>
                            </a>
                        </li>
                        <li class="title-first">
                            <a target="_self" href="/search?key=java疯狂讲义">
                                <span>java疯狂讲义</span>
                                    <!--<img src="/assets/images/TJ.jpg"></img>-->
                            </a>
                        </li>

                        <div class="mod-vip">

                            """),_display_(/*436.30*/request/*436.37*/.session.get("userName")/*436.61*/ match/*436.67*/ {/*437.33*/case Some(usr) =>/*437.50*/ {_display_(Seq[Any](format.raw/*437.52*/("""
                                    """),format.raw/*438.37*/("""<div class="m-baseinfo">
                                         <a style="cursor: pointer;">
                                              <img src="/assets/add/img/getAvatar.do1.jpg">
                                         </a>
                                         <em>
                                             Hi,<span class="s-name">你好.."""),_display_(/*443.75*/{usr}),format.raw/*443.80*/("""</span>
                                        </em>
                                    </div>
                                """)))}/*447.33*/case  None =>/*447.46*/ {_display_(Seq[Any](format.raw/*447.48*/("""
                                    """),format.raw/*448.37*/("""<div class="m-baseinfo">
                                        <a style="cursor: pointer;">
                                            <img src="/assets/add/img/getAvatar.do1.jpg">
                                        </a>
                                        <em>
                                             Hi,<span class="s-name">同学..你好</span>
                                        </em>
                                    </div>
                                 <div class="member-logout">
                                     <a class="am-btn-warning btn" href="/login">登录</a>
                                     <a class="am-btn-warning btn" href="####">注册</a>
                                 </div>
                                """)))}}),format.raw/*461.30*/("""

                            """),format.raw/*463.29*/("""<div class="member-login">
                                <a href="#"><strong>0</strong>待收货</a>
                                <a href="#"><strong>0</strong>待发货</a>
                                <a href="#"><strong>0</strong>待付款</a>
                                <a href="#"><strong>0</strong>待评价</a>
                            </div>
                            <div class="clear"></div>
                        </div>
                        <li>
                            <a target="_self" href="/search?key=代码大全"><span>代码大全</span></a>
                        </li>
                        <li>
                            <a target="_self" href="/search?key=算法导论"><span>算法导论</span></a>
                        </li>
                        <li>
                            <a target="_self" href="/search?key=CSS禅意花园"><span>CSS禅意花园</span></a>
                        </li>
                        <li>
                            <a target="_self" href="/search?key=JavaScript语言精粹"><span>JavaScript语言精粹</span></a>
                        </li>
                        <li>
                            <a target="_self" href="/search?key=Android开发精要"><span>Android开发精要</span></a>
                        </li>
                        <li>
                            <a target="_self" href="/search?key=c程序设计语言"><span>c程序设计语言</span></a>
                        </li>
                        <li>
                            <a target="_self" href="/search?key=C++ primer plus"><span>C++ primer plus</span></a>
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
                                <img src="/assets/img1/javascrip"""),
format.raw("""t语言精粹.jpg" />
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
                    var check = function()"""),format.raw/*953.43*/("""{"""),format.raw/*953.44*/("""
                        """),format.raw/*954.25*/("""if(checkImg())"""),format.raw/*954.39*/("""{"""),format.raw/*954.40*/("""
                            """),format.raw/*955.29*/("""console.log(123);
                            for(var j = 0; j < $img.length; j += 12) """),format.raw/*956.70*/("""{"""),format.raw/*956.71*/("""
                                """),format.raw/*957.33*/("""var minnHeight = 2000;

                                for(var i = j; i < j + 12; i++) """),format.raw/*959.65*/("""{"""),format.raw/*959.66*/("""
                                    """),format.raw/*960.37*/("""var nWidth = $img[i].naturalWidth;
                                    var nHeight = $img[i].naturalHeight;
                                    var nowHeight = $img[i].width / nWidth * nHeight;
                                    console.log(nWidth);
                                    console.log(nHeight);
                                    if(minnHeight > nowHeight) """),format.raw/*965.64*/("""{"""),format.raw/*965.65*/("""
                                        """),format.raw/*966.41*/("""minnHeight = nowHeight;
                                    """),format.raw/*967.37*/("""}"""),format.raw/*967.38*/("""
                                    """),format.raw/*968.37*/("""console.log(minnHeight);
                                """),format.raw/*969.33*/("""}"""),format.raw/*969.34*/("""

                                """),format.raw/*971.33*/("""for(var i = j; i < j + 12; i++) """),format.raw/*971.65*/("""{"""),format.raw/*971.66*/("""
                                    """),format.raw/*972.37*/("""$img[i].height = minnHeight;
                                """),format.raw/*973.33*/("""}"""),format.raw/*973.34*/("""
                            """),format.raw/*974.29*/("""}"""),format.raw/*974.30*/("""
                            """),format.raw/*975.29*/("""clearInterval(set);
                        """),format.raw/*976.25*/("""}"""),format.raw/*976.26*/("""
                    """),format.raw/*977.21*/("""}"""),format.raw/*977.22*/(""";
                    function checkImg() """),format.raw/*978.41*/("""{"""),format.raw/*978.42*/("""
                        """),format.raw/*979.25*/("""var flag = true;
                        console.log($img.length);
                        for (var i = 0; i < $img.length; i++)"""),format.raw/*981.62*/("""{"""),format.raw/*981.63*/("""
                            """),format.raw/*982.29*/("""console.log($img[i].height);
                            console.log($img[i].width);
                            if($img[i].height <= 0 || $img[i].width <= 0)"""),format.raw/*984.74*/("""{"""),format.raw/*984.75*/("""
                                """),format.raw/*985.33*/("""flag = false;
                                break;
                            """),format.raw/*987.29*/("""}"""),format.raw/*987.30*/("""
                            """),format.raw/*988.29*/("""if ($img[i].naturalWidth <= 0 || $img[i].naturalHeight <= 0)"""),format.raw/*988.89*/("""{"""),format.raw/*988.90*/("""
                                """),format.raw/*989.33*/("""flag = false;
                                break;
                            """),format.raw/*991.29*/("""}"""),format.raw/*991.30*/("""
                        """),format.raw/*992.25*/("""}"""),format.raw/*992.26*/("""
                        """),format.raw/*993.25*/("""console.log(flag);
                        return flag;
                    """),format.raw/*995.21*/("""}"""),format.raw/*995.22*/("""
                    """),format.raw/*996.21*/("""var set = setInterval(check,40);
                    $(window).resize(function() """),format.raw/*997.49*/("""{"""),format.raw/*997.50*/("""
                        """),format.raw/*998.25*/("""var $img = $(".menu1 img");
                        for(var j = 0; j < $img.length; j += 12) """),format.raw/*999.66*/("""{"""),format.raw/*999.67*/("""
                            """),format.raw/*1000.29*/("""var minnHeight = 200;
                            for(var i = j; i < j + 12; i++) """),format.raw/*1001.61*/("""{"""),format.raw/*1001.62*/("""
                                """),format.raw/*1002.33*/("""var nWidth = $img[i].naturalWidth
                                var nHeight = $img[i].naturalHeight
                                var nowHeight = $img[i].width / nWidth * nHeight;
                                if(minnHeight > nowHeight) """),format.raw/*1005.60*/("""{"""),format.raw/*1005.61*/("""
                                    """),format.raw/*1006.37*/("""minnHeight = nowHeight;
                                """),format.raw/*1007.33*/("""}"""),format.raw/*1007.34*/("""
                            """),format.raw/*1008.29*/("""}"""),format.raw/*1008.30*/("""
                            """),format.raw/*1009.29*/("""for(var i = j; i < j + 12; i++) """),format.raw/*1009.61*/("""{"""),format.raw/*1009.62*/("""
                                """),format.raw/*1010.33*/("""$img[i].height = minnHeight;
                            """),format.raw/*1011.29*/("""}"""),format.raw/*1011.30*/("""
                        """),format.raw/*1012.25*/("""}"""),format.raw/*1012.26*/("""

                    """),format.raw/*1014.21*/("""}"""),format.raw/*1014.22*/(""");
            </script>
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
                  DATE: Tue Apr 24 09:00:35 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/home.scala.html
                  HASH: 7d3c81f64be8a37d43c74de9de673959c23a7a65
                  MATRIX: 735->1|865->36|893->39|911->49|949->50|981->56|32319->31345|32349->31346|32399->31367|32485->31424|32515->31425|32655->31536|32685->31537|32739->31562|32793->31587|32823->31588|32881->31617|33250->31957|33280->31958|33322->31971|33352->31972|33410->32001|33575->32137|33605->32138|33658->32162|33688->32163|34617->33064|34634->33071|34668->33095|34684->33101|34696->33136|34723->33153|34764->33155|34830->33192|35211->33545|35238->33550|35388->33713|35411->33726|35452->33728|35518->33765|36305->34549|36364->34579|61042->59208|61072->59209|61126->59234|61169->59248|61199->59249|61257->59278|61373->59365|61403->59366|61465->59399|61582->59487|61612->59488|61678->59525|62079->59897|62109->59898|62179->59939|62268->59999|62298->60000|62364->60037|62450->60094|62480->60095|62543->60129|62604->60161|62634->60162|62700->60199|62790->60260|62820->60261|62878->60290|62908->60291|62966->60320|63039->60364|63069->60365|63119->60386|63149->60387|63220->60429|63250->60430|63304->60455|63461->60583|63491->60584|63549->60613|63736->60771|63766->60772|63828->60805|63938->60886|63968->60887|64026->60916|64115->60976|64145->60977|64207->61010|64317->61091|64347->61092|64401->61117|64431->61118|64485->61143|64590->61219|64620->61220|64670->61241|64780->61322|64810->61323|64864->61348|64986->61441|65016->61442|65075->61471|65187->61553|65218->61554|65281->61587|65554->61830|65585->61831|65652->61868|65738->61924|65769->61925|65828->61954|65859->61955|65918->61984|65980->62016|66011->62017|66074->62050|66161->62107|66192->62108|66247->62133|66278->62134|66330->62156|66361->62157
                  LINES: 21->1|26->1|28->3|28->3|28->3|30->5|423->397|423->397|424->398|425->399|425->399|427->401|427->401|428->402|428->402|428->402|429->403|433->407|433->407|433->407|433->407|434->408|436->410|436->410|438->412|438->412|462->436|462->436|462->436|462->436|462->437|462->437|462->437|463->438|468->443|468->443|471->447|471->447|471->447|472->448|484->461|486->463|977->953|977->953|978->954|978->954|978->954|979->955|980->956|980->956|981->957|983->959|983->959|984->960|989->965|989->965|990->966|991->967|991->967|992->968|993->969|993->969|995->971|995->971|995->971|996->972|997->973|997->973|998->974|998->974|999->975|1000->976|1000->976|1001->977|1001->977|1002->978|1002->978|1003->979|1005->981|1005->981|1006->982|1008->984|1008->984|1009->985|1011->987|1011->987|1012->988|1012->988|1012->988|1013->989|1015->991|1015->991|1016->992|1016->992|1017->993|1019->995|1019->995|1020->996|1021->997|1021->997|1022->998|1023->999|1023->999|1024->1000|1025->1001|1025->1001|1026->1002|1029->1005|1029->1005|1030->1006|1031->1007|1031->1007|1032->1008|1032->1008|1033->1009|1033->1009|1033->1009|1034->1010|1035->1011|1035->1011|1036->1012|1036->1012|1038->1014|1038->1014
                  -- GENERATED --
              */
          