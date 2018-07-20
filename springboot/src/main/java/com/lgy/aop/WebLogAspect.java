package com.lgy.aop;

import com.google.gson.Gson;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

//申明是个切面
@Aspect
//申明是个spring管理的bean
@Component
public class WebLogAspect {


    private static final Logger log = LogManager.getLogger(WebLogAspect.class);
    private Gson gson = new Gson();

    //申明一个切点 里面是 execution表达式
    @Pointcut("execution(public * com.lgy.controller.*.*(..))")
    private void webLog() {
    }

    //请求method前打印内容 打印参数
    @Before(value = "webLog()")
    public void methodBefore(JoinPoint joinPoint) {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        //打印请求内容
        log.info("===============请求内容===============");
        log.info("请求地址:" + request.getRequestURL().toString());
        log.info("请求方式:" + request.getMethod());
        log.info("请求类方法:" + joinPoint.getSignature());
        log.info("请求类方法参数:" + Arrays.toString(joinPoint.getArgs()));
        log.info("===============请求内容===============");
    }

    //在方法执行完结后打印返回内容
    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void methodAfterReturing(Object ret) {
        log.info("--------------返回内容----------------");
        log.info("Response内容:" + ret);
        log.info("--------------返回内容----------------");


    }
}
