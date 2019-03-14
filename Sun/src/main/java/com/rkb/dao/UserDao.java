package com.rkb.dao;

import com.rkb.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: Aisake
 * @Date: 19-3-11 上午10:23
 */
public interface UserDao extends JpaRepository<User,Long> {

}
