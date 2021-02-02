package com.suftz.service;

import com.suftz.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 14:30
 */
@Transactional(propagation= Propagation.REQUIRES_NEW,isolation = Isolation.REPEATABLE_READ,timeout = 2,
        readOnly = false,rollbackFor = Exception.class)
@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    AccountDao accountDao;

    @Override
    public void transferAccount(Integer uid1, Integer uid2, double money) {
        accountDao.reduceMoney(uid1,money);
        //int i=10/0;
        accountDao.addMoney(uid2,money);
    }
}
