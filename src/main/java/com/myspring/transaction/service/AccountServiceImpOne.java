package com.myspring.transaction.service;

import com.myspring.transaction.dao.AccountDao;

/**
 * Created by LIXY3 on 2018/1/18.
 */
public class AccountServiceImpOne implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(String out, String in, Double money) {
        this.accountDao.OutMoney(out, money);
        this.accountDao.InMoney(in, money);
    }
}
