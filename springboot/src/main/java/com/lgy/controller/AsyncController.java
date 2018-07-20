package com.lgy.controller;

import com.lgy.service.AsyncService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// springboot异步调用
@RestController
@Slf4j
public class AsyncController {




    @Autowired
    AsyncService asyncService;
    @org.springframework.beans.factory.annotation.Value("${name}")
    private String name;
    @Value("${http_url}")
    private String http_url;

    @RequestMapping("/addUserAndEmail")
    private  String addUserAndEmail (){



        asyncService.addUserAndEmail();

        log.info("1");
        String result = asyncService.addUserAndEmail();
        System.out.println(result);
        log.info("4");

        return "result:"+result;
    }

    @RequestMapping("/getName")
    public String getName(){
        return http_url;
    }
}
