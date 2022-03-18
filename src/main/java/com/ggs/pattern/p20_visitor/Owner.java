package com.ggs.pattern.p20_visitor;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:01
 * @Description 具体访问者角色
 */
public class Owner implements Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");
    }
}
