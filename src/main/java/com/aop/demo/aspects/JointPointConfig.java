package com.aop.demo.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class JointPointConfig {

    @Pointcut("execution(* com.aop.demo.repository.*.*(..))")
    public void dataLayerPointCut(){}

    @Pointcut("execution(* com.aop.demo.services.*.*(..))")
    public void servicesPointCut(){}

    @Pointcut("bean(movie*)")
    public void movieBeanPointCut(){}

    @Pointcut("@annotation(com.aop.demo.customAnnotation.MeasureTime)")
    public void measureTimeAnnotation(){}
}
