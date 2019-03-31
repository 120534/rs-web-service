package edu.chd.lasrc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * @ Author     ：wanghl
  * @ Date       ：Created in 10:28 2019-3-28
  * @ Description：None
  * @ Modified By：
  */
@SpringBootApplication
class Application{}

object Main {
    def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Application])
    }
  }
