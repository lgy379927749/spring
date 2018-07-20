package com.lgy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;

//@EnableAutoConfiguration
//@ComponentScan("com.lgy.controller")
@SpringBootApplication
@EnableAsync//开启异步线程
@MapperScan(basePackages = {"com.lgy.mapper"})//也可以使用@Mapper注解
public class APP {

    public static void main(String[] args) {
        //整个程序入口吗， 启动springboot项目
        //创建内置tomcat服务器，使用tomcat加载springMvc 注解启动类
        //@SpringBootApplication 等于 @EnableAutoConfiguration + @ComponentScan 扫描同级包 和当前包 (包含子包)
        SpringApplication.run(APP.class, args);

        //spring事物原理  AOP技术环绕通知进行拦截。使用spring事物不能tyr，需把异常抛出给外城（注解）springboot默认开启事物
        //多数据源，无限数量（JDBC连接数量）划分数据源  ：使用注解方式|| 分包



    }
}
