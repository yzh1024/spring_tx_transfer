package com.yzh1024.service;

import com.yzh1024.domain.Account;

public interface IAccountService {
    /**
     * 根据id查询账户
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);


    /**
     * 转账
     * @param sourceName 转出账户
     * @param targetName 转入账户
     * @param money 转账金额
     */
    void transfer(String sourceName, String targetName, Float money);
}
