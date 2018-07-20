package com.lgy.order.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderIndex {
    @RequestMapping("/orderIndex")
    public  String memberIndex (){
        return "orderIndex开始啦";
    }
}
