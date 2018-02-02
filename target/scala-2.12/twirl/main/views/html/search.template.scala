
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


"""),_display_(/*4.2*/main("搜索结果")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""
    """),format.raw/*5.5*/("""<div class="clear"></div>
    <b class="line"></b>
    <div class="search">
        <div class="search-list">
            <div class="nav-table">
                <div class="long-title"><span class="all-goods">全部分类</span></div>
                <div class="nav-cont">
                    <ul>
                        <li class="index"><a href="#">首页</a></li>
                        <li class="qc"><a href="#">闪购</a></li>
                        <li class="qc"><a href="#">限时抢</a></li>
                        <li class="qc"><a href="#">团购</a></li>
                        <li class="qc last"><a href="#">大包装</a></li>
                    </ul>
                    <div class="nav-extra">
                        <i class="am-icon-user-secret am-icon-md nav-user"></i><b></b>我的福利
                        <i class="am-icon-angle-right" style="padding-left: 10px;"></i>
                    </div>
                </div>
            </div>


            <div class="am-g am-g-fixed">
                <div class="am-u-sm-12 am-u-md-12">
                    <div class="theme-popover">
                        <div class="searchAbout">
                            <span class="font-pale">相关搜索：</span>
                            <a title="坚果" href="#">坚果</a>
                            <a title="瓜子" href="#">瓜子</a>
                            <a title="鸡腿" href="#">豆干</a>

                        </div>
                        <ul class="select">
                            <p class="title font-normal">
                                <span class="fl">松子</span>
                                <span class="total fl">搜索到<strong class="num">997</strong>件相关商品</span>
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
                                    <dt class="am-badge am-round">品牌</dt>

                                    <div class="dd-conent">
                                        <dd class="select-all selected"><a href="#">全部</a></dd>
                                        <dd><a href="#">百草味</a></dd>
                                        <dd><a href="#">良品铺子</a></dd>
                                        <dd><a href="#">新农哥</a></dd>
                                        <dd><a href="#">楼兰蜜语</a></dd>
                                        <dd><a href="#">口水娃</a></dd>
                                        <dd><a href="#">考拉兄弟</a></dd>
                                    </div>

                                </dl>
                            </li>
                            <li class="select-list">
                                <dl id="select2">
                                    <dt class="am-badge am-round">种类</dt>
                                    <div class="dd-conent">
                                        <dd class="select-all selected"><a href="#">全部</a></dd>
                                        <dd><a href="#">东北松子</a></dd>
                                        <dd><a href="#">巴西松子</a></dd>
                                        <dd><a href="#">夏威夷果</a></dd>
                                        <dd><a href="#">松子</a></dd>
                                    </div>
                                </dl>
                            </li>
                            <li class="select-list">
                                <dl id="select3">
                                    <dt class="am-badge am-round">选购热点</dt>
                                    <div class="dd-conent">
                                        <dd class="select-all selected"><a href="#">全部</a></dd>
                                        <dd><a href="#">手剥松子</a></dd>
                                        <dd><a href="#">薄壳松子</a></dd>
                                        <dd><a href="#">进口零食</a></dd>
                                        <dd><a href="#">有机零食</a></dd>
                                    </div>
                                </dl>
                            </li>

                        </ul>
                        <div class="clear"></div>
                    </div>
                    <div class="search-content">
                        <div class="sort">
                            <li class="first"><a title="综合">综合排序</a></li>
                            <li><a title="销量">销量排序</a></li>
                            <li><a title="价格">价格优先</a></li>
                            <li class="big"><a title="评价" href="#">评价为主</a></li>
                        </div>
                        <div class="clear"></div>

                        <ul class="am-avg-sm-2 am-avg-md-3 am-avg-lg-4 boxes">
                                """),_display_(/*105.34*/for(book <- curpage) yield /*105.54*/{_display_(Seq[Any](format.raw/*105.55*/("""
                                 """),format.raw/*106.34*/("""<li>
                                    <div class="i-pic limit">
                                       <a href="http://localhost:9000/introdution/"""),_display_(/*108.84*/book/*108.88*/.id),format.raw/*108.91*/(""""><img src="/assets/images/imgsearch1.jpg" /></a>
                                        <p class="title fl">"""),_display_(/*109.62*/book/*109.66*/.title),format.raw/*109.72*/("""</p>
                                        <p class="price fl">
                                            <b>¥</b>
                                            <strong>56.90</strong>
                                        </p>
                                        <p class="number fl">
                                            销量<span>1110</span>
                                        </p>
                                    </div>
                                </li>
                                """)))}),format.raw/*119.34*/("""
                        """),format.raw/*120.25*/("""</ul>
                    </div>
                    <div class="search-side">

                        <div class="side-title">
                            经典搭配
                        </div>

                        <li>
                            <div class="i-pic check">
                                <img src="/assets/images/cp.jpg" />
                                <p class="check-title">萨拉米 1+1小鸡腿</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>29.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic check">
                                <img src="/assets/images/cp2.jpg" />
                                <p class="check-title">ZEK 原味海苔</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>8.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>
                        <li>
                            <div class="i-pic check">
                                <img src="/assets/images/cp.jpg" />
                                <p class="check-title">萨拉米 1+1小鸡腿</p>
                                <p class="price fl">
                                    <b>¥</b>
                                    <strong>29.90</strong>
                                </p>
                                <p class="number fl">
                                    销量<span>1110</span>
                                </p>
                            </div>
                        </li>

                    </div>
                    <div class="clear"></div>
                        <!--分页 -->
                    <ul class="am-pagination am-pagination-right">
                        <li class="am-disabled"><a href="#">&laquo;</a></li>
                        <li class="am-active"><a href="#">1</a></li>
                        <li><a href="#">2</a></li>
                        <li><a href="#">3</a></li>
                        <li><a href="#">4</a></li>
                        <li><a href="#">5</a></li>
                        <li><a href="#">&raquo;</a></li>
                    </ul>

                </div>
            </div>
        </div>
    </div>

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
                  DATE: Fri Feb 02 11:11:38 CST 2018
                  SOURCE: /home/yms/seed/app/views/search.scala.html
                  HASH: e81dcf9e6a2916aa930bf2b3d179006e61ecac2e
                  MATRIX: 753->1|907->60|936->64|956->76|995->78|1026->83|6199->5228|6236->5248|6276->5249|6339->5283|6517->5433|6531->5437|6556->5440|6695->5551|6709->5555|6737->5561|7285->6077|7339->6102
                  LINES: 21->1|26->1|29->4|29->4|29->4|30->5|130->105|130->105|130->105|131->106|133->108|133->108|133->108|134->109|134->109|134->109|144->119|145->120
                  -- GENERATED --
              */
          