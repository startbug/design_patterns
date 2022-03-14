package com.ggs.pattern.flyweight.demo;

/**
 * @Author lianghaohui
 * @Date 2022/3/14 22:44
 * @Description I图形类(具体享元角色)
 */
public class IBox extends AbstractBox {

    @Override
    public String getShape() {
        return "I";
    }

}
