package com.myspring;

import com.myspring.transaction.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by LIXY3 on 2018/1/18.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:transaction_one.xml")
public class TransactionTestOne {

    @Autowired
    private AccountService accountService;

    @Test
    public void accoutTest() {
        this.accountService.transfer("aaa", "bbb", 200d);
    }
}
