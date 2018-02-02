package models


import java.util.Date
import javax.inject.Inject

import anorm.SqlParser._
import anorm._
import play.api.db.DBApi

import scala.concurrent.Future
import javax.inject.Singleton



case class BookInfos(id: Int,
                     title: String,
                     bookconcern: String,
                     author: Option[String],
                     amount: Int,
                     addtime: Option[Date])//定义样本类
/**
  *
  * @param dbapi 默认数据库
  * @param ec    DatabaseExecutionContext
  */
@Singleton
class BookInfosRepository @Inject()(dbapi: DBApi)(implicit ec: DatabaseExecutionContext) {

  private val db = dbapi.database("default")

  private val simple = {
    get[Int]("bookinfos.id") ~
      get[String]("bookinfos.title") ~
      get[String]("bookinfos.bookconcern") ~
      get[Option[String]]("bookinfos.author") ~
      get[Int]("bookinfos.amount") ~
      get[Option[Date]]("bookinfos.addtime") map {
      case id ~ title ~ bookconcern ~ author ~ amount ~ addtime =>
        BookInfos(id, title, bookconcern, author, amount, addtime)
    }
  }

  /**
    * 根据输入的关键字对对数据库进行查询.
    * @param key 用户输入的关键字
    * @return Future[scala.List[BookInfos]
    */
  def findByName(key: String) = Future {
    db.withConnection { implicit connection =>
      SQL(
        s"""
          SELECT * FROM bookinfos WHERE title LIKE ${"'%" + key + "%'"}
        """).as(simple.*)
    }
  }(ec)

  def findById(id: Long) = Future {
    db.withConnection{ implicit connection =>
      SQL("select * from bookinfos where id = {id}").on('id -> id).as(simple.singleOpt)
    }
  }

}
