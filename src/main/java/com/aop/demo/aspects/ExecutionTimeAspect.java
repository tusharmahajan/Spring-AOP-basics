package com.aop.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class ExecutionTimeAspect {

//    @Around("execution(* com.aop.demo.services.*.*(..))")
//    @Around("com.aop.demo.aspects.JointPointConfig.servicesPointCut()")
//    @Around("com.aop.demo.aspects.JointPointConfig.movieBeanPointCut()")
    @Around("com.aop.demo.aspects.JointPointConfig.measureTimeAnnotation()")
    public Object logExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();

        long timeTaken = System.currentTimeMillis()-startTime;

        log.info("Total execution Time of method {} took {}", proceedingJoinPoint , timeTaken);
        return result;
    }
}
