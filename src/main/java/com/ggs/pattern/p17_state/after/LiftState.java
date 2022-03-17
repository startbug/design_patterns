package com.ggs.pattern.p17_state.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 22:06
 * @Description 具体状态类
 */
public abstract class LiftState {

    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void open();

    public abstract void close();

    public abstract void run();

    public abstract void stop();
}
