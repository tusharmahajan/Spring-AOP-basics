package com.aop.demo.aspects;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
@Slf4j
public class AccessAspectCheck {

//    @Before("com.aop.demo.aspects.JointPointConfig.dataLayerPointCut()")
    public void userAccess(JoinPoint joinPoint){
        log.info("Intercepted call before execution of: {}", joinPoint);
    }


}
