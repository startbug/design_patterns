package com.ggs.pattern.p4_prototype.test1;

import java.io.Serializable;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 19:53
 * @Description
 */
public class Student implements Serializable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
