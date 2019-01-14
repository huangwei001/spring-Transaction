package com.test.springTransactionThird.testClass;

import com.test.springTransactionThird.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationThird.xml")
public class AccountTest {

    @Resource(name = "accountService")
    private AccountService accountService;


    @Test
    public void demo1() {

        accountService.updateAccount("aaa", "bbb", 200);

    }


}
