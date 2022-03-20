package com.ggs.spring.controller;

import com.ggs.custom_framework.context.ApplicationContext;
import com.ggs.custom_framework.context.support.ClassPathXmlApplicationContext;
import com.ggs.spring.service.UserService;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 17:01
 * @Description com.ggs.spring.controller包下的代码用于回顾Spring的用法
 */
public class UserController {

    public static void main(String[] args) throws Exception {
        //创建Spring容器对象
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从容器对象中获取userService
        UserService userService = (UserService) context.getBean("userService");
        userService.add();
        System.out.println(userService);
    }

//    public static void main(String[] args) {
//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
//        UserService userService = (UserService) beanFactory.getBean("userService");
//        userService.add();
//        System.out.println(userService);
//    }

}
