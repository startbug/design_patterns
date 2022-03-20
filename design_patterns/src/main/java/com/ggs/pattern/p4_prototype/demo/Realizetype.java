package com.ggs.pattern.p4_prototype.demo;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 0:24
 * @Description
 */
public class Realizetype implements Cloneable {

    public Realizetype() {
        System.out.println("具体原型对象创建完成!@");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功!");
        return (Realizetype) super.clone();
    }

}

