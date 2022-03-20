package com.ggs.pattern.p17_state.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 22:08
 * @Description 电梯运行状态类
 */
public class RunningState extends LiftState {

    //运行时不能打开
    @Override
    public void open() {
        //do nothing
    }

    //运行时已经是关闭了的
    @Override
    public void close() {
        //do nothing
    }

    //运行
    @Override
    public void run() {
        System.out.println("电梯正在运行....");
    }

    //运行时可以选择停止
    @Override
    public void stop() {
        super.context.setLiftState(Context.STOPPING_STATE);
        super.context.stop();
    }

}
