package com.lgy.mamber.controller;

import com.lgy.config.DBConfig1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @Autowired
    private DBConfig1 dbConfig1;
    @RequestMapping("/index2")

    public  String index() {

        System.out.println(dbConfig1.getUsername());
        System.out.println(dbConfig1.getPassword());
        System.out.println(dbConfig1.getUrl());
        System.out.println(dbConfig1.getTestQuery());
        return "我是index2";


    }

}
