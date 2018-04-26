package models

import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton
import anorm.SqlParser._
import anorm._
import play.api.db.DBApi
import scala.concurrent.Future


case class Stu(sstu: String,
               sname: String,
               ssex: String,
               sclass: Int,
               sphone: String,
               sqq: String,
               spasd: String)

case class Cart(userid: String,//
                title: String,
                bookid: Long,
                amount: Int,
                addtime: Date)


case class BorrowStates(states: Int,
                        bookid: Option[Long],
                        bookname: Option[String])

@Singleton
class ClientsRepository @Inject()(dbapi: DBApi,admin: AdminRepository, book: BookInfosRepository) (implicit ec: DatabaseExecutionContext){
  private val db = dbapi.database("default")


  private val cartSimple = {
    get[String]("Cart.userid")~
    get[String]("Cart.title")~
    get[Long]("Cart.bookid")~
    get[Int]("Cart.amount")~
    get[Date]("Cart.addtime") map {
      case userid~title~bookid~amount~addtime =>
        Cart(userid,title,bookid,amount,addtime)
    }
  }

  private val stuSimple = {
    get[String]("Stu.sstu") ~
    get[String]("Stu.sname") ~
    get[String]("Stu.ssex") ~
    get[Int]("Stu.sclass") ~
    get[String]("Stu.sphone") ~
    get[String]("Stu.sqq") ~
    get[String]("Stu.spasd") map {
      case sstu~sname~ssex~sclass~sphone~sqq~spasd => Stu(sstu,sname,ssex,sclass,sphone,sqq,spasd)
    }
  }




//  /** Use email to sign up for an account
//    *
//    * @param email the user Acct
//    * @param pasd password
//    * @param realName name
//    * @return
//    */
//  def insertUserFromEmail(email: String, pasd: String, realName: String) = Future{
//    db.withConnection{ implicit connection =>
//        SQL("insert into clients (name,pasd,email) VALUES ({name},{pasd},{email})").on('name -> realName,
//        'pasd -> pasd,
//        'email -> email).executeUpdate()
//    }
//  }(ec)

  /**Check the cart for the presence of this item.
    *
    * @param bookid the book ID
    * @param userid  client ID
    */
  def checkItemIsAdd(bookid: Long, userid: String) = {
      db.withConnection { implicit connection =>
        SQL("SELECT * from Cart WHERE userid={userid} AND bookid={bookid}").on(
          'userid -> userid,
          'bookid -> bookid).as(cartSimple.singleOpt)
      }
  }

  /**Write the user's operation into tzhe database
    *
    * @param userid the user ID
    * @param title  the book name
    * @param bookid the book ID
    * @param amount the books amount
    * @return Int
    */
  def addItemToDb(userid: String, title: String, bookid: Long, amount: Int = 1) = {
    db.withConnection{ implicit connection =>
      SQL("insert into Cart (userid,title,bookid,amount)VALUES({userid},{title},{bookid},{amount})").on('userid ->userid,
      'title -> title,
      'bookid -> bookid,
      'amount -> amount).executeUpdate()
    }
  }

  /** Get the shopping cart list
    *
    * @param userid
    * @return :scala.List[Cart]
    */
  def getCart(userid: String) = {
    db.withConnection{ implicit connection =>
      SQL("select * from Cart where userid = {userid}").on('userid -> userid).as(cartSimple.*)
    }
  }

  def deleteCartFromDb(userid: String, bookid: Long) = Future{
    println("userid = "+userid+" bookid="+bookid)
    db.withConnection { implicit connection =>
      SQL("DELETE FROM Cart WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).executeUpdate()
    }
  }(ec)


  /** 将购物车列表加入到待管理员处理列表
    *
    * @param userid the user ID
    * @return Unit
    */
  def addDealBorrowList(userid: String): BorrowStates = {
    db.withConnection { implicit connection =>

     val cartlist = getCart(userid)
      if( cartlist.size == 0 ) {
        return BorrowStates(-2,None,None)//表示现在借阅列表为空
      }

      for( c <- cartlist ) {
        book.findBookBorrowOK(c.bookid) match {
          case Some(ha) => {/*book.bookNumReduce(c.bookid)*/}
          case None => {return BorrowStates(-3,Some(c.bookid),Some(c.title))}//数量不足
        }

      }

      var dealList = admin.getUserId(userid)
      if( (dealList.size + cartlist.size) > 2) {
        return BorrowStates(-1,None,None) //表示借阅和正在处理的书籍超过2本
      }

      for(h <- cartlist ) {
        for( d <- dealList) {
          if( h.bookid == d.bookid) {
            return BorrowStates(-4,Some(h.bookid),Some(h.title))//表示有相同书籍
          }
        }
      }


      var username = ""
      val tmp = SQL("SELECT * FROM Stu WHERE sstu={sstu}").on(
        'sstu -> userid
      ).as(stuSimple.singleOpt)
      tmp match {
        case Some( h ) => username = h.sname
        case None => {}
      }


      for(x <- cartlist) {
        SQL("INSERT INTO DealBorrowList (bookid,booktitle,userid,username,amount)VALUES({bookid},{booktitle},{userid},{username},{amount})").on(
          'bookid -> x.bookid,
          'booktitle -> x.title,
          'userid -> x.userid,
          'username -> username,
          'amount -> x.amount
        ).executeUpdate()
      }

      SQL("DELETE from Cart WHERE userid = {userid}").on(
        'userid -> userid
      ).executeUpdate()


      BorrowStates(0,None,None)

    }
  }

  /**
    * 删除
    * @param userid
    * @param bookid
    * @param states
    * @return
    */
  def delDealListOfState(userid: String, bookid: Long, states: Int) = Future{
    db.withConnection { implicit connection =>
      SQL("DELETE FROM DealBorrowList WHERE userid={userid} AND states={states} AND bookid={bookid}").on(
        'userid -> userid,
        'states -> states,
        'bookid -> bookid
      ).executeUpdate()
    }
  }(ec)

  /**
    * 继续申请
    * @param userid
    * @param bookid
    * @return
    */
  def continueBorrowReq(userid: String, bookid: Long) = Future {
    db.withConnection { implicit connection =>
      SQL("UPDATE DealBorrowList SET states=1 WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).executeUpdate()
    }
  }(ec)

  /**
    * 得到一个用户信息
    * @param sstu
    * @return
    */
  def getStu(sstu: String ) = Future {
    db.withConnection { implicit conn =>
      SQL("SELECT * FROM Stu WHERE sstu={sstu}").on(
        'sstu -> sstu
      ).as(stuSimple.singleOpt)
    }
  }(ec)

  /**
    * 用户还书申请
    * @param userid
    * @param bookid
    * @param date
    * @return
    */
  def returnBookReq(userid: String, bookid: Long, date: String ) = Future {
    db.withConnection { implicit conn =>
      SQL("UPDATE DealBorrowList SET states=3 , retdate={agredate} WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid,
        'agredate -> date
      ).executeUpdate()
    }
  }(ec)

}
