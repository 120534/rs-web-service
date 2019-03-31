package edu.chd.lasrc.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.{EnableWebMvc, WebMvcConfigurer}

/**
  * @ Author     ：wanghl
  * @ Date       ：Created in 10:53 2019-3-29
  * @ Description：None
  * @ Modified By：
  */
@Configuration
@EnableWebMvc
class ViewAdapter extends WebMvcConfigurer{

  import org.springframework.web.servlet.config.annotation.ViewControllerRegistry

  @Override
  def addViewControllers(registry: ViewControllerRegistry): Unit = {
    super.addViewControllers(registry)
    registry.addViewController("/home").setViewName("forward:/login.html")
  }

  import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry

  def addResourceHandlers(registry: ResourceHandlerRegistry): Unit = {
    super.addResourceHandlers(registry)
    // 通过 "/home.html" 请求, 来访问 /resource/static/home.html 静态资源
    registry.addResourceHandler("/login.html").addResourceLocations("classpath:/static/login.html")
  }
}
