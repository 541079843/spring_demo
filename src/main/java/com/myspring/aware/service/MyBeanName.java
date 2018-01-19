package com.myspring.aware.service;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Service;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@Service
public class MyBeanName implements BeanNameAware {
    public void setBeanName(String name) {
        System.out.println("This is MyBeanName: " + name);
    }
}
