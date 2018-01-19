package com.myspring;

import com.myspring.aware.service.AwareDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:aware.xml")
public class AwareTest {

    @Autowired
    private AwareDao awareDao;

    @Test
    public void test1() {
        System.out.println("This is Test. AwareDao: " + awareDao.getClass().hashCode());
    }
}
