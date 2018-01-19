package com.myspring.inject.service;

import com.myspring.inject.dao.InjectDao;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@Service
public class InjectServiceImp implements InjectService, InitializingBean,DisposableBean {

//    @Autowired
    private InjectDao injectDao;

//    @Autowired
    public void setInjectDao(InjectDao injectDao) {
        System.out.println("This is Setter.");
        this.injectDao = injectDao;
    }

//    @Autowired
//    public InjectServiceImp(InjectDao injectDao) {
//        System.out.println("This is Constructor.");
//        this.injectDao = injectDao;
//    }


    public void say() {
        System.out.println("This is say.");
        this.injectDao.say();
    }

    public void beanInit() {
        System.out.println("This is bean init.");
    }
    public void beanDestroy() {
        System.out.println("This is bean destroy.");
    }

    public void defaultInit() {
        System.out.println("This is defaultInit.");
    }

    public void defaultDestroy() {
        System.out.println("This is defaultDestroy.");
    }

    public void destroy() throws Exception {
        System.out.println("This is DisposableBean destroy.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("This is InitializingBean afterPropertiesSet.");
    }
}
