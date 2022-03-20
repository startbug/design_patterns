package com.ggs.pattern.p18_observer;

/**
 * 抽象观察者类
 */
public interface Observer {

    //订阅的内容
    void update(String message);

}
