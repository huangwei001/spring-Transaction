package com.test.springTransationSecond.ServiceImpl;

import com.test.springTransationSecond.dao.AccountDao;
import com.test.springTransationSecond.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

    AccountDao accountDao;


    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    public void updateAccount(final String out, final String in, final double money) {
        accountDao.updateInAccount(in, money);
        accountDao.updateOutAccount(out, money);

    }




}
