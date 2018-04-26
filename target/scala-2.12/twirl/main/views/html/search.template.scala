
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


    <div class="clear"></div>
    <b class="line"></b>
    <div class="search">
        <div class="search-list">
            <div class="nav-table">
            </div>

            <div class="am-g am-g-fixed">

                <div class="am-u-sm-12 am-u-md-12">
                    <div class="theme-popover">
                        <ul class="select">
                            <p class="title font-normal">

                                <span class="total fl">全部分类</span>
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
                                        <dd><a href="/search?key=HTML/CSS">HTML/CSS</a></dd>
                                        <dd><a href="/search?key=JavaScript">JavaScript</a></dd>
                                        <dd><a href="/search?key=Html5">Html5</a></dd>
                                        <dd><a href="/search?key=CSS3">CSS3</a></dd>
                                        <dd><a href="/search?key=jQuery">jQuery</a></dd>
                                        <dd><a href="/search?key=Node.js">Node.js</a></dd>
                                        <dd><a href="/search?key=Bootstrap">Bootstrap</a></dd>
                                        <dd><a href="/search?key=Angular">Angular</a></dd>
                                        <dd><a href="/search?key=React.js">React.js</a></dd>
                                        <dd>
                                            <a href="/search?key=Vue.js">Vue.js</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=Saaa/Less">Saaa/Less</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=WebApp">WebApp</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=前端工具">前端工具</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=PHP">PHP</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=Java">Java</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=SpringBoot">SpringBoot</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=Python">Python</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=C">C</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=C++">C++</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=Go">Go</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=C#">C#</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=Ruby">Ruby</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=Android">Android</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=iOS">iOS</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=Unity 3D">Unity 3D</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">Cocos2d-x</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">MySQL</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">MongoDB</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">Oracle</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">SQL Server</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">机器学习</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">深度学习</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">大数据</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">云计算</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">测试</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">Linux</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">动效动画</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">APPUI设计</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">设计工具</a>
                                        </dd>
                                        <dd>
                                            <a href="/search?key=机器学习">设计基础</a>
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
                        """),_display_(/*216.26*/for(book <- curpage) yield /*216.46*/{_display_(Seq[Any](format.raw/*216.47*/("""
                            """),format.raw/*217.29*/("""<li>
                                <div class="i-pic limit menu1">
                                    <a href="/introdution/"""),_display_(/*219.60*/book/*219.64*/.id),format.raw/*219.67*/(""""><img src="/assets/ProjectImg/"""),_display_(/*219.99*/book/*219.103*/.id),format.raw/*219.106*/("""-1.jpg" /></a>
                                    <p class="title fl">"""),_display_(/*220.58*/book/*220.62*/.title),format.raw/*220.68*/("""</p>
                                    <p class="number fl">
                                     	       剩余<span>"""),_display_(/*222.55*/book/*222.59*/.amount),format.raw/*222.66*/("""</span>
                                     	   </p>
                                </div>
                            </li>
                        """)))}),format.raw/*226.26*/("""
                        """),format.raw/*227.25*/("""</ul>

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
            <div class="footer">
                <div class="footer-bd">
                    <p>
                            <!--<em>吉首大学创新创业实验室</em>-->
                    </p>
                </div>
            </div>
        </div>
    </div>

    <script>
            $(window).resize(function() """),format.raw/*316.41*/("""{"""),format.raw/*316.42*/("""
                """),format.raw/*317.17*/("""var $img = $(".menu1 img");
                var minnHeight = 20000;
                for(var i = 0; i < $img.length; i++) """),format.raw/*319.54*/("""{"""),format.raw/*319.55*/("""
                    """),format.raw/*320.21*/("""var nWidth = $img[i].naturalWidth
                    var nHeight = $img[i].naturalHeight
                    var nowHeight = $img[i].width / nWidth * nHeight;
                    if(minnHeight > nowHeight) """),format.raw/*323.48*/("""{"""),format.raw/*323.49*/("""
                        """),format.raw/*324.25*/("""minnHeight = nowHeight;
                    """),format.raw/*325.21*/("""}"""),format.raw/*325.22*/("""
                """),format.raw/*326.17*/("""}"""),format.raw/*326.18*/("""
                """),format.raw/*327.17*/("""for(var i = 0; i < $img.length; i++) """),format.raw/*327.54*/("""{"""),format.raw/*327.55*/("""
                    """),format.raw/*328.21*/("""$img[i].height = minnHeight;
                """),format.raw/*329.17*/("""}"""),format.raw/*329.18*/("""
            """),format.raw/*330.13*/("""}"""),format.raw/*330.14*/(""");
            $().ready(function() """),format.raw/*331.34*/("""{"""),format.raw/*331.35*/("""
                """),format.raw/*332.17*/("""var $img = $(".menu1 img");
                var minnHeight = 218;
                for(var i = 0; i < $img.length; i++) """),format.raw/*334.54*/("""{"""),format.raw/*334.55*/("""
                    """),format.raw/*335.21*/("""var nWidth = $img[i].naturalWidth
                    var nHeight = $img[i].naturalHeight
                    var nowHeight = $img[i].width / nWidth * nHeight;
                    if(minnHeight > nowHeight) """),format.raw/*338.48*/("""{"""),format.raw/*338.49*/("""
                        """),format.raw/*339.25*/("""minnHeight = nowHeight;
                    """),format.raw/*340.21*/("""}"""),format.raw/*340.22*/("""
                """),format.raw/*341.17*/("""}"""),format.raw/*341.18*/("""
                """),format.raw/*342.17*/("""for(var i = 0; i < $img.length; i++) """),format.raw/*342.54*/("""{"""),format.raw/*342.55*/("""
                    """),format.raw/*343.21*/("""$img[i].height = minnHeight;
                """),format.raw/*344.17*/("""}"""),format.raw/*344.18*/("""

                """),format.raw/*346.17*/("""$("#select1 dd").click(function() """),format.raw/*346.51*/("""{"""),format.raw/*346.52*/("""
                    """),format.raw/*347.21*/("""$(this).addClass("selected").siblings().removeClass("selected");
                    console.log($(this).text());
                    if($(this).hasClass("select-all")) """),format.raw/*349.56*/("""{"""),format.raw/*349.57*/("""
                        """),format.raw/*350.25*/("""$("#selectA").remove();
                    """),format.raw/*351.21*/("""}"""),format.raw/*351.22*/(""" """),format.raw/*351.23*/("""else """),format.raw/*351.28*/("""{"""),format.raw/*351.29*/("""
                        """),format.raw/*352.25*/("""var copyThisA = $(this).clone();
                        if($("#selectA").length > 0) """),format.raw/*353.54*/("""{"""),format.raw/*353.55*/("""
                            """),format.raw/*354.29*/("""$("#selectA a").html($(this).text());
                        """),format.raw/*355.25*/("""}"""),format.raw/*355.26*/(""" """),format.raw/*355.27*/("""else """),format.raw/*355.32*/("""{"""),format.raw/*355.33*/("""
                            """),format.raw/*356.29*/("""$(".select-result dl").append(copyThisA.attr("id", "selectA"));

                        """),format.raw/*358.25*/("""}"""),format.raw/*358.26*/("""
                    """),format.raw/*359.21*/("""}"""),format.raw/*359.22*/("""
                    """),format.raw/*360.21*/("""var $select2 = $("#select2 dd");
                    for (var i = 1; i < $select2.length; i++)"""),format.raw/*361.62*/("""{"""),format.raw/*361.63*/("""
                        """),format.raw/*362.25*/("""$select2[i].style.display = "none";
                    """),format.raw/*363.21*/("""}"""),format.raw/*363.22*/("""
                    """),format.raw/*364.21*/("""if($(this).text() == "全部")"""),format.raw/*364.47*/("""{"""),format.raw/*364.48*/("""

                        """),format.raw/*366.25*/("""for (var i = 1; i < $select2.length; i++)"""),format.raw/*366.66*/("""{"""),format.raw/*366.67*/("""
                            """),format.raw/*367.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*368.25*/("""}"""),format.raw/*368.26*/("""
                    """),format.raw/*369.21*/("""}"""),format.raw/*369.22*/("""
                    """),format.raw/*370.21*/("""else if($(this).text() == "前端开发")"""),format.raw/*370.54*/("""{"""),format.raw/*370.55*/("""

                        """),format.raw/*372.25*/("""for (var i = 1; i <= 13; i++)"""),format.raw/*372.54*/("""{"""),format.raw/*372.55*/("""
                            """),format.raw/*373.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*374.25*/("""}"""),format.raw/*374.26*/("""
                    """),format.raw/*375.21*/("""}"""),format.raw/*375.22*/("""
                    """),format.raw/*376.21*/("""else if($(this).text() == "后端开发")"""),format.raw/*376.54*/("""{"""),format.raw/*376.55*/("""
                        """),format.raw/*377.25*/("""for (var i = 14; i <= 22; i++)"""),format.raw/*377.55*/("""{"""),format.raw/*377.56*/("""
                            """),format.raw/*378.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*379.25*/("""}"""),format.raw/*379.26*/("""
                    """),format.raw/*380.21*/("""}"""),format.raw/*380.22*/("""
                    """),format.raw/*381.21*/("""else if($(this).text() == "移动开发")"""),format.raw/*381.54*/("""{"""),format.raw/*381.55*/("""
                        """),format.raw/*382.25*/("""for (var i = 23; i <= 26; i++)"""),format.raw/*382.55*/("""{"""),format.raw/*382.56*/("""
                            """),format.raw/*383.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*384.25*/("""}"""),format.raw/*384.26*/("""
                    """),format.raw/*385.21*/("""}"""),format.raw/*385.22*/("""
                    """),format.raw/*386.21*/("""else if($(this).text() == "数据库")"""),format.raw/*386.53*/("""{"""),format.raw/*386.54*/("""
                        """),format.raw/*387.25*/("""for (var i = 27; i <= 30; i++)"""),format.raw/*387.55*/("""{"""),format.raw/*387.56*/("""
                            """),format.raw/*388.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*389.25*/("""}"""),format.raw/*389.26*/("""
                    """),format.raw/*390.21*/("""}"""),format.raw/*390.22*/("""
                    """),format.raw/*391.21*/("""else if($(this).text() == "人工智能")"""),format.raw/*391.54*/("""{"""),format.raw/*391.55*/("""
                        """),format.raw/*392.25*/("""for (var i = 31; i <= 32; i++)"""),format.raw/*392.55*/("""{"""),format.raw/*392.56*/("""
                            """),format.raw/*393.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*394.25*/("""}"""),format.raw/*394.26*/("""
                    """),format.raw/*395.21*/("""}"""),format.raw/*395.22*/("""
                    """),format.raw/*396.21*/("""else if($(this).text() == "云计算&大数据")"""),format.raw/*396.57*/("""{"""),format.raw/*396.58*/("""
                        """),format.raw/*397.25*/("""for (var i = 33; i <= 34; i++)"""),format.raw/*397.55*/("""{"""),format.raw/*397.56*/("""
                            """),format.raw/*398.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*399.25*/("""}"""),format.raw/*399.26*/("""
                    """),format.raw/*400.21*/("""}"""),format.raw/*400.22*/("""
                    """),format.raw/*401.21*/("""else if($(this).text() == "运维&测试")"""),format.raw/*401.55*/("""{"""),format.raw/*401.56*/("""
                        """),format.raw/*402.25*/("""for (var i = 35; i <= 36; i++)"""),format.raw/*402.55*/("""{"""),format.raw/*402.56*/("""
                            """),format.raw/*403.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*404.25*/("""}"""),format.raw/*404.26*/("""
                    """),format.raw/*405.21*/("""}"""),format.raw/*405.22*/("""
                    """),format.raw/*406.21*/("""else if($(this).text() == "UI设计")"""),format.raw/*406.54*/("""{"""),format.raw/*406.55*/("""
                        """),format.raw/*407.25*/("""for (var i = 37; i <= 40; i++)"""),format.raw/*407.55*/("""{"""),format.raw/*407.56*/("""
                            """),format.raw/*408.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*409.25*/("""}"""),format.raw/*409.26*/("""
                    """),format.raw/*410.21*/("""}"""),format.raw/*410.22*/("""
                """),format.raw/*411.17*/("""}"""),format.raw/*411.18*/(""")
            """),format.raw/*412.13*/("""}"""),format.raw/*412.14*/(""")

            $("#select2 dd").click(function() """),format.raw/*414.47*/("""{"""),format.raw/*414.48*/("""
                """),format.raw/*415.17*/("""$(this).addClass("selected").siblings().removeClass("selected");
                if($(this).hasClass("select-all")) """),format.raw/*416.52*/("""{"""),format.raw/*416.53*/("""
                    """),format.raw/*417.21*/("""$("#selectB").remove();
                """),format.raw/*418.17*/("""}"""),format.raw/*418.18*/(""" """),format.raw/*418.19*/("""else """),format.raw/*418.24*/("""{"""),format.raw/*418.25*/("""
                    """),format.raw/*419.21*/("""var copyThisB = $(this).clone();
                    if($("#selectB").length > 0) """),format.raw/*420.50*/("""{"""),format.raw/*420.51*/("""
                        """),format.raw/*421.25*/("""$("#selectB a").html($(this).text());
                    """),format.raw/*422.21*/("""}"""),format.raw/*422.22*/(""" """),format.raw/*422.23*/("""else """),format.raw/*422.28*/("""{"""),format.raw/*422.29*/("""
                        """),format.raw/*423.25*/("""$(".select-result dl").append(copyThisB.attr("id", "selectB"));
                    """),format.raw/*424.21*/("""}"""),format.raw/*424.22*/("""
                """),format.raw/*425.17*/("""}"""),format.raw/*425.18*/("""

            """),format.raw/*427.13*/("""}"""),format.raw/*427.14*/(""");

            $("#select3 dd").click(function() """),format.raw/*429.47*/("""{"""),format.raw/*429.48*/("""
                """),format.raw/*430.17*/("""$(this).addClass("selected").siblings().removeClass("selected");
                if($(this).hasClass("select-all")) """),format.raw/*431.52*/("""{"""),format.raw/*431.53*/("""
                    """),format.raw/*432.21*/("""$("#selectC").remove();
                """),format.raw/*433.17*/("""}"""),format.raw/*433.18*/(""" """),format.raw/*433.19*/("""else """),format.raw/*433.24*/("""{"""),format.raw/*433.25*/("""
                    """),format.raw/*434.21*/("""var copyThisC = $(this).clone();
                    if($("#selectC").length > 0) """),format.raw/*435.50*/("""{"""),format.raw/*435.51*/("""
                        """),format.raw/*436.25*/("""$("#selectC a").html($(this).text());
                    """),format.raw/*437.21*/("""}"""),format.raw/*437.22*/(""" """),format.raw/*437.23*/("""else """),format.raw/*437.28*/("""{"""),format.raw/*437.29*/("""
                        """),format.raw/*438.25*/("""$(".select-result dl").append(copyThisC.attr("id", "selectC"));
                    """),format.raw/*439.21*/("""}"""),format.raw/*439.22*/("""
                """),format.raw/*440.17*/("""}"""),format.raw/*440.18*/("""
            """),format.raw/*441.13*/("""}"""),format.raw/*441.14*/(""");
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
                  DATE: Thu Apr 26 14:15:23 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/search.scala.html
                  HASH: d65fbdc01492d268a5471f21d0c7698e2713488c
                  MATRIX: 753->1|907->60|936->64|954->74|993->76|1025->82|12352->11381|12389->11401|12429->11402|12487->11431|12643->11559|12657->11563|12682->11566|12742->11598|12757->11602|12783->11605|12883->11677|12897->11681|12925->11687|13070->11804|13084->11808|13113->11815|13297->11967|13351->11992|16824->15436|16854->15437|16900->15454|17050->15575|17080->15576|17130->15597|17366->15804|17396->15805|17450->15830|17523->15874|17553->15875|17599->15892|17629->15893|17675->15910|17741->15947|17771->15948|17821->15969|17895->16014|17925->16015|17967->16028|17997->16029|18062->16065|18092->16066|18138->16083|18286->16202|18316->16203|18366->16224|18602->16431|18632->16432|18686->16457|18759->16501|18789->16502|18835->16519|18865->16520|18911->16537|18977->16574|19007->16575|19057->16596|19131->16641|19161->16642|19208->16660|19271->16694|19301->16695|19351->16716|19549->16885|19579->16886|19633->16911|19706->16955|19736->16956|19766->16957|19800->16962|19830->16963|19884->16988|19999->17074|20029->17075|20087->17104|20178->17166|20208->17167|20238->17168|20272->17173|20302->17174|20360->17203|20478->17292|20508->17293|20558->17314|20588->17315|20638->17336|20761->17430|20791->17431|20845->17456|20930->17512|20960->17513|21010->17534|21065->17560|21095->17561|21150->17587|21220->17628|21250->17629|21308->17658|21405->17726|21435->17727|21485->17748|21515->17749|21565->17770|21627->17803|21657->17804|21712->17830|21770->17859|21800->17860|21858->17889|21955->17957|21985->17958|22035->17979|22065->17980|22115->18001|22177->18034|22207->18035|22261->18060|22320->18090|22350->18091|22408->18120|22505->18188|22535->18189|22585->18210|22615->18211|22665->18232|22727->18265|22757->18266|22811->18291|22870->18321|22900->18322|22958->18351|23055->18419|23085->18420|23135->18441|23165->18442|23215->18463|23276->18495|23306->18496|23360->18521|23419->18551|23449->18552|23507->18581|23597->18642|23627->18643|23677->18664|23707->18665|23757->18686|23819->18719|23849->18720|23903->18745|23962->18775|23992->18776|24050->18805|24140->18866|24170->18867|24220->18888|24250->18889|24300->18910|24365->18946|24395->18947|24449->18972|24508->19002|24538->19003|24596->19032|24686->19093|24716->19094|24766->19115|24796->19116|24846->19137|24909->19171|24939->19172|24993->19197|25052->19227|25082->19228|25140->19257|25230->19318|25260->19319|25310->19340|25340->19341|25390->19362|25452->19395|25482->19396|25536->19421|25595->19451|25625->19452|25683->19481|25773->19542|25803->19543|25853->19564|25883->19565|25929->19582|25959->19583|26002->19597|26032->19598|26110->19647|26140->19648|26186->19665|26331->19781|26361->19782|26411->19803|26480->19843|26510->19844|26540->19845|26574->19850|26604->19851|26654->19872|26765->19954|26795->19955|26849->19980|26936->20038|26966->20039|26996->20040|27030->20045|27060->20046|27114->20071|27227->20155|27257->20156|27303->20173|27333->20174|27376->20188|27406->20189|27485->20239|27515->20240|27561->20257|27706->20373|27736->20374|27786->20395|27855->20435|27885->20436|27915->20437|27949->20442|27979->20443|28029->20464|28140->20546|28170->20547|28224->20572|28311->20630|28341->20631|28371->20632|28405->20637|28435->20638|28489->20663|28602->20747|28632->20748|28678->20765|28708->20766|28750->20779|28780->20780
                  LINES: 21->1|26->1|29->4|29->4|29->4|31->6|241->216|241->216|241->216|242->217|244->219|244->219|244->219|244->219|244->219|244->219|245->220|245->220|245->220|247->222|247->222|247->222|251->226|252->227|341->316|341->316|342->317|344->319|344->319|345->320|348->323|348->323|349->324|350->325|350->325|351->326|351->326|352->327|352->327|352->327|353->328|354->329|354->329|355->330|355->330|356->331|356->331|357->332|359->334|359->334|360->335|363->338|363->338|364->339|365->340|365->340|366->341|366->341|367->342|367->342|367->342|368->343|369->344|369->344|371->346|371->346|371->346|372->347|374->349|374->349|375->350|376->351|376->351|376->351|376->351|376->351|377->352|378->353|378->353|379->354|380->355|380->355|380->355|380->355|380->355|381->356|383->358|383->358|384->359|384->359|385->360|386->361|386->361|387->362|388->363|388->363|389->364|389->364|389->364|391->366|391->366|391->366|392->367|393->368|393->368|394->369|394->369|395->370|395->370|395->370|397->372|397->372|397->372|398->373|399->374|399->374|400->375|400->375|401->376|401->376|401->376|402->377|402->377|402->377|403->378|404->379|404->379|405->380|405->380|406->381|406->381|406->381|407->382|407->382|407->382|408->383|409->384|409->384|410->385|410->385|411->386|411->386|411->386|412->387|412->387|412->387|413->388|414->389|414->389|415->390|415->390|416->391|416->391|416->391|417->392|417->392|417->392|418->393|419->394|419->394|420->395|420->395|421->396|421->396|421->396|422->397|422->397|422->397|423->398|424->399|424->399|425->400|425->400|426->401|426->401|426->401|427->402|427->402|427->402|428->403|429->404|429->404|430->405|430->405|431->406|431->406|431->406|432->407|432->407|432->407|433->408|434->409|434->409|435->410|435->410|436->411|436->411|437->412|437->412|439->414|439->414|440->415|441->416|441->416|442->417|443->418|443->418|443->418|443->418|443->418|444->419|445->420|445->420|446->421|447->422|447->422|447->422|447->422|447->422|448->423|449->424|449->424|450->425|450->425|452->427|452->427|454->429|454->429|455->430|456->431|456->431|457->432|458->433|458->433|458->433|458->433|458->433|459->434|460->435|460->435|461->436|462->437|462->437|462->437|462->437|462->437|463->438|464->439|464->439|465->440|465->440|466->441|466->441
                  -- GENERATED --
              */
          