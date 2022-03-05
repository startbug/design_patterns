package com.ggs.pattern.prototype.demo2;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 0:32
 * @Description 必须实现Cloneable接口
 * 使用场景
 * 1.对象的创建非常复杂，可以使用原型模式快捷的创建对象
 * 2.性能和安全要求比较高
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        Citation clone1 = citation.clone();
        citation.setName("张三");
        clone1.setName("里斯");

        citation.show();
        clone1.show();
    }

}
