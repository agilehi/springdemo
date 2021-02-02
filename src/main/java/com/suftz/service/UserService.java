package com.suftz.service;

import com.suftz.bean.User;

import java.util.List;

/**
 * Description:
 *
 * @author zhangchengy
 * @version 1.0
 * @date 2021/1/22 11:24
 */
public interface UserService {
    boolean addUser(User user);
    boolean deleteUserByUid(Integer uid);
    boolean updateUser(User user);
    User getUserByUid(Integer uid);
    List<User> getAllUsers();
    int[] batchUpdate(List<Object[]> list);
}
