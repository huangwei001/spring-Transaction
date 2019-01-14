package com.test.springTransactionFourth.dao;

public interface AccountDao {

    public void updateOutAccount(String out, double money);


    public void updateInAccount(String in, double money);
}
