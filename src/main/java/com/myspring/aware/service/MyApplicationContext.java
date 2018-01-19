package com.myspring.aware.service;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@Service
public class MyApplicationContext implements ApplicationContextAware {
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AwareDao awareDao = (AwareDao)applicationContext.getBean("awareDaoImp");

        System.out.println("This is MyApplicationContext. AwareDao: " +
                awareDao.getClass().hashCode()
        );
    }
}
