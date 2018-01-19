package com.myspring.aware.service;

import org.springframework.stereotype.Repository;

/**
 * Created by LIXY3 on 2018/1/14.
 */
@Repository
public class AwareDaoImp implements AwareDao {
    public void say() {
        System.out.println(" This is say.");
    }
}