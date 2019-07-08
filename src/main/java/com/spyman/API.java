package com.spyman;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 陈震 【1525822@qq.com】
 * @Date 2019-07-08 15:19
 */
@RestController
@Slf4j
@RequestMapping("/")
@Api(tags = {"加纳银行接口（内部调用）"})
public class API {

  @ApiOperation(value = "充值", notes = "")
  @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
  public String test() {
    return "Hello World";
  }
}
