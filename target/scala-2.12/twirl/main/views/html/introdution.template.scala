
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


    <div class="clear"></div>
    <b class="line"></b>
        <!--全部分类下的那根线-->
    <div class="listMain">

            <!--分类-->
        <div class="nav-table">
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
                $(function() """),format.raw/*43.30*/("""{"""),format.raw/*43.31*/("""}"""),format.raw/*43.32*/(""");
                $(window).load(function() """),format.raw/*44.43*/("""{"""),format.raw/*44.44*/("""
                    """),format.raw/*45.21*/("""$('.flexslider').flexslider("""),format.raw/*45.49*/("""{"""),format.raw/*45.50*/("""
                        """),format.raw/*46.25*/("""animation: "slide",
                        start: function(slider) """),format.raw/*47.49*/("""{"""),format.raw/*47.50*/("""
                            """),format.raw/*48.29*/("""$('body').removeClass('loading');
                        """),format.raw/*49.25*/("""}"""),format.raw/*49.26*/("""
                    """),format.raw/*50.21*/("""}"""),format.raw/*50.22*/(""");
                """),format.raw/*51.17*/("""}"""),format.raw/*51.18*/(""");
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
                            $(document).ready(function() """),format.raw/*78.58*/("""{"""),format.raw/*78.59*/("""
                                """),format.raw/*79.33*/("""$(".jqzoom").imagezoom();
                                $("#thumblist li a").click(function() """),format.raw/*80.71*/("""{"""),format.raw/*80.72*/("""
                                    """),format.raw/*81.37*/("""$(this).parents("li").addClass("tb-selected").siblings().removeClass("tb-selected");
                                    $(".jqzoom").attr('src', $(this).find("img").attr("mid"));
                                    $(".jqzoom").attr('rel', $(this).find("img").attr("big"));
                                """),format.raw/*84.33*/("""}"""),format.raw/*84.34*/(""");
                            """),format.raw/*85.29*/("""}"""),format.raw/*85.30*/(""");
                    </script>

                    <div class="tb-booth tb-pic tb-s310">
                        <a href="/assets/ProjectImg/"""),_display_(/*89.54*/book/*89.58*/.id),format.raw/*89.61*/("""-1.jpg"><img src="/assets/ProjectImg/"""),_display_(/*89.99*/book/*89.103*/.id),format.raw/*89.106*/("""-1.jpg" alt="细节展示放大镜特效" rel="/assets/ProjectImg/"""),_display_(/*89.155*/book/*89.159*/.id),format.raw/*89.162*/("""-1.jpg" class="jqzoom" /></a>
                    </div>
                </div>

                <div class="clear"></div>
            </div>

            <div class="clearfixRight">
                    <!--规格属性-->
                    <!--名称-->
                <div class="tb-detail-hd">
                    <h1 class="book-name">
                        """),_display_(/*101.26*/book/*101.30*/.title),format.raw/*101.36*/("""
                    """),format.raw/*102.21*/("""</h1>
                </div>
                <div class="tb-detail-list">
                        <!--价格-->
                    <div class="tb-detail-price">

                        <li class="price iteminfo_mktprice">
                            <dt>作者</dt>
                            """),_display_(/*110.30*/{
                                book.author match {
                                    case Some(au) => {
                                            <dd><b class="sys_item_mktprice">{au}</b></dd>
                                    }
                                    case _ => {<dd><b class="sys_item_mktprice">还没有作者</b></dd>}
                                }
                            }),format.raw/*117.30*/("""

                        """),format.raw/*119.25*/("""</li>
                        <li class="price iteminfo_mktprice">
                            <dt>出版社</dt>
                            <dd><b class="sys_item_mktprice">"""),_display_(/*122.63*/book/*122.67*/.bookconcern),format.raw/*122.79*/("""</b></dd>
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
                            """),_display_(/*138.30*/{
                                book.isbn match {
                                    case Some(is) =>  <dd><b class="sys_item_mktprice">{is}</b></dd>
                                    case _ => {<dd><b class="sys_item_mktprice">还没有</b></dd>}
                                }
                            }),format.raw/*143.30*/("""

                        """),format.raw/*145.25*/("""</li>
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
                                                <span id="Stock" class="tb-hidden">  该书剩余<span class="stock">"""),_display_(/*184.111*/book/*184.115*/.amount),format.raw/*184.122*/("""</span>本</span>
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
                                            <img src="/assets/ProjectImg/"""),_display_(/*197.75*/book/*197.79*/.id),format.raw/*197.82*/("""-1.jpg" />
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
                            <a id="LikBasket" title="加入购物车" href="/Cart/add?id="""),_display_(/*218.81*/book/*218.85*/.id),format.raw/*218.88*/("""&title="""),_display_(/*218.96*/book/*218.100*/.title),format.raw/*218.106*/(""""><i></i>加入借阅列表</a>
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
                                        $(".get-more").click(function()"""),format.raw/*385.72*/("""{"""),format.raw/*385.73*/("""
                                            """),format.raw/*386.45*/("""$(".catalog").toggleClass("list-height");
                                            if($(".get-more").html() == "......(更多)")"""),format.raw/*387.86*/("""{"""),format.raw/*387.87*/("""
                                                """),format.raw/*388.49*/("""$(".get-more").html("......(掩藏)");
                                            """),format.raw/*389.45*/("""}"""),format.raw/*389.46*/("""
                                            """),format.raw/*390.45*/("""else"""),format.raw/*390.49*/("""{"""),format.raw/*390.50*/("""
                                                """),format.raw/*391.49*/("""$(".get-more").html("......(更多)");
                                            """),format.raw/*392.45*/("""}"""),format.raw/*392.46*/("""
                                        """),format.raw/*393.41*/("""}"""),format.raw/*393.42*/(""")
                                </script>
                            </div>
                            <div class="clear"></div>

                        </div>

                        <div class="am-tab-panel am-fade">

                            """),format.raw/*896.37*/("""

                        """),format.raw/*898.25*/("""</div>

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
                  DATE: Thu Apr 26 13:43:03 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/introdution.scala.html
                  HASH: 93584d431ac2d39a1dac3c8fd772cb3bd1ab336d
                  MATRIX: 752->1|897->51|927->56|947->68|985->69|1017->75|2474->1504|2503->1505|2532->1506|2605->1551|2634->1552|2683->1573|2739->1601|2768->1602|2821->1627|2917->1695|2946->1696|3003->1725|3089->1783|3118->1784|3167->1805|3196->1806|3243->1825|3272->1826|4120->2646|4149->2647|4210->2680|4334->2776|4363->2777|4428->2814|4763->3121|4792->3122|4851->3153|4880->3154|5052->3299|5065->3303|5089->3306|5154->3344|5168->3348|5193->3351|5270->3400|5284->3404|5309->3407|5693->3763|5707->3767|5735->3773|5785->3794|6102->4083|6521->4480|6576->4506|6774->4676|6788->4680|6822->4692|7638->5480|7970->5790|8025->5816|10354->8116|10369->8120|10399->8127|11154->8854|11168->8858|11193->8861|12126->9766|12140->9770|12165->9773|12201->9781|12216->9785|12245->9791|19522->17039|19552->17040|19626->17085|19782->17212|19812->17213|19890->17262|19998->17341|20028->17342|20102->17387|20135->17391|20165->17392|20243->17441|20351->17520|20381->17521|20451->17562|20481->17563|20764->47512|20819->47538
                  LINES: 21->1|26->1|30->5|30->5|30->5|32->7|68->43|68->43|68->43|69->44|69->44|70->45|70->45|70->45|71->46|72->47|72->47|73->48|74->49|74->49|75->50|75->50|76->51|76->51|103->78|103->78|104->79|105->80|105->80|106->81|109->84|109->84|110->85|110->85|114->89|114->89|114->89|114->89|114->89|114->89|114->89|114->89|114->89|126->101|126->101|126->101|127->102|135->110|142->117|144->119|147->122|147->122|147->122|163->138|168->143|170->145|209->184|209->184|209->184|222->197|222->197|222->197|243->218|243->218|243->218|243->218|243->218|243->218|410->385|410->385|411->386|412->387|412->387|413->388|414->389|414->389|415->390|415->390|415->390|416->391|417->392|417->392|418->393|418->393|427->896|429->898
                  -- GENERATED --
              */
          