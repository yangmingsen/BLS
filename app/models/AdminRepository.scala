package models

import java.util.Date

import javax.inject.{Inject, Singleton}
import anorm.SqlParser._
import play.api.db.DBApi
import anorm._
import com.google.common.util.concurrent.Futures.FutureCombiner

import scala.concurrent.Future
import scala.util.matching.Regex.Match


/*
 *
 * create by yangmingsen on 2018/04
 */
case class AdminM(acct: String,
                 pasd: String)

case class DealBorrowList(bookid: Long,//书的id
                          booktitle: String,//书名字
                          userid: String,//用户id
                          username: String,//用户名字
                          amount: Int,//数量
                          states: Int, //1.借阅申请 2.已同意申请 22.拒绝申请 3.还书申请
                          borrowdate: Date,
                          agredate: Option[Date],
                          retdate: Option[Date],
                          agreretdate: Option[Date]) //借阅时间

case class History2018(bookid: Long, //书的id
                       booktitle: String,//书的名字
                       amount: Int,//数量
                       userid: String,//用户id
                       lenddate: Date,//借阅时间
                       agredate: Date,
                       retdate: Date,
                       agreretdate: Date) //还书时间

@Singleton
class AdminRepository @Inject()(dbapi: DBApi) (implicit ec: DatabaseExecutionContext) {

  private val db = dbapi.database("default")

  private val adminSimple = {
    get[String]("Admin.acct") ~
    get[String]("Admin.pasd") map {
      case acct~pasd =>
        AdminM(acct, pasd)
    }
  }

  private val dealSimple = {
    get[Long]("DealBorrowList.bookid")~
    get[String]("DealBorrowList.booktitle")~
    get[String]("DealBorrowList.userid")~
    get[String]("DealBorrowList.username")~
    get[Int]("DealBorrowList.amount")~
    get[Int]("DealBorrowList.states")~
    get[Date]("DealBorrowList.borrowdate")~
    get[Option[Date]]("DealBorrowList.agredate")~
    get[Option[Date]]("DealBorrowList.retdate")~
    get[Option[Date]]("DealBorrowList.agreretdate") map {
      case bookid~booktitle~userid~username~amount~states~borrowdate~agredate~retdate~agreretdate =>
        DealBorrowList(bookid,booktitle,userid,username,amount,states,borrowdate,agredate,retdate,agreretdate)
    }
  }

  private val historySimple = {
    get[Long]("history2018.bookid") ~
    get[String]("history2018.booktitle") ~
    get[Int]("history2018.amount") ~
    get[String]("history2018.userid") ~
    get[Date]("history2018.lenddate") ~
    get[Date]("history2018.agredate") ~
    get[Date]("history2018.retdate") ~
    get[Date]("history2018.agreretdate") map {
      case bookid~booktitle~amount~userid~lenddate~agredate~retdate~agreretdate =>
        History2018(bookid,booktitle,amount,userid,lenddate,agredate,retdate,agreretdate)
    }
  }





  /**同意客户请求
    *
    * @param userid
    * @param bookid
    */
  def agreeClientRequest(userid: String, bookid: Long, agredate: String) = Future {

    db.withConnection { implicit connection =>
      SQL("UPDATE DealBorrowList SET states=2 , agredate={agredate} WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid,
        'agte -> agredate
      ).executeUpdate()
    }
  }(ec)

  /**拒绝用户申请
    *
    * @param userid
    * @param bookid
    * @return
    */
  def refuseClientRequest( userid: String ,bookid: Long ) = Future {
    db.withConnection { implicit connection =>
      SQL("UPDATE DealBorrowList SET states=22 WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).executeUpdate()
    }
  }(ec)

  /**将用户借阅记录写入历史
    *
    * @param userid
    * @param bookid
    * @return
    */
  def addToHistory(userid: String, bookid: Long, date: String) =  Future {

    db.withConnection { implicit connection =>
      //去DealBorrowList查找数据
      val One = SQL("SELECT * FROM DealBorrowList WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).as(dealSimple.singleOpt)

      One match {
        case Some(d) => {
          SQL("INSERT INTO history2018 (bookid,booktitle,amount,userid,lenddate,agredate,retdate,agreretdate)VALUES({bookid},{booktitle},{amount},{userid},{data1},{date2},{date3},{date4})").on(
            'bookid -> d.bookid,
            'booktitle -> d.booktitle,
            'amount -> d.amount,
            'userid -> d.userid,
            'date1 -> d.borrowdate,
            'date2 -> d.agredate,
            'date3 -> d.retdate,
            'date4 -> date
          ).executeUpdate()
        }
        case None =>{}
      }

      //删除在DealBorrowList的记录
      SQL("DELETE FROM DealBorrowList WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).executeUpdate()

      //书数量+1
      SQL("UPDATE bookinfos1 set amount=amount+1 WHERE id={bookid}").on(
        'bookid -> bookid
      ).executeUpdate()

    }
  }(ec)

  def getHistoryFromDb(userid: String) = {
    db.withConnection{ implicit  connection =>
      SQL("SELECT * FROM history2018 WHERE userid={userid}").on(
        'userid -> userid
      ).as(historySimple.*)
    }
  }

  def getUserId(userid: String) = {
    db.withConnection { implicit connection =>
      SQL("SELECT * FROM DealBorrowList WHERE userid={userid}").on(
        'userid -> userid
      ).as(dealSimple.*)
    }
  }

  def getDealList( userid: String, states: Int) = {
    db.withConnection { implicit connection =>
      SQL("SELECT * FROM DealBorrowList WHERE userid={userid} AND states={states}").on(
        'userid -> userid,
        'states -> states
      ).as(dealSimple.*)
    }
  }

  def getDealListAll(states: Int = 1) = Future {
    db.withConnection{ implicit connection =>
      SQL("SELECT * FROM DealBorrowList WHERE states={states}").on(
        'states -> states
      ).as(dealSimple.*)
    }
  }(ec)

  def getAdmin(acct: String) = Future{
    db.withConnection { implicit connection =>
      SQL("SELECT * FROM Admin WHERE acct={acct}").on(
        'acct -> acct
      ).as(adminSimple.singleOpt)
    }
  }(ec)


}
