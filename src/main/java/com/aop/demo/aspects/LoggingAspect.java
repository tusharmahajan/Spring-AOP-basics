package com.aop.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class LoggingAspect {

//    @AfterReturning(value = "execution(* com.aop.demo.services.*.*(..))", returning = "data")
    public void logAfterExecution(JoinPoint joinPoint, Object data){
        log.info("Method {} returned with: {}", joinPoint, data);
    }

    @AfterThrowing(value = "execution(* com.aop.demo.services.*.*(..))", throwing = "exception")
    public void logAfterException(JoinPoint joinPoint, Object exception) {
        log.info("Method {} returned with exception: {}", joinPoint, exception);
    }

//    @After("execution(* com.aop.demo.services.*.*(..))")
    public void logAllMethod(JoinPoint joinPoint){
        log.info("Log everything: {}", joinPoint);
    }

}
