package com.myspring;

import com.myspring.inject.service.InjectService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:inject.xml")
public class InjectTest {

    @Autowired
    private InjectService injectService;

    @Test
    public void test1() {

        this.injectService.say();
    }
}
