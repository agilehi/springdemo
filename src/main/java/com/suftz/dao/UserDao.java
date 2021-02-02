package com.suftz.dao;

import com.suftz.bean.User;

import java.util.List;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 11:24
 */
public interface UserDao {

   int addUser(User user);
   int deleteUserByUid(Integer uid);
   int updateUser(User user);
   User getUserByUid(Integer uid);
   List<User> queryAll();
   int[] batchUpdate(List<Object[]> list);
}
