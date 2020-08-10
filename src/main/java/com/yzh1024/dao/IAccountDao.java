package com.yzh1024.dao;

import com.yzh1024.domain.Account;

public interface IAccountDao {
    Account findAccountById(Integer accountId);
    Account findAccountByName(String accountName);
    void updateAccount(Account account);
}
