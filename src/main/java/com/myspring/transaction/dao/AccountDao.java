package com.myspring.transaction.dao;

/**
 * Created by LIXY3 on 2018/1/18.
 */
public interface AccountDao {

    void OutMoney(String out, Double money);

    void InMoney(String in, Double money);
}
