package com.ggs.spring.service.impl;

import com.ggs.spring.dao.UserDao;
import com.ggs.spring.service.UserService;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 16:59
 * @Description 业务逻辑层实现类
 */
public class UserServiceImpl implements UserService {

    //声明一个UserDao类型的变量
    private UserDao UserDao;

    public UserServiceImpl() {
        System.out.println("UserServiceImpl构造方法执行了...");
    }

    public void setUserDao(UserDao UserDao) {
        this.UserDao = UserDao;
    }

    @Override
    public void add() {
        System.out.println("UserService...");
        UserDao.add();
    }
}
