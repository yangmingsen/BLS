package utils

import java.text.{DateFormat, SimpleDateFormat}
import java.util.Date

object TimeHelper {

  def getTimeNow() = {
    var date = new Date();
    //format的格式可以任意
    var sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    sdf.format(date)
  }

}
