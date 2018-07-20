package com.lgy.service;

import com.lgy.mapper.UserMapper;
import com.lgy.test.sevice.UserTestService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UserTestService userTestService;

    @Transactional
    public int insert(String name, Integer age){
        log.info("###########name:{},age:{}", name,age);
        int insertResult = userMapper.insert(name, age);

        log.info("UserService结束");
        log.info("userTestService开始");
        userTestService.insert(name, age);
        return insertResult;
    }
}
