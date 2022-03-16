package com.ggs.pattern.p1_singleton.demo6;

/**
 * 枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装在一次，
 * 设计者充分的利用枚举的特性来实现单例模式，枚举的写法非常简单，而且枚举类型是所有单例模式中
 * 唯一一种不会被破坏的单例实现模式
 * 属于饿汉式
 */
public enum Singleton {

    INSTANCE;

}
