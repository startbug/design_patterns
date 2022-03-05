package com.ggs.pattern.prototype.demo2;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 0:30
 * @Description 三好学生
 */
public class Citation implements Cloneable {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println("本次三好学生为：" + name);
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
