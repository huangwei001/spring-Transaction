package com.test.springTransactionFourth.daoImpl;

import com.test.springTransactionFourth.dao.AccountDao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {


    public void updateOutAccount(String out, double money) {
        this.getJdbcTemplate().update("update account set money = money - ? where name = ?", money, out);
    }

    public void updateInAccount(String in, double money) {
        this.getJdbcTemplate().update("update account set money = money + ? where name = ?", money, in);
    }
}
