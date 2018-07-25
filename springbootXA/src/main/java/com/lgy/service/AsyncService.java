package com.lgy.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class AsyncService {
    @Async //相当于这个方法单独线程在执行
    //思路： 使用AOP技术在运行时 创建一个单独线程进行执行   addUserAndEmailimpl ()
    public  String addUserAndEmail (){

        log.info("2");
        try {
            Thread.sleep(5000);
        }catch (Exception e){

        }
        log.info("3");

        return "路小雨后很清新";
    }




    public  String addUserAndEmailimpl (){


        //使用ExecutorService、Callable、Future实现有返回结果的多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                log.info("2");
                try {
                    Thread.sleep(5000);
                }catch (Exception e){

                }
                log.info("3");


            }
        }).start();
        return "路小雨后很清新";
    }
}
