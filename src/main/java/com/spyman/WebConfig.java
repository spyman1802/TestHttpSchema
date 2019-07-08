package com.spyman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2019-07-08 15:26
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {
  @Override
  public void addInterceptors(InterceptorRegistry registry)
  {
    registry.addInterceptor(new MinimalInterceptor());
  }
}
