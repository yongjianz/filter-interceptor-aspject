package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Aspect("perthis(this(com.example.demo.aspect.TestDao))")
@Component
@Scope("prototype")
public class TimeAspect {


    @Before("execution(* com.example.demo.controller.*.*(..))")
    public void log(){
        System.out.println("记录日志");
    }

    @Around("execution(* com.example.demo.aspect.*.*(..))")
    public void log1(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("开始记录日志");
        System.out.println(this.hashCode());
        pjp.proceed();
        System.out.println("记录日志完毕");
    }
}
