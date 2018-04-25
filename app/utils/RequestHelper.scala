package utils

import play.api.mvc.RequestHeader

/*
*
* created by yangmingsen on 2018/04
 */
object RequestHelper {

  def isALogin(implicit request: RequestHeader): Boolean = {
    request.session.get("AdminAcct").nonEmpty
  }

  def isCLogin(implicit request: RequestHeader): Boolean = {
    request.session.get("userAcct").nonEmpty
  }

  def getCA(implicit request: RequestHeader): String = {
    request.session("userAcct")
  }

}
