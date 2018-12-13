package com.leo.springaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

    @Before("execution(* com.leo.springaop.ProductServiceImpl.multiply(..))")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Before calling method");
    }

    @After("execution(* com.leo.springaop.ProductServiceImpl.multiply(..))")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("After calling method");
    }
}
