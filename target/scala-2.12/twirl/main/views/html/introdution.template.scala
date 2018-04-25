
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

object introdution extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[BookInfos,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(book: BookInfos)(implicit request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""



"""),_display_(/*5.2*/main("详细信息")/*5.14*/{_display_(Seq[Any](format.raw/*5.15*/("""

    """),format.raw/*7.5*/("""<link href="/assets/AmazeUI-2.4.2/assets/css/admin.css" rel="stylesheet" type="text/css" />
    <link href="/assets/AmazeUI-2.4.2/assets/css/amazeui.css" rel="stylesheet" type="text/css" />
    <link href="/assets/basic/css/demo.css" rel="stylesheet" type="text/css" />
    <link type="text/css" href="/assets/css/optstyle.css" rel="stylesheet" />
    <link type="text/css" href="/assets/css/style.css" rel="stylesheet" />


    <script type="text/javascript" src="/assets/basic/js/jquery-1.7.min.js"></script>
    <script type="text/javascript" src="/assets/basic/js/quick_links.js"></script>

    <script type="text/javascript" src="/assets/AmazeUI-2.4.2/assets/js/amazeui.js"></script>
    <script type="text/javascript" src="/assets/js/jquery.imagezoom.min.js"></script>

    <script type="text/javascript" src="/assets/js/jquery.flexslider.js"></script>
    <script type="text/javascript" src="/assets/js/list.js"></script>


        <!--全部分类下的那根线-->
    <div class="listMain">

            <!--分类-->
        <div class="nav-table">
            <div class="long-title"><span class="all-goods">全部分类</span></div>
            <div class="nav-cont">
                <ul>
                    <li class="index">
                        <a href="#">首页</a>
                    </li>
                </ul>
                    <!--<div class="nav-extra">
						    	<i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
						    	<i class="am-icon-angle-right" style="padding-left: 10px;"></i>
						    </div>-->
            </div>
        </div>
        <ol class="am-breadcrumb am-breadcrumb-slash">
            <li>
                <a href="#">首页</a>
            </li>
            <li>
                <a href="#">分类</a>
            </li>
            <li class="am-active">内容</li>
        </ol>

        <script type="text/javascript">
                $(function() """),format.raw/*53.30*/("""{"""),format.raw/*53.31*/("""}"""),format.raw/*53.32*/(""");
                $(window).load(function() """),format.raw/*54.43*/("""{"""),format.raw/*54.44*/("""
                    """),format.raw/*55.21*/("""$('.flexslider').flexslider("""),format.raw/*55.49*/("""{"""),format.raw/*55.50*/("""
                        """),format.raw/*56.25*/("""animation: "slide",
                        start: function(slider) """),format.raw/*57.49*/("""{"""),format.raw/*57.50*/("""
                            """),format.raw/*58.29*/("""$('body').removeClass('loading');
                        """),format.raw/*59.25*/("""}"""),format.raw/*59.26*/("""
                    """),format.raw/*60.21*/("""}"""),format.raw/*60.22*/(""");
                """),format.raw/*61.17*/("""}"""),format.raw/*61.18*/(""");
        </script>
        <div class="scoll">
            <section class="slider">
                <div class="flexslider">
                    <ul class="slides">
                        <li>
                            <img src="/assets/images/01.jpg" title="pic" />
                        </li>
                            <!--<li>
									<img src="/assets/images/02.jpg" />
								</li>
								<li>
									<img src="/assets/images/03.jpg" />
								</li>-->
                    </ul>
                </div>
            </section>
        </div>

            <!--放大镜-->

        <div class="item-inform">
            <div class="clearfixLeft" id="clearcontent">

                <div class="box">
                    <script type="text/javascript">
                            $(document).ready(function() """),format.raw/*88.58*/("""{"""),format.raw/*88.59*/("""
                                """),format.raw/*89.33*/("""$(".jqzoom").imagezoom();
                                $("#thumblist li a").click(function() """),format.raw/*90.71*/("""{"""),format.raw/*90.72*/("""
                                    """),format.raw/*91.37*/("""$(this).parents("li").addClass("tb-selected").siblings().removeClass("tb-selected");
                                    $(".jqzoom").attr('src', $(this).find("img").attr("mid"));
                                    $(".jqzoom").attr('rel', $(this).find("img").attr("big"));
                                """),format.raw/*94.33*/("""}"""),format.raw/*94.34*/(""");
                            """),format.raw/*95.29*/("""}"""),format.raw/*95.30*/(""");
                    </script>

                    <div class="tb-booth tb-pic tb-s310">
                        <a href="/assets/ProjectImg/"""),_display_(/*99.54*/book/*99.58*/.id),format.raw/*99.61*/("""-1.jpg"><img src="/assets/ProjectImg/"""),_display_(/*99.99*/book/*99.103*/.id),format.raw/*99.106*/("""-1.jpg" alt="细节展示放大镜特效" rel="/assets/ProjectImg/"""),_display_(/*99.155*/book/*99.159*/.id),format.raw/*99.162*/("""-1.jpg" class="jqzoom" /></a>
                    </div>
                </div>

                <div class="clear"></div>
            </div>

            <div class="clearfixRight">
                    <!--规格属性-->
                    <!--名称-->
                <div class="tb-detail-hd">
                    <h1 class="book-name">
                        """),_display_(/*111.26*/book/*111.30*/.title),format.raw/*111.36*/("""
                    """),format.raw/*112.21*/("""</h1>
                </div>
                <div class="tb-detail-list">
                        <!--价格-->
                    <div class="tb-detail-price">

                        <li class="price iteminfo_mktprice">
                            <dt>作者</dt>
                            """),_display_(/*120.30*/{
                                book.author match {
                                    case Some(au) => {
                                            <dd><b class="sys_item_mktprice">{au}</b></dd>
                                    }
                                    case _ => {<dd><b class="sys_item_mktprice">还没有作者</b></dd>}
                                }
                            }),format.raw/*127.30*/("""

                        """),format.raw/*129.25*/("""</li>
                        <li class="price iteminfo_mktprice">
                            <dt>出版社</dt>
                            <dd><b class="sys_item_mktprice">"""),_display_(/*132.63*/book/*132.67*/.bookconcern),format.raw/*132.79*/("""</b></dd>
                        </li>
                        <li class="price iteminfo_mktprice">
                            <dt>出版年</dt>
                            <dd><b class="sys_item_mktprice">2009-1</b></dd>
                        </li>
                        <li class="price iteminfo_mktprice">
                            <dt>页数</dt>
                            <dd><b class="sys_item_mktprice">551</b></dd>
                        </li>
                        <li class="price iteminfo_mktprice">
                            <dt>装帧</dt>
                            <dd><b class="sys_item_mktprice">平装</b></dd>
                        </li>
                        <li class="price iteminfo_mktprice">
                            <dt>编号</dt>
                            """),_display_(/*148.30*/{
                                book.isbn match {
                                    case Some(is) =>  <dd><b class="sys_item_mktprice">{is}</b></dd>
                                    case _ => {<dd><b class="sys_item_mktprice">还没有</b></dd>}
                                }
                            }),format.raw/*153.30*/("""

                        """),format.raw/*155.25*/("""</li>
                        <div class="clear"></div>
                    </div>
                    <div class="clear"></div>

                        <!--销量-->
                    <ul class="tm-ind-panel">
                        <li class="tm-ind-item tm-ind-sellCount canClick">
                            <div class="tm-indcon"><span class="tm-label">月借阅量</span><span class="tm-count">1015</span></div>
                        </li>
                        <li class="tm-ind-item tm-ind-sumCount canClick">
                            <div class="tm-indcon"><span class="tm-label">累计借阅量</span><span class="tm-count">6015</span></div>
                        </li>
                        <li class="tm-ind-item tm-ind-reviewCount canClick tm-line3">
                            <div class="tm-indcon"><span class="tm-label">累计评价</span><span class="tm-count">640</span></div>
                        </li>
                    </ul>
                    <div class="clear"></div>

                        <!--各种规格-->
                    <dl class="iteminfo_parameter sys_item_specpara">
                        <dt class="theme-login"><div class="cart-title">可选规格<span class="am-icon-angle-right"></span></div></dt>
                            <!--<dd>-->
                            <!--操作页面-->
                        <div class="theme-popover-mask"></div>

                        <div class="theme-popover">
                            <div class="theme-span"></div>
                            <div class="theme-poptit">
                                <a href="javascript:;" title="关闭" class="close">×</a>
                            </div>
                            <div class="theme-popbod dform">
                                <form class="theme-signin" name="loginform" action="" method="post">

                                    <div class="theme-signin-left">
                                        <div class="theme-options">
                                            <span class="cart-title number">数量: </span>
                                            <dd>
                                                <span style="width:30px; font-size: 20px;"> 1 </span>
                                                <span id="Stock" class="tb-hidden">  该书剩余<span class="stock">"""),_display_(/*194.111*/book/*194.115*/.amount),format.raw/*194.122*/("""</span>本</span>
                                            </dd>

                                        </div>
                                        <div class="clear"></div>

                                        <div class="btn-op">
                                            <div class="btn am-btn am-btn-warning">	</div>
                                            <div class="btn close am-btn am-btn-warning">取消</div>
                                        </div>
                                    </div>
                                    <div class="theme-signin-right">
                                        <div class="img-info">
                                            <img src="/assets/ProjectImg/"""),_display_(/*207.75*/book/*207.79*/.id),format.raw/*207.82*/("""-1.jpg" />
                                        </div>
                                        <div class="text-info">
                                            <span class="J_Price price-now">¥39.00</span>
                                            <span id="Stock" class="tb-hidden">库存<span class="stock">1000</span>本</span>
                                        </div>
                                    </div>

                                </form>
                            </div>
                        </div>

                        </dd>
                    </dl>
                    <div class="clear"></div>
                </div>

                <div class="pay">

                    <li>
                        <div class="clearfix tb-btn tb-btn-basket theme-login" style="margin-left: 200px;">
                            <a id="LikBasket" title="加入购物车" href="/Cart/add?id="""),_display_(/*228.81*/book/*228.85*/.id),format.raw/*228.88*/("""&title="""),_display_(/*228.96*/book/*228.100*/.title),format.raw/*228.106*/(""""><i></i>加入借阅列表</a>
                        </div>
                    </li>

                </div>

            </div>

            <div class="clear"></div>

        </div>

            <!--优惠套装-->


            <!-- introduce-->

        <div class="introduce">
            <div class="browse">
                <div class="mc">
                    <ul>
                        <div class="mt">
                            <h2>看了又看</h2>
                        </div>

                        <li class="first">
                            <div class="p-img">
                                <a href="#"> <img class="" src="/assets/img1/c程序设计语言.jpg"> </a>
                            </div>
                            <div class="p-name">
                                <a href="#">
                                    web界面设计
                                </a>
                            </div>
                            <div class="p-price"><strong>￥35.90</strong></div>
                        </li>
                        <li>
                            <div class="p-img">
                                <a href="#"> <img class="" src="/assets/img1/c程序设计语言.jpg"> </a>
                            </div>
                            <div class="p-name">
                                <a href="#">
                                    web表单设计
                                </a>
                            </div>
                            <div class="p-price"><strong>￥35.90</strong></div>
                        </li>
                        <li>
                            <div class="p-img">
                                <a href="#"> <img class="" src="/assets/img1/c程序设计语言.jpg"> </a>
                            </div>
                            <div class="p-name">
                                <a href="#">
                                    web导航设计
                                </a>
                            </div>
                            <div class="p-price"><strong>￥35.90</strong></div>
                        </li>
                        <li>
                            <div class="p-img">
                                <a href="#"> <img class="" src="/assets/img1/c程序设计语言.jpg"> </a>
                            </div>
                            <div class="p-name">
                                <a href="#">
                                    web设计禁忌
                                </a>
                            </div>
                            <div class="p-price"><strong>￥35.90</strong></div>
                        </li>
                        <li>
                            <div class="p-img">
                                <a href="#"> <img class="" src="/assets/img1/c程序设计语言.jpg"> </a>
                            </div>
                            <div class="p-name">
                                <a href="#">
                                    web前端黑客技术揭秘
                                </a>
                            </div>
                            <div class="p-price"><strong>￥35.90</strong></div>
                        </li>

                    </ul>
                </div>
            </div>
            <div class="introduceMain">
                <div class="am-tabs" data-am-tabs>
                    <ul class="am-avg-sm-3 am-tabs-nav am-nav am-nav-tabs">
                        <li class="am-active">
                            <a href="#">

                                <span class="index-needs-dt-txt">宝贝详情</span></a>

                        </li>

                        <li>
                            <a href="#">

                                <span class="index-needs-dt-txt">全部评价</span></a>

                        </li>

                        <li>
                            <a href="#">

                                <span class="index-needs-dt-txt">猜你喜欢</span></a>
                        </li>
                    </ul>

                    <div class="am-tabs-bd">

                        <div class="am-tab-panel am-fade am-in am-active">
                            <div class="J_Brand">

                                <div class="attr-list-hd tm-clear">
                                    <h4>内容简介</h4></div>
                                <div class="clear"></div>


                                <p class="book-introduce">精心设计的表单，能让用户感到心情舒畅，愉快地注册、付款和进行内容创建和管理，这是促成网上
                                    商业成功的秘密武器。本书通过独到、深邃的见解，丰富、真实的实例，道出了表单设计的真谛。新
                                    手设计师通过阅读本书，可广泛接触到优秀表单设计的所有构成要素。经验丰富的资深设计师，可深
                                    入地了解以前没有注意到的问题及解决方案。本书专为表单设计或开发人员准备，但同时也适合可用
                                    性工程师、网站开发人员、产品经理、视觉设计师、交互设计师、信息架构人员以及任何一个涉及表
                                    单与调查问卷设计的人员阅读和参考。</p>

                                <div class="clear"></div>
                            </div>

                            <div class="details">
                                <div class="attr-list-hd after-market-hd">
                                    <h4>目录</h4>
                                </div>
                                <div class="clear"></div>
                                <div class="catalog list-height">
                                    <ul>
                                        <li>第一章 Web标准不是神话</li>
                                        <li>1.1 理解Web标准</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                        <li>1.1.1 Web标准是什么</li>
                                    </ul>
                                </div>

                                <div class="clear"></div>
                                <p class="get-more">......(更多)</p>
                                <script>
                                        $(".get-more").click(function()"""),format.raw/*395.72*/("""{"""),format.raw/*395.73*/("""
                                            """),format.raw/*396.45*/("""$(".catalog").toggleClass("list-height");
                                            if($(".get-more").html() == "......(更多)")"""),format.raw/*397.86*/("""{"""),format.raw/*397.87*/("""
                                                """),format.raw/*398.49*/("""$(".get-more").html("......(掩藏)");
                                            """),format.raw/*399.45*/("""}"""),format.raw/*399.46*/("""
                                            """),format.raw/*400.45*/("""else"""),format.raw/*400.49*/("""{"""),format.raw/*400.50*/("""
                                                """),format.raw/*401.49*/("""$(".get-more").html("......(更多)");
                                            """),format.raw/*402.45*/("""}"""),format.raw/*402.46*/("""
                                        """),format.raw/*403.41*/("""}"""),format.raw/*403.42*/(""")
                                </script>
                            </div>
                            <div class="clear"></div>

                        </div>

                        <div class="am-tab-panel am-fade">

                            """),format.raw/*906.37*/("""

                        """),format.raw/*908.25*/("""</div>

                        <div class="am-tab-panel am-fade">
                            <div class="like">
                                <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="/assets/img1/c程序设计语言.jpg" />
                                            <p>【良品铺子_开口松子】零食坚果特产炒货
                                                <span>东北红松子奶油味</span></p>
                                            <p class="price fl">
                                                <b>¥</b>
                                                <strong>298.00</strong>
                                            </p>
                                        </div>
                                    </li>
                                </ul>
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
                            <div class="clear"></div>

                        </div>

                    </div>

                </div>

                <div class="clear"></div>

                <div class="footer">
                    <div class="footer-hd">
                    </div>
                </div>
            </div>

        </div>

    </div>
""")))}))
      }
    }
  }

  def render(book:BookInfos,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(book)(request)

  def f:((BookInfos) => (RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (book) => (request) => apply(book)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 25 16:57:47 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/introdution.scala.html
                  HASH: 34d6cab75354c6a8132b95bf3741306b0cdbee1c
                  MATRIX: 752->1|897->51|927->56|947->68|985->69|1017->75|2923->1953|2952->1954|2981->1955|3054->2000|3083->2001|3132->2022|3188->2050|3217->2051|3270->2076|3366->2144|3395->2145|3452->2174|3538->2232|3567->2233|3616->2254|3645->2255|3692->2274|3721->2275|4569->3095|4598->3096|4659->3129|4783->3225|4812->3226|4877->3263|5212->3570|5241->3571|5300->3602|5329->3603|5501->3748|5514->3752|5538->3755|5603->3793|5617->3797|5642->3800|5719->3849|5733->3853|5758->3856|6142->4212|6156->4216|6184->4222|6234->4243|6551->4532|6970->4929|7025->4955|7223->5125|7237->5129|7271->5141|8087->5929|8419->6239|8474->6265|10803->8565|10818->8569|10848->8576|11603->9303|11617->9307|11642->9310|12575->10215|12589->10219|12614->10222|12650->10230|12665->10234|12694->10240|19971->17488|20001->17489|20075->17534|20231->17661|20261->17662|20339->17711|20447->17790|20477->17791|20551->17836|20584->17840|20614->17841|20692->17890|20800->17969|20830->17970|20900->18011|20930->18012|21213->47961|21268->47987
                  LINES: 21->1|26->1|30->5|30->5|30->5|32->7|78->53|78->53|78->53|79->54|79->54|80->55|80->55|80->55|81->56|82->57|82->57|83->58|84->59|84->59|85->60|85->60|86->61|86->61|113->88|113->88|114->89|115->90|115->90|116->91|119->94|119->94|120->95|120->95|124->99|124->99|124->99|124->99|124->99|124->99|124->99|124->99|124->99|136->111|136->111|136->111|137->112|145->120|152->127|154->129|157->132|157->132|157->132|173->148|178->153|180->155|219->194|219->194|219->194|232->207|232->207|232->207|253->228|253->228|253->228|253->228|253->228|253->228|420->395|420->395|421->396|422->397|422->397|423->398|424->399|424->399|425->400|425->400|425->400|426->401|427->402|427->402|428->403|428->403|437->906|439->908
                  -- GENERATED --
              */
          