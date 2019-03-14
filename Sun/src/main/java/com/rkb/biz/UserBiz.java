package com.rkb.biz;

import com.rkb.dao.UserDao;
import com.rkb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: Aisake
 * @Date: 19-3-11 上午11:43
 */

public interface UserBiz {
    void addUser(User user);
    User editUser(Long id);
    void updateUser(User user);
    void deleteUser(Long id);
    List<User> showUserList();
    User findUser(Long id);
}
