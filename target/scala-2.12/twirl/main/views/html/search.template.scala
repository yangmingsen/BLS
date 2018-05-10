
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

object search extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[BookInfos],Int,Int,String,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(curpage: List[BookInfos], page: Int, total: Int, key: String)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.97*/("""


"""),_display_(/*4.2*/main("搜索")/*4.12*/ {_display_(Seq[Any](format.raw/*4.14*/("""

    """),format.raw/*6.5*/("""<link href="/assets/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="/assets/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />

    <link href="/assets/basic/css/demo.css" rel="stylesheet" type="text/css" />

    <link href="/assets/css/seastyle.css" rel="stylesheet" type="text/css" />

    <link href="/assets/add/css/base.css" rel="stylesheet" type="text/css" />

    <script type="text/javascript" src="/assets/basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="/assets/add/js/query-3.3.1.min.js"></script>
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

                            <script type="text/javascript">
                                function goTo(elem) """),format.raw/*65.53*/("""{"""),format.raw/*65.54*/("""
                                    """),format.raw/*66.37*/("""var path = $(elem).attr('name');
                                    $.ajax("""),format.raw/*67.44*/("""{"""),format.raw/*67.45*/("""
                                        """),format.raw/*68.41*/("""type: "GET",
                                        datatype: "html",
                                        url: path,
                                        async: true,
                                        success: function (data) """),format.raw/*72.66*/("""{"""),format.raw/*72.67*/("""
                                            """),format.raw/*73.45*/("""$("#mianConetnt").html(data);
                                        """),format.raw/*74.41*/("""}"""),format.raw/*74.42*/(""",
                                        error: function () """),format.raw/*75.60*/("""{"""),format.raw/*75.61*/("""
                                            """),format.raw/*76.45*/("""alert("请求错误!!");
                                        """),format.raw/*77.41*/("""}"""),format.raw/*77.42*/("""

                                    """),format.raw/*79.37*/("""}"""),format.raw/*79.38*/(""");
                                """),format.raw/*80.33*/("""}"""),format.raw/*80.34*/("""
                            """),format.raw/*81.29*/("""</script>

                            <li class="select-list">
                                <dl id="select2">
                                    <dt class="am-badge am-round">分类</dt>
                                    <div class="dd-conent">
                                        <dd class="select-all selected">
                                            <a href="#">全部</a>
                                        </dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=html">HTML/CSS</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=JavaScript">JavaScript</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=html">Html5</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=css">CSS</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=jQuery">jQuery</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=Node.js">Node.js</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=Bootstrap">Bootstrap</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=Angular">Angular</a></dd>
                                        <dd><a href="####" onclick="goTo(this)" name="/searchN?key=React.js">React.js</a></dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" oNnclick="goTo(this)" >Vue.js</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Saaa/Less" >Saaa/Less</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=WebApp">WebApp</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=前端工具">前端工具</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=PHP">PHP</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Java">Java</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=SpringBoot">SpringBoot</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Python">Python</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=C">C</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=C%2B%2B" href="####" onclick="goTo(this)">C++</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Go">Go</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=C#">C#</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Ruby">Ruby</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Android">Android</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=iOS">iOS</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Unity 3D">Unity 3D</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=机器学习">Cocos2d-x</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=mysql">MySQL</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=MongoDB">MongoDB</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Oracle">Oracle</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=SQL Server">SQL Server</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=机器学习">机器学习</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=acm">ACM</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=算法">算法</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=深度学习">深度学习</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=大数据">大数据</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=云计算">云计算</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=测试">测试</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=Linux">Linux</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=动效动画">动效动画</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=APPUI设计">APPUI设计</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=工具">设计工具</a>
                                        </dd>
                                        <dd>
                                            <a href="####" onclick="goTo(this)" name="/searchN?key=基础">设计基础</a>
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

                    <div id="mianConetnt">
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
                        """),_display_(/*246.26*/for(book <- curpage.take(12)) yield /*246.55*/{_display_(Seq[Any](format.raw/*246.56*/("""
                            """),format.raw/*247.29*/("""<li>
                                <div class="i-pic limit menu1">
                                    <a href="/introdution/"""),_display_(/*249.60*/book/*249.64*/.id),format.raw/*249.67*/(""""><img src="/assets/ProjectImg/"""),_display_(/*249.99*/book/*249.103*/.id),format.raw/*249.106*/("""-1.jpg" /></a>
                                    <p class="title fl">"""),_display_(/*250.58*/book/*250.62*/.title),format.raw/*250.68*/("""</p>
                                    <p class="number fl">
                                     	       剩余<span>"""),_display_(/*252.55*/book/*252.59*/.amount),format.raw/*252.66*/("""</span>
                                     	   </p>
                                </div>
                            </li>
                        """)))}),format.raw/*256.26*/("""
                        """),format.raw/*257.25*/("""</ul>

                    </div>

                    <div class="search-side">

                        <div class="side-title">
                            经典书籍
                        </div>
                        <li>
                            <div class="i-pic check menu1">
                                <a href="/introdution/114">
                                <img src="/assets/ProjectImg/114-1.jpg" />
                                <p class="check-title">代码之道</p>
                                <p class="price fl">
                                    """),format.raw/*272.49*/("""
                                    """),format.raw/*273.63*/("""
                                """),format.raw/*274.33*/("""</p>
                                <p class="number fl">
                                    借阅量<span>1110</span>
                                </p>
                                </a>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic check menu1">
                                <a href="/introdution/144">
                                <img src="/assets/ProjectImg/144-1.jpg" />
                                <p class="check-title">算法竞赛入门经典</p>
                                <p class="price fl">
                                    """),format.raw/*287.49*/("""
                                    """),format.raw/*288.62*/("""
                                """),format.raw/*289.33*/("""</p>
                                <p class="number fl">
                                    借阅量<span>1110</span>
                                </p>
                                </a>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic check menu1">
                                <a href="/introdution/272">
                                    <img src="/assets/ProjectImg/272-1.jpg" />
                                        <p class="check-title">大型分布式网站架构</p>
                                             <p class="price fl">
                                    """),format.raw/*302.49*/("""
                                    """),format.raw/*303.63*/("""
                                             """),format.raw/*304.46*/("""</p>
                                        <p class="number fl">
                                            借阅量<span>1110</span>
                                        </p>
                                </a>
                            </div>
                        </li>

                    </div>
                    <div class="clear"></div>
                        <!--分页 -->
                    <ul class="am-pagination am-pagination-right">
                        <li >
                            <a name="/searchN?key="""),_display_(/*317.52*/{key}),format.raw/*317.57*/("""&page="""),_display_(/*317.64*/{if(page<=1) {page} else {page-1}}),format.raw/*317.98*/("""" onclick="goTo(this)">&laquo;</a>
                        </li>
                        <li class="am-active">
                            <a href="####">"""),_display_(/*320.45*/{page}),format.raw/*320.51*/("""/"""),_display_(/*320.53*/{if(total==0) {1} else {total} }),format.raw/*320.85*/("""</a>
                        </li>
                        <li>
                            <a name="/searchN?key="""),_display_(/*323.52*/{key}),format.raw/*323.57*/("""&page="""),_display_(/*323.64*/{if(page>=total) {page} else {page+1}}),format.raw/*323.102*/("""" onclick="goTo(this)">&raquo;</a>
                        </li>
                    </ul>
                    </div>

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
            $(window).resize(function() """),format.raw/*342.41*/("""{"""),format.raw/*342.42*/("""
                """),format.raw/*343.17*/("""var $img = $(".menu1 img");
                var minnHeight = 20000;
                for(var i = 0; i < $img.length; i++) """),format.raw/*345.54*/("""{"""),format.raw/*345.55*/("""
                    """),format.raw/*346.21*/("""var nWidth = $img[i].naturalWidth
                    var nHeight = $img[i].naturalHeight
                    var nowHeight = $img[i].width / nWidth * nHeight;
                    if(minnHeight > nowHeight) """),format.raw/*349.48*/("""{"""),format.raw/*349.49*/("""
                        """),format.raw/*350.25*/("""minnHeight = nowHeight;
                    """),format.raw/*351.21*/("""}"""),format.raw/*351.22*/("""
                """),format.raw/*352.17*/("""}"""),format.raw/*352.18*/("""
                """),format.raw/*353.17*/("""for(var i = 0; i < $img.length; i++) """),format.raw/*353.54*/("""{"""),format.raw/*353.55*/("""
                    """),format.raw/*354.21*/("""$img[i].height = minnHeight;
                """),format.raw/*355.17*/("""}"""),format.raw/*355.18*/("""
            """),format.raw/*356.13*/("""}"""),format.raw/*356.14*/(""");
            $().ready(function() """),format.raw/*357.34*/("""{"""),format.raw/*357.35*/("""
                """),format.raw/*358.17*/("""var $img = $(".menu1 img");
                var minnHeight = 218;
                for(var i = 0; i < $img.length; i++) """),format.raw/*360.54*/("""{"""),format.raw/*360.55*/("""
                    """),format.raw/*361.21*/("""var nWidth = $img[i].naturalWidth
                    var nHeight = $img[i].naturalHeight
                    var nowHeight = $img[i].width / nWidth * nHeight;
                    if(minnHeight > nowHeight) """),format.raw/*364.48*/("""{"""),format.raw/*364.49*/("""
                        """),format.raw/*365.25*/("""minnHeight = nowHeight;
                    """),format.raw/*366.21*/("""}"""),format.raw/*366.22*/("""
                """),format.raw/*367.17*/("""}"""),format.raw/*367.18*/("""
                """),format.raw/*368.17*/("""for(var i = 0; i < $img.length; i++) """),format.raw/*368.54*/("""{"""),format.raw/*368.55*/("""
                    """),format.raw/*369.21*/("""$img[i].height = minnHeight;
                """),format.raw/*370.17*/("""}"""),format.raw/*370.18*/("""

                """),format.raw/*372.17*/("""$("#select1 dd").click(function() """),format.raw/*372.51*/("""{"""),format.raw/*372.52*/("""
                    """),format.raw/*373.21*/("""$(this).addClass("selected").siblings().removeClass("selected");
                    console.log($(this).text());
                    if($(this).hasClass("select-all")) """),format.raw/*375.56*/("""{"""),format.raw/*375.57*/("""
                        """),format.raw/*376.25*/("""$("#selectA").remove();
                    """),format.raw/*377.21*/("""}"""),format.raw/*377.22*/(""" """),format.raw/*377.23*/("""else """),format.raw/*377.28*/("""{"""),format.raw/*377.29*/("""
                        """),format.raw/*378.25*/("""var copyThisA = $(this).clone();
                        if($("#selectA").length > 0) """),format.raw/*379.54*/("""{"""),format.raw/*379.55*/("""
                            """),format.raw/*380.29*/("""$("#selectA a").html($(this).text());
                        """),format.raw/*381.25*/("""}"""),format.raw/*381.26*/(""" """),format.raw/*381.27*/("""else """),format.raw/*381.32*/("""{"""),format.raw/*381.33*/("""
                            """),format.raw/*382.29*/("""$(".select-result dl").append(copyThisA.attr("id", "selectA"));

                        """),format.raw/*384.25*/("""}"""),format.raw/*384.26*/("""
                    """),format.raw/*385.21*/("""}"""),format.raw/*385.22*/("""
                    """),format.raw/*386.21*/("""var $select2 = $("#select2 dd");
                    for (var i = 1; i < $select2.length; i++)"""),format.raw/*387.62*/("""{"""),format.raw/*387.63*/("""
                        """),format.raw/*388.25*/("""$select2[i].style.display = "none";
                    """),format.raw/*389.21*/("""}"""),format.raw/*389.22*/("""
                    """),format.raw/*390.21*/("""if($(this).text() == "全部")"""),format.raw/*390.47*/("""{"""),format.raw/*390.48*/("""

                        """),format.raw/*392.25*/("""for (var i = 1; i < $select2.length; i++)"""),format.raw/*392.66*/("""{"""),format.raw/*392.67*/("""
                            """),format.raw/*393.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*394.25*/("""}"""),format.raw/*394.26*/("""
                    """),format.raw/*395.21*/("""}"""),format.raw/*395.22*/("""
                    """),format.raw/*396.21*/("""else if($(this).text() == "前端开发")"""),format.raw/*396.54*/("""{"""),format.raw/*396.55*/("""

                        """),format.raw/*398.25*/("""for (var i = 1; i <= 13; i++)"""),format.raw/*398.54*/("""{"""),format.raw/*398.55*/("""
                            """),format.raw/*399.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*400.25*/("""}"""),format.raw/*400.26*/("""
                    """),format.raw/*401.21*/("""}"""),format.raw/*401.22*/("""
                    """),format.raw/*402.21*/("""else if($(this).text() == "后端开发")"""),format.raw/*402.54*/("""{"""),format.raw/*402.55*/("""
                        """),format.raw/*403.25*/("""for (var i = 14; i <= 22; i++)"""),format.raw/*403.55*/("""{"""),format.raw/*403.56*/("""
                            """),format.raw/*404.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*405.25*/("""}"""),format.raw/*405.26*/("""
                    """),format.raw/*406.21*/("""}"""),format.raw/*406.22*/("""
                    """),format.raw/*407.21*/("""else if($(this).text() == "移动开发")"""),format.raw/*407.54*/("""{"""),format.raw/*407.55*/("""
                        """),format.raw/*408.25*/("""for (var i = 23; i <= 26; i++)"""),format.raw/*408.55*/("""{"""),format.raw/*408.56*/("""
                            """),format.raw/*409.29*/("""$select2[i].style.display = "inline-block";
                        """),format.raw/*410.25*/("""}"""),format.raw/*410.26*/("""
                    """),format.raw/*411.21*/("""}"""),format.raw/*411.22*/("""
                    """),format.raw/*412.21*/("""else if($(this).text() == "数据库")"""),format.raw/*412.53*/("""{"""),format.raw/*412.54*/("""
                        """),format.raw/*413.25*/("""for (var i = 27; i <= 30; i++)"""),format.raw/*413.55*/("""{"""),format.raw/*413.56*/("""
                            """),format.raw/*414.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*415.25*/("""}"""),format.raw/*415.26*/("""
                    """),format.raw/*416.21*/("""}"""),format.raw/*416.22*/("""
                    """),format.raw/*417.21*/("""else if($(this).text() == "人工智能")"""),format.raw/*417.54*/("""{"""),format.raw/*417.55*/("""
                        """),format.raw/*418.25*/("""for (var i = 31; i <= 32; i++)"""),format.raw/*418.55*/("""{"""),format.raw/*418.56*/("""
                            """),format.raw/*419.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*420.25*/("""}"""),format.raw/*420.26*/("""
                    """),format.raw/*421.21*/("""}"""),format.raw/*421.22*/("""
                    """),format.raw/*422.21*/("""else if($(this).text() == "云计算&大数据")"""),format.raw/*422.57*/("""{"""),format.raw/*422.58*/("""
                        """),format.raw/*423.25*/("""for (var i = 33; i <= 34; i++)"""),format.raw/*423.55*/("""{"""),format.raw/*423.56*/("""
                            """),format.raw/*424.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*425.25*/("""}"""),format.raw/*425.26*/("""
                    """),format.raw/*426.21*/("""}"""),format.raw/*426.22*/("""
                    """),format.raw/*427.21*/("""else if($(this).text() == "运维&测试")"""),format.raw/*427.55*/("""{"""),format.raw/*427.56*/("""
                        """),format.raw/*428.25*/("""for (var i = 35; i <= 36; i++)"""),format.raw/*428.55*/("""{"""),format.raw/*428.56*/("""
                            """),format.raw/*429.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*430.25*/("""}"""),format.raw/*430.26*/("""
                    """),format.raw/*431.21*/("""}"""),format.raw/*431.22*/("""
                    """),format.raw/*432.21*/("""else if($(this).text() == "UI设计")"""),format.raw/*432.54*/("""{"""),format.raw/*432.55*/("""
                        """),format.raw/*433.25*/("""for (var i = 37; i <= 40; i++)"""),format.raw/*433.55*/("""{"""),format.raw/*433.56*/("""
                            """),format.raw/*434.29*/("""$select2[i].style.display = "block";
                        """),format.raw/*435.25*/("""}"""),format.raw/*435.26*/("""
                    """),format.raw/*436.21*/("""}"""),format.raw/*436.22*/("""
                """),format.raw/*437.17*/("""}"""),format.raw/*437.18*/(""")
            """),format.raw/*438.13*/("""}"""),format.raw/*438.14*/(""")

            $("#select2 dd").click(function() """),format.raw/*440.47*/("""{"""),format.raw/*440.48*/("""
                """),format.raw/*441.17*/("""$(this).addClass("selected").siblings().removeClass("selected");
                if($(this).hasClass("select-all")) """),format.raw/*442.52*/("""{"""),format.raw/*442.53*/("""
                    """),format.raw/*443.21*/("""$("#selectB").remove();
                """),format.raw/*444.17*/("""}"""),format.raw/*444.18*/(""" """),format.raw/*444.19*/("""else """),format.raw/*444.24*/("""{"""),format.raw/*444.25*/("""
                    """),format.raw/*445.21*/("""var copyThisB = $(this).clone();
                    if($("#selectB").length > 0) """),format.raw/*446.50*/("""{"""),format.raw/*446.51*/("""
                        """),format.raw/*447.25*/("""$("#selectB a").html($(this).text());
                    """),format.raw/*448.21*/("""}"""),format.raw/*448.22*/(""" """),format.raw/*448.23*/("""else """),format.raw/*448.28*/("""{"""),format.raw/*448.29*/("""
                        """),format.raw/*449.25*/("""$(".select-result dl").append(copyThisB.attr("id", "selectB"));
                    """),format.raw/*450.21*/("""}"""),format.raw/*450.22*/("""
                """),format.raw/*451.17*/("""}"""),format.raw/*451.18*/("""

            """),format.raw/*453.13*/("""}"""),format.raw/*453.14*/(""");

            $("#select3 dd").click(function() """),format.raw/*455.47*/("""{"""),format.raw/*455.48*/("""
                """),format.raw/*456.17*/("""$(this).addClass("selected").siblings().removeClass("selected");
                if($(this).hasClass("select-all")) """),format.raw/*457.52*/("""{"""),format.raw/*457.53*/("""
                    """),format.raw/*458.21*/("""$("#selectC").remove();
                """),format.raw/*459.17*/("""}"""),format.raw/*459.18*/(""" """),format.raw/*459.19*/("""else """),format.raw/*459.24*/("""{"""),format.raw/*459.25*/("""
                    """),format.raw/*460.21*/("""var copyThisC = $(this).clone();
                    if($("#selectC").length > 0) """),format.raw/*461.50*/("""{"""),format.raw/*461.51*/("""
                        """),format.raw/*462.25*/("""$("#selectC a").html($(this).text());
                    """),format.raw/*463.21*/("""}"""),format.raw/*463.22*/(""" """),format.raw/*463.23*/("""else """),format.raw/*463.28*/("""{"""),format.raw/*463.29*/("""
                        """),format.raw/*464.25*/("""$(".select-result dl").append(copyThisC.attr("id", "selectC"));
                    """),format.raw/*465.21*/("""}"""),format.raw/*465.22*/("""
                """),format.raw/*466.17*/("""}"""),format.raw/*466.18*/("""
            """),format.raw/*467.13*/("""}"""),format.raw/*467.14*/(""");
    </script>
""")))}))
      }
    }
  }

  def render(curpage:List[BookInfos],page:Int,total:Int,key:String,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(curpage,page,total,key)(request)

  def f:((List[BookInfos],Int,Int,String) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (curpage,page,total,key) => (request) => apply(curpage,page,total,key)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue May 01 15:18:09 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/search.scala.html
                  HASH: 771bfe5d0cf32ce8ee1f5ba99b630ac2d861de06
                  MATRIX: 768->1|958->96|987->100|1005->110|1044->112|1076->118|3901->2915|3930->2916|3995->2953|4099->3029|4128->3030|4197->3071|4465->3311|4494->3312|4567->3357|4665->3427|4694->3428|4783->3489|4812->3490|4885->3535|4970->3592|4999->3593|5065->3631|5094->3632|5157->3667|5186->3668|5243->3697|15903->14329|15949->14358|15989->14359|16047->14388|16203->14516|16217->14520|16242->14523|16302->14555|16317->14559|16343->14562|16443->14634|16457->14638|16485->14644|16630->14761|16644->14765|16673->14772|16857->14924|16911->14949|17512->15533|17578->15596|17640->15629|18305->16277|18371->16339|18433->16372|19124->17046|19190->17109|19265->17155|19829->17691|19856->17696|19891->17703|19947->17737|20131->17893|20159->17899|20189->17901|20243->17933|20386->18048|20413->18053|20448->18060|20509->18098|21000->18560|21030->18561|21076->18578|21226->18699|21256->18700|21306->18721|21542->18928|21572->18929|21626->18954|21699->18998|21729->18999|21775->19016|21805->19017|21851->19034|21917->19071|21947->19072|21997->19093|22071->19138|22101->19139|22143->19152|22173->19153|22238->19189|22268->19190|22314->19207|22462->19326|22492->19327|22542->19348|22778->19555|22808->19556|22862->19581|22935->19625|22965->19626|23011->19643|23041->19644|23087->19661|23153->19698|23183->19699|23233->19720|23307->19765|23337->19766|23384->19784|23447->19818|23477->19819|23527->19840|23725->20009|23755->20010|23809->20035|23882->20079|23912->20080|23942->20081|23976->20086|24006->20087|24060->20112|24175->20198|24205->20199|24263->20228|24354->20290|24384->20291|24414->20292|24448->20297|24478->20298|24536->20327|24654->20416|24684->20417|24734->20438|24764->20439|24814->20460|24937->20554|24967->20555|25021->20580|25106->20636|25136->20637|25186->20658|25241->20684|25271->20685|25326->20711|25396->20752|25426->20753|25484->20782|25581->20850|25611->20851|25661->20872|25691->20873|25741->20894|25803->20927|25833->20928|25888->20954|25946->20983|25976->20984|26034->21013|26131->21081|26161->21082|26211->21103|26241->21104|26291->21125|26353->21158|26383->21159|26437->21184|26496->21214|26526->21215|26584->21244|26681->21312|26711->21313|26761->21334|26791->21335|26841->21356|26903->21389|26933->21390|26987->21415|27046->21445|27076->21446|27134->21475|27231->21543|27261->21544|27311->21565|27341->21566|27391->21587|27452->21619|27482->21620|27536->21645|27595->21675|27625->21676|27683->21705|27773->21766|27803->21767|27853->21788|27883->21789|27933->21810|27995->21843|28025->21844|28079->21869|28138->21899|28168->21900|28226->21929|28316->21990|28346->21991|28396->22012|28426->22013|28476->22034|28541->22070|28571->22071|28625->22096|28684->22126|28714->22127|28772->22156|28862->22217|28892->22218|28942->22239|28972->22240|29022->22261|29085->22295|29115->22296|29169->22321|29228->22351|29258->22352|29316->22381|29406->22442|29436->22443|29486->22464|29516->22465|29566->22486|29628->22519|29658->22520|29712->22545|29771->22575|29801->22576|29859->22605|29949->22666|29979->22667|30029->22688|30059->22689|30105->22706|30135->22707|30178->22721|30208->22722|30286->22771|30316->22772|30362->22789|30507->22905|30537->22906|30587->22927|30656->22967|30686->22968|30716->22969|30750->22974|30780->22975|30830->22996|30941->23078|30971->23079|31025->23104|31112->23162|31142->23163|31172->23164|31206->23169|31236->23170|31290->23195|31403->23279|31433->23280|31479->23297|31509->23298|31552->23312|31582->23313|31661->23363|31691->23364|31737->23381|31882->23497|31912->23498|31962->23519|32031->23559|32061->23560|32091->23561|32125->23566|32155->23567|32205->23588|32316->23670|32346->23671|32400->23696|32487->23754|32517->23755|32547->23756|32581->23761|32611->23762|32665->23787|32778->23871|32808->23872|32854->23889|32884->23890|32926->23903|32956->23904
                  LINES: 21->1|26->1|29->4|29->4|29->4|31->6|90->65|90->65|91->66|92->67|92->67|93->68|97->72|97->72|98->73|99->74|99->74|100->75|100->75|101->76|102->77|102->77|104->79|104->79|105->80|105->80|106->81|271->246|271->246|271->246|272->247|274->249|274->249|274->249|274->249|274->249|274->249|275->250|275->250|275->250|277->252|277->252|277->252|281->256|282->257|297->272|298->273|299->274|312->287|313->288|314->289|327->302|328->303|329->304|342->317|342->317|342->317|342->317|345->320|345->320|345->320|345->320|348->323|348->323|348->323|348->323|367->342|367->342|368->343|370->345|370->345|371->346|374->349|374->349|375->350|376->351|376->351|377->352|377->352|378->353|378->353|378->353|379->354|380->355|380->355|381->356|381->356|382->357|382->357|383->358|385->360|385->360|386->361|389->364|389->364|390->365|391->366|391->366|392->367|392->367|393->368|393->368|393->368|394->369|395->370|395->370|397->372|397->372|397->372|398->373|400->375|400->375|401->376|402->377|402->377|402->377|402->377|402->377|403->378|404->379|404->379|405->380|406->381|406->381|406->381|406->381|406->381|407->382|409->384|409->384|410->385|410->385|411->386|412->387|412->387|413->388|414->389|414->389|415->390|415->390|415->390|417->392|417->392|417->392|418->393|419->394|419->394|420->395|420->395|421->396|421->396|421->396|423->398|423->398|423->398|424->399|425->400|425->400|426->401|426->401|427->402|427->402|427->402|428->403|428->403|428->403|429->404|430->405|430->405|431->406|431->406|432->407|432->407|432->407|433->408|433->408|433->408|434->409|435->410|435->410|436->411|436->411|437->412|437->412|437->412|438->413|438->413|438->413|439->414|440->415|440->415|441->416|441->416|442->417|442->417|442->417|443->418|443->418|443->418|444->419|445->420|445->420|446->421|446->421|447->422|447->422|447->422|448->423|448->423|448->423|449->424|450->425|450->425|451->426|451->426|452->427|452->427|452->427|453->428|453->428|453->428|454->429|455->430|455->430|456->431|456->431|457->432|457->432|457->432|458->433|458->433|458->433|459->434|460->435|460->435|461->436|461->436|462->437|462->437|463->438|463->438|465->440|465->440|466->441|467->442|467->442|468->443|469->444|469->444|469->444|469->444|469->444|470->445|471->446|471->446|472->447|473->448|473->448|473->448|473->448|473->448|474->449|475->450|475->450|476->451|476->451|478->453|478->453|480->455|480->455|481->456|482->457|482->457|483->458|484->459|484->459|484->459|484->459|484->459|485->460|486->461|486->461|487->462|488->463|488->463|488->463|488->463|488->463|489->464|490->465|490->465|491->466|491->466|492->467|492->467
                  -- GENERATED --
              */
          