package com.suftz.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 14:23
 */
@Repository(value="accountDao")
public class AccountDaoImpl implements AccountDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void addMoney(Integer uid,double money) {
        String sql="update account set money=money+? where uid=?";
        jdbcTemplate.update(sql,money,uid);
    }

    @Override
    public void reduceMoney(Integer uid,double money) {
        String sql="update account set money=money-? where uid=?";
        jdbcTemplate.update(sql,money,uid);
    }
}
