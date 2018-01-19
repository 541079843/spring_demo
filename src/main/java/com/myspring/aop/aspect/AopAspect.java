package com.myspring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.stereotype.Component;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@Component
public class AopAspect {

    public Object around(ProceedingJoinPoint pip) throws Throwable {

        System.out.println("around 1 ---->");

        Object obj = pip.proceed();

        System.out.println("around 2 <----");

        return  obj;
    }
}
