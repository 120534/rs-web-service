package edu.chd.lasrc.entity

import java.util.Date

import scala.beans.BeanProperty

/**
  * @ Author     ：wanghl
  * @ Date       ：Created in 19:36 2019-3-31
  * @ Description：封装一些影像的信息，如：sensor，path，row，tie等等
  * @ Modified By：
  */
class Image (@BeanProperty var sensor: String,
             @BeanProperty var path: Int,
             @BeanProperty var row:  Int,
             @BeanProperty var date: Date,
             @BeanProperty var tier: String){}
