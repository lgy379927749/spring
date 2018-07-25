package com.lgy.test.sevice;

import com.lgy.mapper.UserMapper;
import com.lgy.test.mapper.UserTestMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
public class UserTestService {
    @Autowired
    UserTestMapper userMapper;

    @Transactional
    public int insert(String name, Integer age){
        log.info("###########name:{},age:{}", name,age);
        int insertResult = userMapper.insert(name, age);
        int i = 1 / age;
        log.info("UsertestService结束");
        return insertResult;
    }
}
