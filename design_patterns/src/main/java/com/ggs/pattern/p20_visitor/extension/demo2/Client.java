package com.ggs.pattern.p20_visitor.extension.demo2;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 23:28
 * @Description 静态分派(Static Dispatch)
 * 发生在编译时期，分派根据静态类型信息发生。静态分派对于我们来说并不陌生，方法重载就是静态分派。
 * 重载方法的分派是根据静态类型进行的，这个分派过程在编译时期就完成了。
 */
public class Client {

    public static void main(String[] args) {
        Animal a = new Animal();
        Animal a1 = new Dog();
        Animal a2 = new Cat();

        Execute execute = new Execute();
        execute.execute(a);
        execute.execute(a1);
        execute.execute(a2);

    }

}
