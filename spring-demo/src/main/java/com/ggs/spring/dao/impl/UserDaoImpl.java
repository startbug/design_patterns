package com.ggs.spring.dao.impl;

import com.ggs.spring.dao.UserDao;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 16:58
 * @Description 数据访问层实现类
 */
public class UserDaoImpl implements UserDao {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl构造方法执行了...");
    }

    @Override
    public void add() {
        System.out.println("UserDao...." + username + "==" + password);
    }
}
