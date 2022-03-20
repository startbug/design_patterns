package com.ggs.pattern.p17_state.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 21:55
 * @Description 使用状态模式之前，使用了大量的switch case
 */
public class Client {

    public static void main(String[] args) {
        Lift lift = new Lift();
        //设置电梯状态
//        lift.setState(ILift.OPENING_STATE);
        lift.setState(ILift.RUNNING_STATE);

        //开门
        lift.open();
        System.out.println("============================================");
        lift.close();
        System.out.println("============================================");
        lift.run();
        System.out.println("============================================");
        lift.stop();
    }

}
