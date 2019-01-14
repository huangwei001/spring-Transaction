package com.test.springTransactionThird.ServiceImpl;

import com.test.springTransactionThird.dao.AccountDao;
import com.test.springTransactionThird.service.AccountService;

public class AccountServiceImpl implements AccountService {

    AccountDao accountDao;


    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }


    public void updateAccount(final String out, final String in, final double money) {
        accountDao.updateInAccount(in, money);
        int i = 10 /0;
        accountDao.updateOutAccount(out, money);

    }




}
