package com.springbootaop;

import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class aop {
    @Pointcut(value="execution(* com.springbootaop.controller..*.*(..))")
    public void test(){
    }
    @Before("test()")
    public void before(){
        System.out.println("before...........");

    }


}