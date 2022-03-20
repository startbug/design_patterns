package com.ggs.principles.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 22:48
 * @Description 搜狗输入法
 */
public class SouGouInput {

    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        skin.display();
    }

}
