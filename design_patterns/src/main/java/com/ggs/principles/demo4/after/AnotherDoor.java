package com.ggs.principles.demo4.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:45
 * @Description
 */
public class AnotherDoor implements FireProof,WaterProof{

    @Override
    public void fireProof() {
        System.out.println("防火");
    }

    @Override
    public void waterProof() {
        System.out.println("防火");
    }

}
