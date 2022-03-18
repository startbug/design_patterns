package com.ggs.pattern.p20_visitor;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:59
 * @Description 抽象元素角色
 */
public interface Animal {

    void accept(Person person);

}
