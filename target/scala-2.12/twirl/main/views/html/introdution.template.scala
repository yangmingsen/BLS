
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
                $(function() """),format.raw/*52.30*/("""{"""),format.raw/*52.31*/("""}"""),format.raw/*52.32*/(""");
                $(window).load(function() """),format.raw/*53.43*/("""{"""),format.raw/*53.44*/("""
                    """),format.raw/*54.21*/("""$('.flexslider').flexslider("""),format.raw/*54.49*/("""{"""),format.raw/*54.50*/("""
                        """),format.raw/*55.25*/("""animation: "slide",
                        start: function(slider) """),format.raw/*56.49*/("""{"""),format.raw/*56.50*/("""
                            """),format.raw/*57.29*/("""$('body').removeClass('loading');
                        """),format.raw/*58.25*/("""}"""),format.raw/*58.26*/("""
                    """),format.raw/*59.21*/("""}"""),format.raw/*59.22*/(""");
                """),format.raw/*60.17*/("""}"""),format.raw/*60.18*/(""");
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
                            $(document).ready(function() """),format.raw/*87.58*/("""{"""),format.raw/*87.59*/("""
                                """),format.raw/*88.33*/("""$(".jqzoom").imagezoom();
                                $("#thumblist li a").click(function() """),format.raw/*89.71*/("""{"""),format.raw/*89.72*/("""
                                    """),format.raw/*90.37*/("""$(this).parents("li").addClass("tb-selected").siblings().removeClass("tb-selected");
                                    $(".jqzoom").attr('src', $(this).find("img").attr("mid"));
                                    $(".jqzoom").attr('rel', $(this).find("img").attr("big"));
                                """),format.raw/*93.33*/("""}"""),format.raw/*93.34*/(""");
                            """),format.raw/*94.29*/("""}"""),format.raw/*94.30*/(""");
                    </script>

                    <div class="tb-booth tb-pic tb-s310">
                        <a href="/assets/ProjectImg/"""),_display_(/*98.54*/book/*98.58*/.id),format.raw/*98.61*/("""-1.jpg"><img src="/assets/ProjectImg/"""),_display_(/*98.99*/book/*98.103*/.id),format.raw/*98.106*/("""-1.jpg" alt="细节展示放大镜特效" rel="/assets/ProjectImg/"""),_display_(/*98.155*/book/*98.159*/.id),format.raw/*98.162*/("""-1.jpg" class="jqzoom" /></a>
                    </div>
                </div>

                <div class="clear"></div>
            </div>

            <div class="clearfixRight">
                    <!--规格属性-->
                    <!--名称-->
                <div class="tb-detail-hd">
                    <h1 class="book-name">
                        """),_display_(/*110.26*/book/*110.30*/.title),format.raw/*110.36*/("""
                    """),format.raw/*111.21*/("""</h1>
                </div>
                <div class="tb-detail-list">
                        <!--价格-->
                    <div class="tb-detail-price">

                        <li class="price iteminfo_mktprice">
                            <dt>作者</dt>
                            """),_display_(/*119.30*/{
                                book.author match {
                                    case Some(au) => {
                                            <dd><b class="sys_item_mktprice">{au}</b></dd>
                                    }
                                    case _ => {<dd><b class="sys_item_mktprice">还没有作者</b></dd>}
                                }
                            }),format.raw/*126.30*/("""

                        """),format.raw/*128.25*/("""</li>
                        <li class="price iteminfo_mktprice">
                            <dt>出版社</dt>
                            <dd><b class="sys_item_mktprice">"""),_display_(/*131.63*/book/*131.67*/.bookconcern),format.raw/*131.79*/("""</b></dd>
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
                            """),_display_(/*147.30*/{
                                book.isbn match {
                                    case Some(is) =>  <dd><b class="sys_item_mktprice">{is}</b></dd>
                                    case _ => {<dd><b class="sys_item_mktprice">还没有</b></dd>}
                                }
                            }),format.raw/*152.30*/("""

                        """),format.raw/*154.25*/("""</li>
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
                                                <span id="Stock" class="tb-hidden">  该书剩余<span class="stock">"""),_display_(/*193.111*/book/*193.115*/.amount),format.raw/*193.122*/("""</span>本</span>
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
                                            <img src="/assets/ProjectImg/"""),_display_(/*206.75*/book/*206.79*/.id),format.raw/*206.82*/("""-1.jpg" />
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
                            <a id="LikBasket" title="加入购物车" href="/Cart/add?id="""),_display_(/*227.81*/book/*227.85*/.id),format.raw/*227.88*/("""&title="""),_display_(/*227.96*/book/*227.100*/.title),format.raw/*227.106*/(""""><i></i>加入借阅列表</a>
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
                                <a href="#"> <img class="" src="/assets/images/browse1.jpg"> </a>
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
                                <a href="#"> <img class="" src="/assets/images/browse1.jpg"> </a>
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
                                <a href="#"> <img class="" src="/assets/images/browse1.jpg"> </a>
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
                                <a href="#"> <img class="" src="/assets/images/browse1.jpg"> </a>
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
                                <a href="#"> <img class="" src="/assets/images/browse1.jpg"> </a>
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
                                        $(".get-more").click(function()"""),format.raw/*394.72*/("""{"""),format.raw/*394.73*/("""
                                            """),format.raw/*395.45*/("""$(".catalog").toggleClass("list-height");
                                            if($(".get-more").html() == "......(更多)")"""),format.raw/*396.86*/("""{"""),format.raw/*396.87*/("""
                                                """),format.raw/*397.49*/("""$(".get-more").html("......(掩藏)");
                                            """),format.raw/*398.45*/("""}"""),format.raw/*398.46*/("""
                                            """),format.raw/*399.45*/("""else"""),format.raw/*399.49*/("""{"""),format.raw/*399.50*/("""
                                                """),format.raw/*400.49*/("""$(".get-more").html("......(更多)");
                                            """),format.raw/*401.45*/("""}"""),format.raw/*401.46*/("""
                                        """),format.raw/*402.41*/("""}"""),format.raw/*402.42*/(""")
                                </script>
                            </div>
                            <div class="clear"></div>

                        </div>

                        <div class="am-tab-panel am-fade">

                            <div class="actor-new">
                                <div class="rate">
                                    <strong>100<span>%</span></strong><br> <span>好评度</span>
                                </div>
                                <dl>
                                    <dt>买家印象</dt>
                                    <dd class="p-bfc">
                                        <q class="comm-tags"><span>味道不错</span><em>(2177)</em></q>
                                        <q class="comm-tags"><span>颗粒饱满</span><em>(1860)</em></q>
                                        <q class="comm-tags"><span>口感好</span><em>(1823)</em></q>
                                        <q class="comm-tags"><span>商品不错</span><em>(1689)</em></q>
                                        <q class="comm-tags"><span>香脆可口</span><em>(1488)</em></q>
                                        <q class="comm-tags"><span>个个开口</span><em>(1392)</em></q>
                                        <q class="comm-tags"><span>价格便宜</span><em>(1119)</em></q>
                                        <q class="comm-tags"><span>特价买的</span><em>(865)</em></q>
                                        <q class="comm-tags"><span>皮很薄</span><em>(831)</em></q>
                                    </dd>
                                </dl>
                            </div>
                            <div class="clear"></div>
                            <div class="tb-r-filter-bar">
                                <ul class=" tb-taglist am-avg-sm-4">
                                    <li class="tb-taglist-li tb-taglist-li-current">
                                        <div class="comment-info">
                                            <span>全部评价</span>
                                            <span class="tb-tbcr-num">(32)</span>
                                        </div>
                                    </li>

                                    <li class="tb-taglist-li tb-taglist-li-1">
                                        <div class="comment-info">
                                            <span>好评</span>
                                            <span class="tb-tbcr-num">(32)</span>
                                        </div>
                                    </li>

                                    <li class="tb-taglist-li tb-taglist-li-0">
                                        <div class="comment-info">
                                            <span>中评</span>
                                            <span class="tb-tbcr-num">(32)</span>
                                        </div>
                                    </li>

                                    <li class="tb-taglist-li tb-taglist-li--1">
                                        <div class="comment-info">
                                            <span>差评</span>
                                            <span class="tb-tbcr-num">(32)</span>
                                        </div>
                                    </li>
                                </ul>
                            </div>
                            <div class="clear"></div>

                            <ul class="am-comments-list am-comments-list-flip">
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">b***1 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月02日 17:46</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255776406962">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    摸起来丝滑柔软，不厚，没色差，颜色好看！买这个衣服还接到诈骗电话，我很好奇他们是怎么知道我买了这件衣服，并且还知道我的电话的！
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：S
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">l***4 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年10月28日 11:33</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255095758792">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    没有色差，很暖和……美美的
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：蓝调灰&nbsp;&nbsp;尺码：2XL
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">b***1 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月02日 17:46</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255776406962">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    摸起来丝滑柔软，不厚，没色差，颜色好看！买这个衣服还接到诈骗电话，我很好奇他们是怎么知道我买了这件衣服，并且还知道我的电话的！
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：S
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">h***n (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月25日 12:48</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="258040417670">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    式样不错，初冬穿
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：L
                                                </div>
                                            </div>
                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>

                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">b***1 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月02日 17:46</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255776406962">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    摸起来丝滑柔软，不厚，没色差，颜色好看！买这个衣服还接到诈骗电话，我很好奇他们是怎么知道我买了这件衣服，并且还知道我的电话的！
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：S
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">l***4 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年10月28日 11:33</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255095758792">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    没有色差，很暖和……美美的
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：蓝调灰&nbsp;&nbsp;尺码：2XL
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">b***1 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月02日 17:46</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255776406962">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    摸起来丝滑柔软，不厚，没色差，颜色好看！买这个衣服还接到诈骗电话，我很好奇他们是怎么知道我买了这件衣服，并且还知道我的电话的！
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：S
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">h***n (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月25日 12:48</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="258040417670">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    式样不错，初冬穿
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：L
                                                </div>
                                            </div>
                                        </div>
                  """),
format.raw("""                          <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">b***1 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月02日 17:46</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255776406962">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    摸起来丝滑柔软，不厚，没色差，颜色好看！买这个衣服还接到诈骗电话，我很好奇他们是怎么知道我买了这件衣服，并且还知道我的电话的！
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：S
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">l***4 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年10月28日 11:33</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255095758792">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    没有色差，很暖和……美美的
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：蓝调灰&nbsp;&nbsp;尺码：2XL
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">b***1 (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月02日 17:46</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="255776406962">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    摸起来丝滑柔软，不厚，没色差，颜色好看！买这个衣服还接到诈骗电话，我很好奇他们是怎么知道我买了这件衣服，并且还知道我的电话的！
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：S
                                                </div>
                                            </div>

                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>
                                <li class="am-comment">
                                        <!-- 评论容器 -->
                                    <a href="">
                                        <img class="am-comment-avatar" src="../images/hwbn40x40.jpg" />
                                            <!-- 评论者头像 -->
                                    </a>

                                    <div class="am-comment-main">
                                            <!-- 评论内容容器 -->
                                        <header class="am-comment-hd">
                                                <!--<h3 class="am-comment-title">评论标题</h3>-->
                                            <div class="am-comment-meta">
                                                    <!-- 评论元数据 -->
                                                <a href="#link-to-user" class="am-comment-author">h***n (匿名)</a>
                                                    <!-- 评论者 -->
                                                    评论于
                                                <time datetime="">2015年11月25日 12:48</time>
                                            </div>
                                        </header>

                                        <div class="am-comment-bd">
                                            <div class="tb-rev-item " data-id="258040417670">
                                                <div class="J_TbcRate_ReviewContent tb-tbcr-content ">
                                                    式样不错，初冬穿
                                                </div>
                                                <div class="tb-r-act-bar">
                                                    颜色分类：柠檬黄&nbsp;&nbsp;尺码：L
                                                </div>
                                            </div>
                                        </div>
                                            <!-- 评论内容 -->
                                    </div>
                                </li>

                            </ul>

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

                            <div class="tb-reviewsft">
                                <div class="tb-rate-alert type-attention">购买前请查看该商品的
                                    <a href="#" target="_blank">购物保障</a>，明确您的售后保障权益。</div>
                            </div>

                        </div>

                        <div class="am-tab-panel am-fade">
                            <div class="like">
                                <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">
                                    <li>
                                        <div class="i-pic limit">
                                            <img src="../images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                                            <img src="/assets/images/imgsearch1.jpg" />
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
                  DATE: Sat Apr 21 12:36:19 CST 2018
                  SOURCE: /home/yms/Documents/Play2.x/BLS/app/views/introdution.scala.html
                  HASH: 76cce5423a19538ae8caeafd32b392c01c61d19f
                  MATRIX: 752->1|897->51|927->56|947->68|985->69|1017->75|2922->1952|2951->1953|2980->1954|3053->1999|3082->2000|3131->2021|3187->2049|3216->2050|3269->2075|3365->2143|3394->2144|3451->2173|3537->2231|3566->2232|3615->2253|3644->2254|3691->2273|3720->2274|4568->3094|4597->3095|4658->3128|4782->3224|4811->3225|4876->3262|5211->3569|5240->3570|5299->3601|5328->3602|5500->3747|5513->3751|5537->3754|5602->3792|5616->3796|5641->3799|5718->3848|5732->3852|5757->3855|6141->4211|6155->4215|6183->4221|6233->4242|6550->4531|6969->4928|7024->4954|7222->5124|7236->5128|7270->5140|8086->5928|8418->6238|8473->6264|10802->8564|10817->8568|10847->8575|11602->9302|11616->9306|11641->9309|12574->10214|12588->10218|12613->10221|12649->10229|12664->10233|12693->10239|19980->17497|20010->17498|20084->17543|20240->17670|20270->17671|20348->17720|20456->17799|20486->17800|20560->17845|20593->17849|20623->17850|20701->17899|20809->17978|20839->17979|20909->18020|20939->18021
                  LINES: 21->1|26->1|30->5|30->5|30->5|32->7|77->52|77->52|77->52|78->53|78->53|79->54|79->54|79->54|80->55|81->56|81->56|82->57|83->58|83->58|84->59|84->59|85->60|85->60|112->87|112->87|113->88|114->89|114->89|115->90|118->93|118->93|119->94|119->94|123->98|123->98|123->98|123->98|123->98|123->98|123->98|123->98|123->98|135->110|135->110|135->110|136->111|144->119|151->126|153->128|156->131|156->131|156->131|172->147|177->152|179->154|218->193|218->193|218->193|231->206|231->206|231->206|252->227|252->227|252->227|252->227|252->227|252->227|419->394|419->394|420->395|421->396|421->396|422->397|423->398|423->398|424->399|424->399|424->399|425->400|426->401|426->401|427->402|427->402
                  -- GENERATED --
              */
          