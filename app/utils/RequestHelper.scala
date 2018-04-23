package utils

import play.api.mvc.RequestHeader

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
