package com.lgy.mamber.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
@RequestMapping("/index2")
    public  String index() {
     return "我是index2";
    }

}
