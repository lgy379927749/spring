package com.lgy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    //全局捕获异常 使用AOP技术  采用异常通知
    @RequestMapping("/getUser")
    public String getUser(int i) {
        int j = 0;
        try {
            j = 1 / i;
        } catch (Exception e) {
            return "error";
        }
        return "结果" + j;
    }
    @RequestMapping("/getUsers")
    public String getUsers(int i) {
        int j = 1 / i;
        return "结果" + j;
    }
    ;

}
