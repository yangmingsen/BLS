package models


import java.util.Date
import javax.inject.Inject

import anorm.SqlParser._
import anorm._
import play.api.db.DBApi

import scala.concurrent.Future
import javax.inject.Singleton


/*
 *
 * create by yangmingsen on 2018/04
 */
case class BookInfos(id: Long,
                     title: String,
                     author: Option[String],
                     bookconcern: String,
                     amount: Int,
                     isbn: Option[String],
                     addtime: Option[Date])//定义样本类
/**
  *
  * @param dbapi 默认数据库
  * @param ec    DatabaseExecutionContext
  */
@Singleton
class BookInfosRepository @Inject()(dbapi: DBApi)(implicit ec: DatabaseExecutionContext) {

  private val db = dbapi.database("default")

  private val booksimple = {
    get[Long]("bookinfos1.id") ~
      get[String]("bookinfos1.title") ~
      get[Option[String]]("bookinfos1.author") ~
      get[String]("bookinfos1.bookconcern") ~
      get[Int]("bookinfos1.amount") ~
      get[Option[String]]("bookinfos1.ISBN")~
      get[Option[Date]]("bookinfos1.addtime") map {
      case id ~ title ~ author ~ bookconcern ~ amount ~ isbn ~ addtime =>
        BookInfos(id, title, author,bookconcern, amount,isbn, addtime)
    }
  }

  /**
    * 根据输入的关键字对对数据库进行查询.
    * @param key 用户输入的关键字
    * @return Future[scala.List[BookInfos]
    */
  def findByName(key: String) = Future {
    db.withConnection { implicit connection =>
      var k = key
      if( k.length == 0 ) {
        k = "C++"
      }
      SQL(
        s"""
          SELECT * FROM bookinfos1 WHERE title LIKE ${"'%" + k + "%'"}
        """).as(booksimple.*)
    }
  }(ec)

  def findById(id: Long) = Future {
    db.withConnection{ implicit connection =>
      SQL("select * from bookinfos1 where id = {id}").on('id -> id).as(booksimple.singleOpt)
    }
  }(ec)

  def findBookBorrowOK(id: Long) = {
    db.withConnection { implicit conn =>
      SQL("SELECT * FROM bookinfos1 WHERE id={bookid} AND amount>0").on(
        'bookid -> id
      ).as(booksimple.singleOpt)
    }
  }

  def bookNumReduce(id: Long) = Future {
    db.withConnection { implicit conn =>
        SQL("UPDATE bookinfos1 set amount=amount-1 WHERE id={bookid}").on(
          'bookid -> id
        ).executeUpdate()
    }
  }(ec)

}
