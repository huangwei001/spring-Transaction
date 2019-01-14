package com.test.springTransactionThird.dao;

public interface AccountDao {

    public void updateOutAccount(String out, double money);


    public void updateInAccount(String in, double money);
}
