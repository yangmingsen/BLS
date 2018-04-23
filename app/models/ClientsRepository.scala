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

@Singleton
class ClientsRepository @Inject()(dbapi: DBApi,admin: AdminRepository) (implicit ec: DatabaseExecutionContext){
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
  def addDealBorrowList(userid: String): Int = {
    db.withConnection { implicit connection =>

     val cartlist = getCart(userid)
      if( cartlist.size == 0 ) {
        return -2
      }

      var dealList = admin.getUserId(userid)
      if( (dealList.size + cartlist.size) > 2) {
        return -1
      }

      for(h <- cartlist ) {
        for( d <- dealList) {
          if( h.bookid == d.bookid) {
            return h.bookid.toInt
          }
        }
      }


      var username = ""
      val tmp = SQL("SELECT * FROM Stu WHERE sstu={sstu}").on(
        'sstu -> userid
      ).as(stuSimple.singleOpt)
      tmp match {
        case Some( h ) => username = h.sname
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

      return 0

    }
  }


  def delDealListOfState(userid: String, bookid: Long, states: Int) = Future{
    db.withConnection { implicit connection =>
      SQL("DELETE FROM DealBorrowList WHERE userid={userid} AND states={states} AND bookid={bookid}").on(
        'userid -> userid,
        'states -> states,
        'bookid -> bookid
      ).executeUpdate()
    }
  }(ec)

  def continueBorrowReq(userid: String, bookid: Long) = Future {
    db.withConnection { implicit connection =>
      SQL("UPDATE DealBorrowList SET states=1 WHERE userid={userid} AND bookid={bookid}").on(
        'userid -> userid,
        'bookid -> bookid
      ).executeUpdate()
    }
  }(ec)


  def getStu(sstu: String ) = Future {
    db.withConnection { implicit conn =>
      SQL("SELECT * FROM Stu WHERE sstu={sstu}").on(
        'sstu -> sstu
      ).as(stuSimple.singleOpt)
    }
  }(ec)

}
