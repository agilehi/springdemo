package com.suftz.bean;

import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/23 14:17
 */
@Component
public class Account {
    private Integer uid;
    private String uname;
    private double money;

    public Account() {
    }

    public Account(String uname, double money) {
        this.uname = uname;
        this.money = money;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", money=" + money +
                '}';
    }
}
