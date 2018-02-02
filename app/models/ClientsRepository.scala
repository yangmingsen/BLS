package models

import java.util.Date
import javax.inject.Inject
import javax.inject.Singleton
import anorm.SqlParser._
import anorm._
import play.api.db.DBApi
import scala.concurrent.Future

case class Clients(id: Int,
                   phone: Option[String],
                   pasd: String,
                   name: Option[String],
                   QQ: Option[String],
                   email: Option[String],
                   regdate: Option[Date])
@Singleton
class ClientsRepository @Inject()(dbapi: DBApi) (implicit ec: DatabaseExecutionContext){
  private val db = dbapi.database("default")

  private val simple = {
    get[Int]("clients.id") ~
    get[Option[String]]("clients.phone")~
    get[String]("clients.pasd")~
    get[Option[String]]("clients.name")~
    get[Option[String]]("clients.QQ")~
    get[Option[String]]("clients.email")~
    get[Option[Date]]("clients.regdate") map {
      case id~phone~pasd~name~qq~email~redate =>
      Clients(id,phone,pasd,name,qq,email,redate)
    }
  }

  def checkAcct(phone: String)= Future{
    db.withConnection{ implicit connection =>
      SQL("select * from clients where phone={phone}")
        .on('phone -> phone).as(simple.singleOpt)
    }
  }

  def insertUserFromEmail(email: String, pasd: String, realName: String) = Future{
    println("email="+email + "pasd ="+pasd)
    db.withConnection{ implicit connection =>
        SQL("insert into clients (name,pasd,email) VALUES ({name},{pasd},{email})").on('name -> realName,
        'pasd -> pasd,
        'email -> email).executeUpdate()
    }
  }(ec)

}
