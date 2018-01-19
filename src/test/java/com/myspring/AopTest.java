package com.myspring;

import com.myspring.aop.service.AopService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aop.xml")
public class AopTest {

    @Autowired
    private AopService aopService;

    @Test
    public void aroundTest() {
        this.aopService.m3();
    }
}
