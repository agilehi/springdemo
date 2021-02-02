package com.suftz.service;

import com.suftz.bean.User;
import com.suftz.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 11:26
 */

@Service(value="userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public boolean addUser(User user) {

        int insertRow=userDao.addUser(user);
        if(insertRow==1){
            System.out.println("插入一条数据成功："+user.toString());
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUserByUid(Integer uid) {
        int deleteRows=userDao.deleteUserByUid(uid);
        if(deleteRows==1){
            System.out.println("删除一条数据成功，uid="+uid);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        int updateRows=userDao.updateUser(user);
        if(updateRows==1){
            System.out.println("更新一条数据成功:"+user.toString());
            return true;
        }
        return false;
    }

    @Override
    public User getUserByUid(Integer uid) {
        return userDao.getUserByUid(uid);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.queryAll();
    }

    @Override
    public int[] batchUpdate(List<Object[]> list) {
        return userDao.batchUpdate(list);
    }


}
