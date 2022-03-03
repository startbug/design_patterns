package com.ggs.principles.demo1;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 22:49
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        //1.创建搜狗输入法对象
        SouGouInput input = new SouGouInput();
        //2.创建皮肤对象
        AbstractSkin skin = new StarSkin();
        //3.设置皮肤到输入法
        input.setSkin(skin);
        input.display();
    }

}
