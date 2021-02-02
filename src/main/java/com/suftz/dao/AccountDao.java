package com.suftz.dao;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 14:20
 */
public interface AccountDao {
    void addMoney(Integer uid,double money);
    void reduceMoney(Integer uid,double money);
}
