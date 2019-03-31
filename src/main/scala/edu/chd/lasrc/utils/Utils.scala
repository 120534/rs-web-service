package edu.chd.lasrc.utils

import java.util.Date

/**
  * @ Author     ：wanghl
  * @ Date       ：Created in 19:11 2019-3-31
  * @ Description：None
  * @ Modified By：
  */
object Utils {

  /**
   * description: 将字符串转换为两个日期
   * created time:  2019-3-31
   * 
   *  params 
   * @return 
   */

  def getDate(str: String):(Date, Date) ={
    val times = str.split(" - ")
    import java.text.SimpleDateFormat
    val newtime = new SimpleDateFormat("MM/dd/yyyy")

    val dates = times.map{
      x => newtime.parse(x)
    }
    (dates(0),dates(1))
  }

//  implicit def imageInfo2image(imageInfo: ImageInfo):RealImage = {
//      val sensor = imageInfo.getSensor
//      val path = imageInfo.path
//      val row = imageInfo.row
//      val tie = imageInfo.tier
//      val date = getDate(imageInfo.date)
//      new RealImage(sensor,path,row,date,tie)
//
//  }

}
