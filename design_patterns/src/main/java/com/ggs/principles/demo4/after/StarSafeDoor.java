package com.ggs.principles.demo4.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:42
 * @Description 星空牌安全门
 */
public class StarSafeDoor implements WaterProof, FireProof, AntiTheft {

    @Override
    public void antiTheft() {
        System.out.println("防盗");
    }

    @Override
    public void fireProof() {
        System.out.println("放火");
    }

    @Override
    public void waterProof() {
        System.out.println("防水");
    }

}
