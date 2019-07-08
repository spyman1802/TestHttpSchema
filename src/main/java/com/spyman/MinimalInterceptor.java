package com.spyman;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2019-07-08 15:28
 */
@Slf4j
public class MinimalInterceptor extends HandlerInterceptorAdapter {
  @Override
  public boolean preHandle(HttpServletRequest requestServlet, HttpServletResponse responseServlet, Object handler) throws Exception
  {
    System.out.println("MINIMAL: INTERCEPTOR PREHANDLE CALLED");

    log.info("");

    return true;
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception
  {
    System.out.println("MINIMAL: INTERCEPTOR POSTHANDLE CALLED");

    log.info("headers: {}", request.getHeader("X-Forwarded-Proto"));
    log.info("schema: {}", request.getScheme());
    log.info("RemoteHost: {}", request.getRemoteHost());
    log.info("getRemoteAddr: {}", request.getRemoteAddr());
    log.info("getRemotePort: {}", request.getRemotePort());
    log.info("getRequestURL: {}", request.getRequestURL());

  }

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exception) throws Exception
  {
    System.out.println("MINIMAL: INTERCEPTOR AFTERCOMPLETION CALLED");
  }
}
