package com.lgy.controller;

import com.lgy.service.UserService;
import com.lgy.test.sevice.UserTestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    UserTestService userTestService;

     @RequestMapping("/insertUser")
    public  String insertUser(String name, Integer age){

    log.info("Controller开始");
    int insertResult = userService.insert(name, age);
    log.info("Controller结束");
    return String.valueOf(insertResult);
    }


    @RequestMapping("/insertTestUser")
    public  String insertTestUser(String name, Integer age){

        log.info("Controller开始");
        int insertResult = userTestService.insert(name, age);
        log.info("Controller结束");
        return String.valueOf(insertResult);
    }


}
