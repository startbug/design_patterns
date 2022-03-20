package com.ggs.pattern.p20_visitor;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:00
 * @Description 具体元素角色
 */
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);  //访问者给宠物猫喂食
        System.out.println("五蚂蚁(好吃)...喵喵");
    }
}
