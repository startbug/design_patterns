package com.ggs.pattern.p20_visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:02
 * @Description 对象结构类(容器类 ， 装元素对象)
 */
public class Home {

    private List<Animal> nodeList = new ArrayList<>();

    public void action(Person person) {
        //遍历集合，获取每一个元素，让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }

    public void add(Animal animal) {
        nodeList.add(animal);
    }

}
