package com.suftz.bean;

import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 8:22
 */
@Component(value="user")
public class User {
    private Integer uid;
    private String uname;
    private Integer age;
    private String password;
    private String email;
    private String address;

    public User() {
    }

    public User(String uname, Integer age, String password, String email, String address) {
        this.uname = uname;
        this.age = age;
        this.password = password;
        this.email = email;
        this.address = address;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid='" + uid + '\'' +
                ", uname='" + uname + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
