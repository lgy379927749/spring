package com.lgy.test.mapper;

import com.lgy.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

//@Mapper
public interface UserTestMapper {
    //查询语句
    @Select("SELECT * FROM USERS WHERE NAME = #{name}")
    User findByName(@Param("name") String name);


    @Insert("INSERT INTO USERS (NAME,AGE) VALUES(#{name},#{age})")
    int insert(@Param("name") String name, @Param("age") Integer age);
}
