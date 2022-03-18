package com.ggs.pattern.p18_observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 21:44
 * @Description 具体主题角色类
 */
public class SubscriptionSubject implements Subject {

    //定义集合，用来存储多个观察者对象
    private List<Observer> observerList = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    //向订阅者发送订阅内容
    @Override
    public void notify(String message) {
        for (Observer observer : observerList) {
            observer.update(message);
        }
    }
}
