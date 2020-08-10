package com.yzh1024.service.impl;

import com.yzh1024.dao.impl.AccountDaoImpl;
import com.yzh1024.domain.Account;
import com.yzh1024.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("accountService")
public class AccountIServicempl implements IAccountService {

    @Autowired
    private AccountDaoImpl accountDao;

    /**
     * 根据id查询账户
     * @param accountId
     * @return
     */
    public Account findAccountById(Integer accountId) {
        return accountDao.findAccountById(accountId);
    }


    /**
     * 转账
     * @param sourceName 转出账户
     * @param targetName 转入账户
     * @param money 转账金额
     */
    public void transfer(String sourceName, String targetName, Float money) {
        System.out.println("转账中。。。");
        Account source = accountDao.findAccountByName(sourceName);
        Account target = accountDao.findAccountByName(targetName);
        source.setMoney(source.getMoney()-money);
        target.setMoney(target.getMoney()+money);
        accountDao.updateAccount(source);
//        int a = 1/0;
        accountDao.updateAccount(target);
    }
}
