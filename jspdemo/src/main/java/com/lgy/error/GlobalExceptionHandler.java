package com.lgy.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//全局捕获异常：1、捕获返回json；2、捕获返回页面
@ControllerAdvice(basePackages = "com.lgy.controller")
public class GlobalExceptionHandler {
//    @ResponseBody 返回json格式
//@ModeAndView 返回页面

@ResponseBody
@ExceptionHandler(RuntimeException.class)
    public Map<String,Object> errorResult() {
        Map<String,Object> errorResultMap = new HashMap<String, Object>();
        errorResultMap.put("errorCode","500");
        errorResultMap.put("errorMsg","系统错误");
        return  errorResultMap;
    }
}
