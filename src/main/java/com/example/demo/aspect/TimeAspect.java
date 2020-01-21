package com.example.demo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TimeAspect {


    @Before("execution(* com.example.demo.controller.*.*(..))")
    public void log(){
        System.out.println("记录日志");
    }
}
