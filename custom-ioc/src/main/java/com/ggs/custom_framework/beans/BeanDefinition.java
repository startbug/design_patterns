package com.ggs.custom_framework.beans;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:23
 * @Description 用来封装Bean标签数据
 * id属性
 * class属性
 * property子标签的属性
 */
public class BeanDefinition {

    private String id;
    private String className;

    private MutablePropertyValues mutablePropertyValues;

    public BeanDefinition() {
        this.mutablePropertyValues = new MutablePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutablePropertyValues getMutablePropertyValues() {
        return mutablePropertyValues;
    }

    public void setMutablePropertyValues(MutablePropertyValues mutablePropertyValues) {
        this.mutablePropertyValues = mutablePropertyValues;
    }
}
