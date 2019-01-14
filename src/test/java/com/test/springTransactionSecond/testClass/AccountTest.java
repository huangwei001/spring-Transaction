package com.test.springTransactionSecond.testClass;

import com.test.springTransationSecond.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationSecond.xml")
public class AccountTest {

    @Resource(name = "accountServiceProxy")
    private AccountService accountService;


    @Test
    public void demo1() {

        accountService.updateAccount("aaa", "bbb", 200);

    }


}
