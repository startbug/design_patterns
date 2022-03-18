package com.ggs.pattern.p20_visitor;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:59
 * @Description 抽象访问者角色
 * 访问者角色的方法个数和抽象元素角色的子类数目相同
 */
public interface Person {

    void feed(Cat cat);

    void feed(Dog dog);

}
