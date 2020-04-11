package com.linktree.sikehome.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Aspect//切面需要的
@Order()//spring组件执行顺序 不写默认最低优先级加载
@Component//组件
@Slf4j//日志
public class ControllerAop {


    @Pointcut("within(com.linktree.sikehome.controller..*)")
    public void webLog(){}

    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) {

        // 接收到请求，记录请求内容
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        log.info("请求地址 : {}" , request.getRequestURL().toString());
        log.info("请求类 : {}"  ,joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
        log.info("请求参数 : {}" , Arrays.toString(joinPoint.getArgs()));

    }

    @AfterReturning(returning = "ret", pointcut = "webLog()")
    public void doAfterReturning(Object ret) {
        // 处理完请求，返回内容
        log.info("返回报文 : {}" , ret);
    }


}
