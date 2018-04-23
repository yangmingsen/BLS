
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[BookInfos],RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(curpage: List[BookInfos])(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""


"""),_display_(/*4.2*/main("搜索")/*4.12*/ {_display_(Seq[Any](format.raw/*4.14*/("""

    """),format.raw/*6.5*/("""<link href="/assets/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="/assets/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="/assets/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="/assets/css/seastyle.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="/assets/basic/js/jquery-1.7.min.js"></script>

        <!--<script type="text/javascript" src="/assets/js/script.js"></script>-->


    <div class="search">
        <div class="search-list">
            <div class="nav-table">
                <div class="long-title"><span class="all-goods">全部分类</span></div>
                <div class="nav-cont">
                    <ul>
                        <li class="index">
                            <a href="#">首页</a>
                        </li>
                    </ul>
                </div>
            </div>

            <div class="am-g am-g-fixed">

                <div class="am-u-sm-12 am-u-md-12">
                    <div class="theme-popover">
                        <ul class="select">
                            <p class="title font-normal">
                                <span class="fl">java</span>
                                <span class="total fl">搜索到<strong class="num">22</strong>本相关书籍</span>
                            </p>
                            <div class="clear"></div>
                            <li class="select-result">
                                <dl>
                                    <dt>已选</dt>
                                    <dd class="select-no"></dd>
                                    <p class="eliminateCriteria">清除</p>
                                </dl>
                            </li>
                            <div class="clear"></div>
                            <li class="select-list">
                                <dl id="select1">
                                    <dt class="am-badge am-round">方向</dt>
                                    <div class="dd-conent">
                                        <dd class="select-all selected"><a href="#">全部</a></dd>
                                        <dd><a href="#" title="前端开发">前端开发</a></dd>
                                        <dd><a href="#">后端开发</a></dd>
                                        <dd><a href="#">移动开发</a></dd>
                                        <dd><a href="#">数据库</a></dd>
                                        <dd><a href="#">人工智能</a></dd>
                                        <dd><a href="#">云计算&大数据</a></dd>
                                        <dd><a href="#">运维&测试</a></dd>
                                        <dd><a href="#">UI设计</a></dd>
                                    </div>

                                </dl>
                            </li>
                            <li class="select-list">
                                <dl id="select2">
                                    <dt class="am-badge am-round">分类</dt>
                                    <div class="dd-conent">
                                        <dd class="select-all selected">
                                            <a href="#">全部</a>
                                        </dd>
                                        <dd>
                                            <a href="#">HTML/CSS</a>
                                        </dd>
                                        <dd>
                                            <a href="#">JavaScript</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Html5</a>
                                        </dd>
                                        <dd>
                                            <a href="#">CSS3</a>
                                        </dd>
                                        <dd>
                                            <a href="#">jQuery</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Node.js</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Bootstrap</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Angular</a>
                                        </dd>
                                        <dd>
                                            <a href="#">React.js</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Vue.js</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Saaa/Less</a>
                                        </dd>
                                        <dd>
                                            <a href="#">WebApp</a>
                                        </dd>
                                        <dd>
                                            <a href="#">前端工具</a>
                                        </dd>
                                        <dd>
                                            <a href="#">PHP</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Java</a>
                                        </dd>
                                        <dd>
                                            <a href="#">SpringBoot</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Python</a>
                                        </dd>
                                        <dd>
                                            <a href="#">C</a>
                                        </dd>
                                        <dd>
                                            <a href="#">C++</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Go</a>
                                        </dd>
                                        <dd>
                                            <a href="#">C#</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Ruby</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Android</a>
                                        </dd>
                                        <dd>
                                            <a href="#">iOS</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Unity 3D</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Cocos2d-x</a>
                                        </dd>
                                        <dd>
                                            <a href="#">MySQL</a>
                                        </dd>
                                        <dd>
                                            <a href="#">MongoDB</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Oracle</a>
                                        </dd>
                                        <dd>
                                            <a href="#">SQL Server</a>
                                        </dd>
                                        <dd>
                                            <a href="#">机器学习</a>
                                        </dd>
                                        <dd>
                                            <a href="#">深度学习</a>
                                        </dd>
                                        <dd>
                                            <a href="#">大数据</a>
                                        </dd>
                                        <dd>
                                            <a href="#">云计算</a>
                                        </dd>
                                        <dd>
                                            <a href="#">测试</a>
                                        </dd>
                                        <dd>
                                            <a href="#">Linux</a>
                                        </dd>
                                        <dd>
                                            <a href="#">动效动画</a>
                                        </dd>
                                        <dd>
                                            <a href="#">APPUI设计</a>
                                        </dd>
                                        <dd>
                                            <a href="#">设计工具</a>
                                        </dd>
                                        <dd>
                                            <a href="#">设计基础</a>
                                        </dd>
                                    </div>
                                </dl>
                            </li>
                            <li class="select-list">
                                <dl id="select3">
                                    <dt class="am-badge am-round">类型</dt>
                                    <div class="dd-conent">
                                        <dd class="select-all selected">
                                            <a href="#">全部</a>
                                        </dd>
                                        <dd>
                                            <a href="#">基础</a>
                                        </dd>
                                        <dd>
                                            <a href="#">案例</a>
                                        </dd>
                                        <dd>
                                            <a href="#">框架</a>
                                        </dd>
                                        <dd>
                                            <a href="#">工具</a>
                                        </dd>
                                        <dd>
                                            <a href="#">设计模式</a>
                                        </dd>
                                    </div>
                                </dl>
                            </li>
                        </ul>
                        <div class="clear"></div>
                    </div>
                    <div class="search-content">
                        <div class="sort">
                            <li class="first">
                                <a title="综合">综合排序</a>
                            </li>
                            <li>
                                <a title="借阅量排序">借阅量排序</a>
                            </li>
                            <li>
                                <a title="评价排序">评价排序</a>
                            </li>
                        </div>
                        <div class="clear"></div>

                        <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">
                            """),format.raw/*239.37*/("""
                                """),format.raw/*240.68*/("""
                                    """),format.raw/*241.82*/("""
                                    """),format.raw/*242.75*/("""
                                    """),format.raw/*243.61*/("""
                                        """),format.raw/*244.53*/("""
                                        """),format.raw/*245.67*/("""
                                    """),format.raw/*246.45*/("""
                                    """),format.raw/*247.62*/("""
                                        """),format.raw/*248.65*/("""
                                    """),format.raw/*249.45*/("""
                                """),format.raw/*250.43*/("""
                            """),format.raw/*251.38*/("""

                            """),_display_(/*253.30*/for(book <- curpage) yield /*253.50*/{_display_(Seq[Any](format.raw/*253.51*/("""
                                """),format.raw/*254.33*/("""<li>
                                    <div class="i-pic limit menu1">
                                        <a href="/introdution/"""),_display_(/*256.64*/book/*256.68*/.id),format.raw/*256.71*/(""""><img src="/assets/ProjectImg/"""),_display_(/*256.103*/book/*256.107*/.id),format.raw/*256.110*/("""-1.jpg" /></a>
                                        <p class="title fl">"""),_display_(/*257.62*/book/*257.66*/.title),format.raw/*257.72*/("""</p>
                                        <p class="price fl">
                                            <b>¥</b>
                                            <strong>56.90</strong>
                                        </p>
                                        <p class="number fl">
                                            库存<span>"""),_display_(/*263.54*/book/*263.58*/.amount),format.raw/*263.65*/("""</span>
                                        </p>
                                    </div>
                                </li>
                            """)))}),format.raw/*267.30*/("""
                        """),format.raw/*268.25*/("""</ul>

                    </div>
                    <div class="search-side">

                        <div class="side-title">
                            经典书籍
                        </div>
                        <li>
                            <div class="i-pic check menu1">
                                <img src="/assets/img1/java并发编程实战.jpg" />
                                <p class="check-title">java并发编程实战</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>29.90</strong>
                                </p>
                                <p class="number fl">
                                    借阅量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic check menu1">
                                <img src="/assets/img1/java并发编程实战.jpg" />
                                <p class="check-title">java并发编程实战</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>8.90</strong>
                                </p>
                                <p class="number fl">
                                    借阅量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic check menu1">
                                <img src="/assets/img1/java并发编程实战.jpg" />
                                <p class="check-title">java并发编程实战</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>29.90</strong>
                                </p>
                                <p class="number fl">
                                    借阅量<span>1110</span>
                                </p>
                            </div>
                        </li>

                    </div>
                    <div class="clear"></div>
                        <!--分页 -->
                    <ul class="am-pagination am-pagination-right">
                        <li class="am-disabled">
                            <a href="#">&laquo;</a>
                        </li>
                        <li class="am-active">
                            <a href="#">1</a>
                        </li>
                        <li>
                            <a href="#">2</a>
                        </li>
                        <li>
                            <a href="#">3</a>
                        </li>
                        <li>
                            <a href="#">4</a>
                        </li>
                        <li>
                            <a href="#">5</a>
                        </li>
                        <li>
                            <a href="#">&raquo;</a>
                        </li>
                    </ul>

                </div>

            </div>

        </div>
    </div>

    <script>
            $(window).resize(function () """),format.raw/*351.42*/("""{"""),format.raw/*351.43*/("""
                """),format.raw/*352.17*/("""var $img = $(".menu1 img");
                var minnHeight = 20000;
                for (var i = 0; i < $img.length; i++) """),format.raw/*354.55*/("""{"""),format.raw/*354.56*/("""
                    """),format.raw/*355.21*/("""var nWidth = $img[i].naturalWidth
                    var nHeight = $img[i].naturalHeight
                    var nowHeight = $img[i].width / nWidth * nHeight;
                    if (minnHeight > nowHeight) """),format.raw/*358.49*/("""{"""),format.raw/*358.50*/("""
                        """),format.raw/*359.25*/("""minnHeight = nowHeight;
                    """),format.raw/*360.21*/("""}"""),format.raw/*360.22*/("""
                """),format.raw/*361.17*/("""}"""),format.raw/*361.18*/("""
                """),format.raw/*362.17*/("""for (var i = 0; i < $img.length; i++) """),format.raw/*362.55*/("""{"""),format.raw/*362.56*/("""
                    """),format.raw/*363.21*/("""$img[i].height = minnHeight;
                """),format.raw/*364.17*/("""}"""),format.raw/*364.18*/("""
            """),format.raw/*365.13*/("""}"""),format.raw/*365.14*/(""");
            $().ready(function () """),format.raw/*366.35*/("""{"""),format.raw/*366.36*/("""
                """),format.raw/*367.17*/("""var $img = $(".menu1 img");
                var minnHeight = 20000;
                for (var i = 0; i < $img.length; i++) """),format.raw/*369.55*/("""{"""),format.raw/*369.56*/("""
                    """),format.raw/*370.21*/("""var nWidth = $img[i].naturalWidth
                    var nHeight = $img[i].naturalHeight
                    var nowHeight = $img[i].width / nWidth * nHeight;
                    if (minnHeight > nowHeight) """),format.raw/*373.49*/("""{"""),format.raw/*373.50*/("""
                        """),format.raw/*374.25*/("""minnHeight = nowHeight;
                    """),format.raw/*375.21*/("""}"""),format.raw/*375.22*/("""
                """),format.raw/*376.17*/("""}"""),format.raw/*376.18*/("""
                """),format.raw/*377.17*/("""for (var i = 0; i < $img.length; i++) """),format.raw/*377.55*/("""{"""),format.raw/*377.56*/("""
                    """),format.raw/*378.21*/("""$img[i].height = minnHeight;
                """),format.raw/*379.17*/("""}"""),format.raw/*379.18*/("""
                """),format.raw/*380.17*/("""$("#select1 dd").click(function () """),format.raw/*380.52*/("""{"""),format.raw/*380.53*/("""
                    """),format.raw/*381.21*/("""$(this).addClass("selected").siblings().removeClass("selected");
                    console.log($(this).text());
                    if ($(this).hasClass("select-all")) """),format.raw/*383.57*/("""{"""),format.raw/*383.58*/("""
                        """),format.raw/*384.25*/("""$("#selectA").remove();
                    """),format.raw/*385.21*/("""}"""),format.raw/*385.22*/(""" """),format.raw/*385.23*/("""else """),format.raw/*385.28*/("""{"""),format.raw/*385.29*/("""
                        """),format.raw/*386.25*/("""var copyThisA = $(this).clone();
                        if ($("#selectA").length > 0) """),format.raw/*387.55*/("""{"""),format.raw/*387.56*/("""
                            """),format.raw/*388.29*/("""$("#selectA a").html($(this).text());
                        """),format.raw/*389.25*/("""}"""),format.raw/*389.26*/(""" """),format.raw/*389.27*/("""else """),format.raw/*389.32*/("""{"""),format.raw/*389.33*/("""
                            """),format.raw/*390.29*/("""$(".select-result dl").append(copyThisA.attr("id", "selectA"));

                        """),format.raw/*392.25*/("""}"""),format.raw/*392.26*/("""
                    """),format.raw/*393.21*/("""}"""),format.raw/*393.22*/("""
                    """),format.raw/*394.21*/("""var $select2 = $("#select2 dd");
                    for (var i = 1; i < $select2.length; i++) """),format.raw/*395.63*/("""{"""),format.raw/*395.64*/("""
                        """),format.raw/*396.25*/("""$select2[i].style.display = "none";
                    """),format.raw/*397.21*/("""}"""),format.raw/*397.22*/("""
                    """),format.raw/*398.21*/("""if ($(this).text() == "全部") """),format.raw/*398.49*/("""{"""),format.raw/*398.50*/("""

                        """),format.raw/*400.25*/("""for (var i = 1; i < $select2.length; i++) """),format.raw/*400.67*/("""{"""),format.raw/*400.68*/("""
                            """),format.raw/*401.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*402.25*/("""}"""),format.raw/*402.26*/("""
                    """),format.raw/*403.21*/("""}"""),format.raw/*403.22*/("""
                    """),format.raw/*404.21*/("""else if ($(this).text() == "前端开发") """),format.raw/*404.56*/("""{"""),format.raw/*404.57*/("""

                        """),format.raw/*406.25*/("""for (var i = 1; i <= 13; i++) """),format.raw/*406.55*/("""{"""),format.raw/*406.56*/("""
                            """),format.raw/*407.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*408.25*/("""}"""),format.raw/*408.26*/("""
                    """),format.raw/*409.21*/("""}"""),format.raw/*409.22*/("""
                    """),format.raw/*410.21*/("""else if ($(this).text() == "后端开发") """),format.raw/*410.56*/("""{"""),format.raw/*410.57*/("""
                        """),format.raw/*411.25*/("""for (var i = 14; i <= 22; i++) """),format.raw/*411.56*/("""{"""),format.raw/*411.57*/("""
                            """),format.raw/*412.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*413.25*/("""}"""),format.raw/*413.26*/("""
                    """),format.raw/*414.21*/("""}"""),format.raw/*414.22*/("""
                    """),format.raw/*415.21*/("""else if ($(this).text() == "移动开发") """),format.raw/*415.56*/("""{"""),format.raw/*415.57*/("""
                        """),format.raw/*416.25*/("""for (var i = 23; i <= 26; i++) """),format.raw/*416.56*/("""{"""),format.raw/*416.57*/("""
                            """),format.raw/*417.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*418.25*/("""}"""),format.raw/*418.26*/("""
                    """),format.raw/*419.21*/("""}"""),format.raw/*419.22*/("""
                    """),format.raw/*420.21*/("""else if ($(this).text() == "数据库") """),format.raw/*420.55*/("""{"""),format.raw/*420.56*/("""
                        """),format.raw/*421.25*/("""for (var i = 27; i <= 30; i++) """),format.raw/*421.56*/("""{"""),format.raw/*421.57*/("""
                            """),format.raw/*422.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*423.25*/("""}"""),format.raw/*423.26*/("""
                    """),format.raw/*424.21*/("""}"""),format.raw/*424.22*/("""
                    """),format.raw/*425.21*/("""else if ($(this).text() == "人工智能") """),format.raw/*425.56*/("""{"""),format.raw/*425.57*/("""
                        """),format.raw/*426.25*/("""for (var i = 31; i <= 32; i++) """),format.raw/*426.56*/("""{"""),format.raw/*426.57*/("""
                            """),format.raw/*427.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*428.25*/("""}"""),format.raw/*428.26*/("""
                    """),format.raw/*429.21*/("""}"""),format.raw/*429.22*/("""
                    """),format.raw/*430.21*/("""else if ($(this).text() == "云计算&大数据") """),format.raw/*430.59*/("""{"""),format.raw/*430.60*/("""
                        """),format.raw/*431.25*/("""for (var i = 33; i <= 34; i++) """),format.raw/*431.56*/("""{"""),format.raw/*431.57*/("""
                            """),format.raw/*432.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*433.25*/("""}"""),format.raw/*433.26*/("""
                    """),format.raw/*434.21*/("""}"""),format.raw/*434.22*/("""
                    """),format.raw/*435.21*/("""else if ($(this).text() == "运维&测试") """),format.raw/*435.57*/("""{"""),format.raw/*435.58*/("""
                        """),format.raw/*436.25*/("""for (var i = 35; i <= 36; i++) """),format.raw/*436.56*/("""{"""),format.raw/*436.57*/("""
                            """),format.raw/*437.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*438.25*/("""}"""),format.raw/*438.26*/("""
                    """),format.raw/*439.21*/("""}"""),format.raw/*439.22*/("""
                    """),format.raw/*440.21*/("""else if ($(this).text() == "UI设计") """),format.raw/*440.56*/("""{"""),format.raw/*440.57*/("""
                        """),format.raw/*441.25*/("""for (var i = 37; i <= 40; i++) """),format.raw/*441.56*/("""{"""),format.raw/*441.57*/("""
                            """),format.raw/*442.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*443.25*/("""}"""),format.raw/*443.26*/("""
                    """),format.raw/*444.21*/("""}"""),format.raw/*444.22*/("""
                """),format.raw/*445.17*/("""}"""),format.raw/*445.18*/(""")
            """),format.raw/*446.13*/("""}"""),format.raw/*446.14*/(""")

            $("#select2 dd").click(function () """),format.raw/*448.48*/("""{"""),format.raw/*448.49*/("""
                """),format.raw/*449.17*/("""$(this).addClass("selected").siblings().removeClass("selected");
                if ($(this).hasClass("select-all")) """),format.raw/*450.53*/("""{"""),format.raw/*450.54*/("""
                    """),format.raw/*451.21*/("""$("#selectB").remove();
                """),format.raw/*452.17*/("""}"""),format.raw/*452.18*/(""" """),format.raw/*452.19*/("""else """),format.raw/*452.24*/("""{"""),format.raw/*452.25*/("""
                    """),format.raw/*453.21*/("""var copyThisB = $(this).clone();
                    if ($("#selectB").length > 0) """),format.raw/*454.51*/("""{"""),format.raw/*454.52*/("""
                        """),format.raw/*455.25*/("""$("#selectB a").html($(this).text());
                    """),format.raw/*456.21*/("""}"""),format.raw/*456.22*/(""" """),format.raw/*456.23*/("""else """),format.raw/*456.28*/("""{"""),format.raw/*456.29*/("""
                        """),format.raw/*457.25*/("""$(".select-result dl").append(copyThisB.attr("id", "selectB"));
                    """),format.raw/*458.21*/("""}"""),format.raw/*458.22*/("""
                """),format.raw/*459.17*/("""}"""),format.raw/*459.18*/("""

            """),format.raw/*461.13*/("""}"""),format.raw/*461.14*/(""");

            $("#select3 dd").click(function () """),format.raw/*463.48*/("""{"""),format.raw/*463.49*/("""
                """),format.raw/*464.17*/("""$(this).addClass("selected").siblings().removeClass("selected");
                if ($(this).hasClass("select-all")) """),format.raw/*465.53*/("""{"""),format.raw/*465.54*/("""
                    """),format.raw/*466.21*/("""$("#selectC").remove();
                """),format.raw/*467.17*/("""}"""),format.raw/*467.18*/(""" """),format.raw/*467.19*/("""else """),format.raw/*467.24*/("""{"""),format.raw/*467.25*/("""
                    """),format.raw/*468.21*/("""var copyThisC = $(this).clone();
                    if ($("#selectC").length > 0) """),format.raw/*469.51*/("""{"""),format.raw/*469.52*/("""
                        """),format.raw/*470.25*/("""$("#selectC a").html($(this).text());
                    """),format.raw/*471.21*/("""}"""),format.raw/*471.22*/(""" """),format.raw/*471.23*/("""else """),format.raw/*471.28*/("""{"""),format.raw/*471.29*/("""
                        """),format.raw/*472.25*/("""$(".select-result dl").append(copyThisC.attr("id", "selectC"));
                    """),format.raw/*473.21*/("""}"""),format.raw/*473.22*/("""
                """),format.raw/*474.17*/("""}"""),format.raw/*474.18*/("""
            """),format.raw/*475.13*/("""}"""),format.raw/*475.14*/(""");
    </script>
""")))}))
      }
    }
  }

  def render(curpage:List[BookInfos],request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(curpage)(request)

  def f:((List[BookInfos]) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (curpage) => (request) => apply(curpage)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Apr 21 12:27:13 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/search.scala.html
                  HASH: 60da945456f6bbe95ee370fe94ca5d0b06c7ee45
                  MATRIX: 753->1|907->60|936->64|954->74|993->76|1025->82|12842->11878|12904->11946|12970->12028|13036->12103|13102->12164|13172->12217|13242->12284|13308->12329|13374->12391|13444->12456|13510->12501|13572->12544|13630->12582|13689->12613|13726->12633|13766->12634|13828->12667|13992->12803|14006->12807|14031->12810|14092->12842|14107->12846|14133->12849|14237->12925|14251->12929|14279->12935|14653->13281|14667->13285|14696->13292|14891->13455|14945->13480|18200->16706|18230->16707|18276->16724|18427->16846|18457->16847|18507->16868|18744->17076|18774->17077|18828->17102|18901->17146|18931->17147|18977->17164|19007->17165|19053->17182|19120->17220|19150->17221|19200->17242|19274->17287|19304->17288|19346->17301|19376->17302|19442->17339|19472->17340|19518->17357|19669->17479|19699->17480|19749->17501|19986->17709|20016->17710|20070->17735|20143->17779|20173->17780|20219->17797|20249->17798|20295->17815|20362->17853|20392->17854|20442->17875|20516->17920|20546->17921|20592->17938|20656->17973|20686->17974|20736->17995|20935->18165|20965->18166|21019->18191|21092->18235|21122->18236|21152->18237|21186->18242|21216->18243|21270->18268|21386->18355|21416->18356|21474->18385|21565->18447|21595->18448|21625->18449|21659->18454|21689->18455|21747->18484|21865->18573|21895->18574|21945->18595|21975->18596|22025->18617|22149->18712|22179->18713|22233->18738|22318->18794|22348->18795|22398->18816|22455->18844|22485->18845|22540->18871|22611->18913|22641->18914|22699->18943|22796->19011|22826->19012|22876->19033|22906->19034|22956->19055|23020->19090|23050->19091|23105->19117|23164->19147|23194->19148|23252->19177|23349->19245|23379->19246|23429->19267|23459->19268|23509->19289|23573->19324|23603->19325|23657->19350|23717->19381|23747->19382|23805->19411|23902->19479|23932->19480|23982->19501|24012->19502|24062->19523|24126->19558|24156->19559|24210->19584|24270->19615|24300->19616|24358->19645|24455->19713|24485->19714|24535->19735|24565->19736|24615->19757|24678->19791|24708->19792|24762->19817|24822->19848|24852->19849|24910->19878|25000->19939|25030->19940|25080->19961|25110->19962|25160->19983|25224->20018|25254->20019|25308->20044|25368->20075|25398->20076|25456->20105|25546->20166|25576->20167|25626->20188|25656->20189|25706->20210|25773->20248|25803->20249|25857->20274|25917->20305|25947->20306|26005->20335|26095->20396|26125->20397|26175->20418|26205->20419|26255->20440|26320->20476|26350->20477|26404->20502|26464->20533|26494->20534|26552->20563|26642->20624|26672->20625|26722->20646|26752->20647|26802->20668|26866->20703|26896->20704|26950->20729|27010->20760|27040->20761|27098->20790|27188->20851|27218->20852|27268->20873|27298->20874|27344->20891|27374->20892|27417->20906|27447->20907|27526->20957|27556->20958|27602->20975|27748->21092|27778->21093|27828->21114|27897->21154|27927->21155|27957->21156|27991->21161|28021->21162|28071->21183|28183->21266|28213->21267|28267->21292|28354->21350|28384->21351|28414->21352|28448->21357|28478->21358|28532->21383|28645->21467|28675->21468|28721->21485|28751->21486|28794->21500|28824->21501|28904->21552|28934->21553|28980->21570|29126->21687|29156->21688|29206->21709|29275->21749|29305->21750|29335->21751|29369->21756|29399->21757|29449->21778|29561->21861|29591->21862|29645->21887|29732->21945|29762->21946|29792->21947|29826->21952|29856->21953|29910->21978|30023->22062|30053->22063|30099->22080|30129->22081|30171->22094|30201->22095
                  LINES: 21->1|26->1|29->4|29->4|29->4|31->6|264->239|265->240|266->241|267->242|268->243|269->244|270->245|271->246|272->247|273->248|274->249|275->250|276->251|278->253|278->253|278->253|279->254|281->256|281->256|281->256|281->256|281->256|281->256|282->257|282->257|282->257|288->263|288->263|288->263|292->267|293->268|376->351|376->351|377->352|379->354|379->354|380->355|383->358|383->358|384->359|385->360|385->360|386->361|386->361|387->362|387->362|387->362|388->363|389->364|389->364|390->365|390->365|391->366|391->366|392->367|394->369|394->369|395->370|398->373|398->373|399->374|400->375|400->375|401->376|401->376|402->377|402->377|402->377|403->378|404->379|404->379|405->380|405->380|405->380|406->381|408->383|408->383|409->384|410->385|410->385|410->385|410->385|410->385|411->386|412->387|412->387|413->388|414->389|414->389|414->389|414->389|414->389|415->390|417->392|417->392|418->393|418->393|419->394|420->395|420->395|421->396|422->397|422->397|423->398|423->398|423->398|425->400|425->400|425->400|426->401|427->402|427->402|428->403|428->403|429->404|429->404|429->404|431->406|431->406|431->406|432->407|433->408|433->408|434->409|434->409|435->410|435->410|435->410|436->411|436->411|436->411|437->412|438->413|438->413|439->414|439->414|440->415|440->415|440->415|441->416|441->416|441->416|442->417|443->418|443->418|444->419|444->419|445->420|445->420|445->420|446->421|446->421|446->421|447->422|448->423|448->423|449->424|449->424|450->425|450->425|450->425|451->426|451->426|451->426|452->427|453->428|453->428|454->429|454->429|455->430|455->430|455->430|456->431|456->431|456->431|457->432|458->433|458->433|459->434|459->434|460->435|460->435|460->435|461->436|461->436|461->436|462->437|463->438|463->438|464->439|464->439|465->440|465->440|465->440|466->441|466->441|466->441|467->442|468->443|468->443|469->444|469->444|470->445|470->445|471->446|471->446|473->448|473->448|474->449|475->450|475->450|476->451|477->452|477->452|477->452|477->452|477->452|478->453|479->454|479->454|480->455|481->456|481->456|481->456|481->456|481->456|482->457|483->458|483->458|484->459|484->459|486->461|486->461|488->463|488->463|489->464|490->465|490->465|491->466|492->467|492->467|492->467|492->467|492->467|493->468|494->469|494->469|495->470|496->471|496->471|496->471|496->471|496->471|497->472|498->473|498->473|499->474|499->474|500->475|500->475
                  -- GENERATED --
              */
          