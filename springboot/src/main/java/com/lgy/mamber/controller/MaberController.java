package com.lgy.mamber.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class MaberController {
    //@RestController 注解 表示该类的所有的方法返回json 格式@constroller + @ResponseBody
    //@RestController 为微服务提供返回json格式
    //springBoot 启动原理 ：springMVC 注解方式启动 :内置HTTP服务器 ： （默认Tomcat）
    // @EnableAutoConfiguration 自动配置 扫包范围 默认在当前类里面
    //加上扫包范围
    @RequestMapping("/index")
    public  String memberIndex (){
        return "springboot11开始啦";
    }


}
