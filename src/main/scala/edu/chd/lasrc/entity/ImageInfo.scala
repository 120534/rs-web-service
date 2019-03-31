package edu.chd.lasrc.entity

import java.util.Date

import scala.beans.BeanProperty

/**
  * @ Author     ：wanghl
  * @ Date       ：Created in 15:16 2019-3-29
  * @ Description：用来包装用户请求的信息
  * @ Modified By：
  */

class ImageInfo(
                 @BeanProperty var sensor: String,
                 @BeanProperty var path: Int,
                 @BeanProperty var row:  Int,
                 @BeanProperty var date: String,
                 @BeanProperty var tier: String
               ) {

  override def toString = s"ImageInfo($sensor, $path, $row, $date, $tier)"

}