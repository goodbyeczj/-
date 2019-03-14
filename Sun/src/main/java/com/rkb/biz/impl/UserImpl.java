package com.rkb.biz.impl;

import com.rkb.biz.UserBiz;
import com.rkb.dao.UserDao;
import com.rkb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description:
 * @Author: Aisake
 * @Date: 19-3-11 上午11:43
 */
@Service
public class UserImpl implements UserBiz {
    @Autowired
    UserDao userDao;
    @Autowired
    HttpServletRequest request;
    @Override
    public void addUser(User user) {
        userDao.save(user);
    }

    @Override
    public User editUser(Long id) {
        User user = userDao.getOne(id);
        return user;
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = userDao.getOne(id);
        userDao.delete(user);
    }

    @Override
    public List<User> showUserList() {
        List<User> list = userDao.findAll();
        return list;
    }

    @Override
    public User findUser(Long id) {
        User user = userDao.getOne(id);
        return user;
    }
}
