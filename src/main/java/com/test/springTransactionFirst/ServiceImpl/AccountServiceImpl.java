package com.test.springTransactionFirst.ServiceImpl;

import com.test.springTransactionFirst.dao.AccountDao;
import com.test.springTransactionFirst.service.AccountService;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class AccountServiceImpl implements AccountService {

    AccountDao accountDao;

    TransactionTemplate transactionTemplate;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    public void updateAccount(final String out, final String in, final double money) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.updateInAccount(in, money);
                accountDao.updateOutAccount(out, money);
            }
        });

    }




}
