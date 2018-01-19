package com.myspring.aop.service;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.stereotype.Service;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@Service
public class AopServiceImp implements  AopService {
    public void m1() {
        System.out.println("This is Service m1.");
    }

    public void m2() {
        System.out.println("This is Service m2.");

    }

    public void m3() {
        System.out.println("This is Service m3.");

    }

    public void m4() {
        System.out.println("This is Service m4.");

    }
}
