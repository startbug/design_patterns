package com.ggs.pattern.p17_state.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 22:08
 * @Description 电梯停止状态类
 */
public class StoppingState extends LiftState {

    @Override
    public void open() {
        super.context.setLiftState(Context.OPENING_STATE);
        super.context.open();
    }

    //关门，但是不归stopping管理，去找closing
    @Override
    public void close() {
        super.context.setLiftState(Context.CLOSING_STATE);
        super.context.close();
    }

    //运行，但是不归stopping管理，去找running
    @Override
    public void run() {
        super.context.setLiftState(Context.RUNNING_STATE);
        super.context.run();
    }

    @Override
    public void stop() {
        System.out.println("电梯停止了....");
    }

}
