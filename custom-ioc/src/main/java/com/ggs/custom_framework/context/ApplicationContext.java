package com.ggs.custom_framework.context;

import com.ggs.custom_framework.beans.factory.BeanFactory;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:47
 * @Description 定义非延时加载功能
 */
public interface ApplicationContext extends BeanFactory {

    void refresh() throws Exception;

}
