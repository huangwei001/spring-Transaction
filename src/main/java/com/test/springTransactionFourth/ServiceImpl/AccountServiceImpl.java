package com.test.springTransactionFourth.ServiceImpl;

import com.test.springTransactionFourth.dao.AccountDao;
import com.test.springTransactionFourth.service.AccountService;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Transactional(propagation = Propagation.REQUIRED)
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
