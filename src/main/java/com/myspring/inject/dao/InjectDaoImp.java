package com.myspring.inject.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by LIXY3 on 2018/1/15.
 */
@Repository
public class InjectDaoImp implements InjectDao {
    public void say() {
        System.out.println("This is Dao.");
    }
}
