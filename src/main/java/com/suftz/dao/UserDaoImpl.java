package com.suftz.dao;

import com.suftz.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 11:25
 */
@Repository(value="userDao")
public class UserDaoImpl implements UserDao{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addUser(User user) {
//        第一个参数是：sql语句
//        第二个参数是：可变参数，设置sql中的值
        String sql="insert into user(uname,password,email,address,age) values(?,?,?,?,?)";
        int insertRows=jdbcTemplate.update(sql,user.getUname(),user.getPassword(),user.getEmail(),user.getAddress(),user.getAge());
        return insertRows;
    }

    @Override
    public int deleteUserByUid(Integer uid) {
        String sql="delete from user where uid=?";
        int deleteRows=jdbcTemplate.update(sql,uid);
        return deleteRows;
    }

    @Override
    public int updateUser(User user) {
        String sql="update user set uname=?,email=?,address=?,age=? where uid=?";
        int updateRows=jdbcTemplate.update(sql,user.getUname(),user.getEmail(),user.getAddress(),user.getAge(),user.getUid());
        return updateRows;
    }

    @Override
    public User getUserByUid(Integer uid) {
        String sql="select uid,uname,email,address,age from user where uid=?";
        User user=null;
        try{
            //如果查询的是空值则会直接报错，这个体验很差
            user=jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class),uid);
        }catch(EmptyResultDataAccessException e){
        }
        return user;
    }

    @Override
    public List<User> queryAll() {
        String sql="select * from user";
        List<User> userList = new ArrayList<>();
        try {
            userList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        }catch(EmptyResultDataAccessException e){
        }
        return userList;
    }

    @Override
    public int[] batchUpdate(List<Object[]> list) {
        String sql="update user set age=?,address=? where uid=?";
        return jdbcTemplate.batchUpdate(sql,list);
    }
}
