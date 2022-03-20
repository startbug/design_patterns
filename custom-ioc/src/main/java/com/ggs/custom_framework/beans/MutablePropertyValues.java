package com.ggs.custom_framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 21:10
 * @Description 用来存储和管理多个PropertyValue对象
 */
public class MutablePropertyValues implements Iterable<PropertyValue> {

    private final List<PropertyValue> propertyValueList;

    public MutablePropertyValues() {
        this.propertyValueList = new ArrayList<>();
    }

    public MutablePropertyValues(List<PropertyValue> propertyValueList) {
        if (propertyValueList == null) {
            this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }

    //获取所有的PropertyValue对象，返回以数组的形式
    public PropertyValue[] getPropertyValues() {
        //将集合转换为数组并返回
        return propertyValueList.toArray(new PropertyValue[0]);
    }

    //根据name属性值获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        //遍历集合对象
        for (PropertyValue propertyValue : propertyValueList) {
            if (propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        return null;
    }

    //添加PropertyValue对象
    public MutablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        //判断集合中存储的PropertyValue对象是否和传递的重复了，重复了则覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            PropertyValue pv = propertyValueList.get(i);
            if (pv.getName().equals(propertyValue.getName())) {
                propertyValueList.set(i, propertyValue);
                return this;
            }
        }
        this.propertyValueList.add(propertyValue);
        return this;
    }

    //判断是否有指定name属性值的对象
    public boolean contains(String propertyName) {
        PropertyValue propertyValue = getPropertyValue(propertyName);
        return propertyValue != null;
    }

    //判断结合是否为空
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    public Iterator<PropertyValue> iterator() {
        return propertyValueList.iterator();
    }

}
