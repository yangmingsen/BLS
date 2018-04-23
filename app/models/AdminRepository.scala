package models

import java.util.Date
import javax.inject.{Inject, Singleton}

import anorm.SqlParser._
import play.api.db.DBApi
import anorm._

import scala.concurrent.Future
import scala.util.matching.Regex.Match


case class AdminM(acct: String,
                 pasd: String)

case class DealBorrowList(bookid: Long,//书的id
                          booktitle: String,//书名字
                          userid: String,//用户id
                          username: String,//用户名字
                          amount: Int,//数量
                          states: Int,
                          borrowdate: Date) //借阅时间

case class History2018(bookid: Long, //书的id
                       booktitle: String,//书的名字
                       amount: Int,//数量
                       userid: String,//用户id
                       lenddate: Date,//借阅时间
                       returndate: Date) //还书时间

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
    get[Date]("DealBorrowList.borrowdate") map {
      case bookid~booktitle~userid~username~amount~states~borrowdate =>
        DealBorrowList(bookid,booktitle, userid,username,amount,states,borrowdate)
    }
  }

  private val historySimple = {
    get[Long]("history2018.bookid") ~
    get[String]("history2018.booktitle") ~
    get[Int]("history2018.amount") ~
    get[String]("history2018.userid") ~
    get[Date]("history2018.lenddate") ~
    get[Date]("history2018.returndate") map {
      case bookid~booktitle~amount~userid~lenddate~returndate =>
        History2018(bookid,booktitle,amount,userid,lenddate,returndate)
    }
  }





  /**同意客户请求
    *
    * @param userid
    * @param bookid
    */
  def agreeClientRequest(userid: String, bookid: Long) = Future {
    db.withConnection { implicit connection =>
      SQL("UPDATE DealBorrowList SET states=2 WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
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
  def addToHistory(userid: String, bookid: Long) =  {
    db.withConnection { implicit connection =>
      val One = SQL("SELECT * FROM DealBorrowList WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).as(dealSimple.singleOpt)

      One match {
        case Some(d) => {
          SQL("INSERT INTO history2018 (bookid,booktitle,amount,userid,lenddate)VALUES({bookid},{booktitle},{amount},{userid},{lenddate})").on(
            'bookid -> d.bookid,
            'booktitle -> d.booktitle,
            'amount -> d.amount,
            'userid -> d.userid,
            'lenddate -> d.borrowdate
          ).executeUpdate()
        }
        case None =>{}
      }

      SQL("DELETE FROM DealBorrowList WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).executeUpdate()

    }
  }

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
