package com.myspring.transaction.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * Created by LIXY3 on 2018/1/18.
 */
public class AccountDaoImpOne extends JdbcDaoSupport implements AccountDao {

    public void OutMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ?";
        this.getJdbcTemplate().update(sql, money, out);
    }

    public void InMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);

    }
}
