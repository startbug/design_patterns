package com.ggs.pattern.p20_visitor.extension.demo3;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:27
 * @Description
 */
public class Cat extends Animal {
    public void accept(Execute exe) {
        exe.execute(this);
    }
}
