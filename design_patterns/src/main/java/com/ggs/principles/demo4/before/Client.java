package com.ggs.principles.demo4.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:43
 * @Description
 */
public class Client {

    public static void main(String[] args) {
        StarSafeDoor door = new StarSafeDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();
    }

}
