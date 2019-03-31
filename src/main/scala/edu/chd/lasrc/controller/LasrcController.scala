package edu.chd.lasrc.controller

import java.util.Date

import edu.chd.lasrc.entity.{Image, ImageInfo}
import edu.chd.lasrc.service.LasrcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.ui.Model
import org.springframework.web.bind.annotation._
import org.springframework.stereotype.Controller
import org.springframework.web.servlet.ModelAndView

import scala.collection.mutable.ArrayBuffer

/**
  * @ Author     ：wanghl
  * @ Date       ：Created in 10:34 2019-3-28
  * @ Description：None
  * @ Modified By：
  */
@Controller
class LasrcController {

  @Autowired
  private var lasrc:LasrcService = _

  @GetMapping(Array("/lasrc"))
  @ResponseBody
  def doLasrc(@RequestParam path:String):String={
//    for example, the path is /home/hadoop/LC08_L1TP_121039_20180325_20180404_01_T1
    lasrc.doLasrc(path)
  }


  /**
   * description:这里对传进来的ImageInfo进行匹配，得到对应时间范围内合适的
   * created time:  2019-3-31
   * 
   *  params [imageInfo]
   * @return _root_.scala.Predef.String
   */

  @PostMapping(Array("/test"))
  @ResponseBody
  def getTest(imageInfo:ImageInfo):String ={
    imageInfo.toString
  }

  @GetMapping(Array("/images"))
  def getImages(): ModelAndView ={
    val modelAndView = new ModelAndView("image")

    import java.text.SimpleDateFormat
    val sdf = new SimpleDateFormat("yyyy-MM-dd")
    "01/01/2018 - 01/15/2018"
    val arr = ArrayBuffer.empty[Image]
    var image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2018-12-01"), tier = "LT1")
    arr += image
    image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2017-10-11"), tier = "LT1")
    arr += image
    image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2018-12-11"), tier = "LT1")
    arr += image
    image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2018-12-11"), tier = "LT1")
    arr += image
    image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2018-12-11"), tier = "LT1")
    arr += image
    image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2018-12-11"), tier = "LT1")
    arr += image
    image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2018-12-11"), tier = "LT1")
    arr += image
    image = new Image(sensor = "Landsat-8",path = 123, row = 24,
      date = sdf.parse("2018-12-11"), tier = "LT1")
    arr += image

    val images = arr.toArray

    modelAndView.addObject("images", images)
  }
}
