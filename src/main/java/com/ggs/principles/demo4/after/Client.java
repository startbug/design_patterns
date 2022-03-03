package com.ggs.principles.demo4.after;

import com.ggs.principles.demo4.before.StarSafeDoor;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:43
 * @Description 将每项功能都拆分出一个接口，用什么就实现什么接口
 * 接口隔离原则
 */
public class Client {

    public static void main(String[] args) {
        StarSafeDoor door = new StarSafeDoor();
        door.antiTheft();
        door.fireProof();
        door.waterProof();

        System.out.println("===============================");
        AnotherDoor anotherDoor = new AnotherDoor();
        anotherDoor.fireProof();
        anotherDoor.waterProof();
    }

}
