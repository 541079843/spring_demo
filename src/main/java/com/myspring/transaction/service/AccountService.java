package com.myspring.transaction.service;

/**
 * Created by LIXY3 on 2018/1/18.
 */
public interface AccountService {

    void transfer(String out, String in, Double money);
}
