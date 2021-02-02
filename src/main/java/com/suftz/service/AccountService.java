package com.suftz.service;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 14:28
 */
public interface AccountService {
    void transferAccount(Integer uid1,Integer uid2,double money);
}
