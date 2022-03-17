package com.ggs.pattern.p17_state.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 21:47
 * @Description 电梯类(ILift的实现类)
 */
public class Lift implements ILift {

    //声明一个记录当前电梯的状态
    private int state;

    @Override
    public void setState(int state) {
        this.state = state;
    }

    @Override
    public void open() {
        switch (state) {
            case OPENING_STATE:
                //电梯已经打开，不需要再打开，所以什么都不做
                break;
            case CLOSING_STATE:
                //电梯关闭中，可以执行开门操作
                setState(OPENING_STATE);
                System.out.println("电梯开门了....");
                break;
            case RUNNING_STATE:
                //电梯运行中，不能开门，所以什么都不做
                break;
            case STOPPING_STATE:
                //电梯停止中，可以执行开门操作
                setState(OPENING_STATE);
                System.out.println("电梯开门了....");
                break;
        }
    }

    @Override
    public void close() {
        switch (state) {
            case OPENING_STATE:
                //电梯已经打开，不需要再打开，所以什么都不做
                System.out.println("电梯关门了....");
                this.setState(CLOSING_STATE);
                break;
            case CLOSING_STATE:
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    @Override
    public void run() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯开始运行....");
                this.setState(RUNNING_STATE);
                break;
            case RUNNING_STATE:
                break;
            case STOPPING_STATE:
                break;
        }
    }

    @Override
    public void stop() {
        switch (state) {
            case OPENING_STATE:
                break;
            case CLOSING_STATE:
                System.out.println("电梯停止....");
                this.setState(STOPPING_STATE);
                break;
            case RUNNING_STATE:
                System.out.println("电梯停止....");
                this.setState(STOPPING_STATE);
                break;
            case STOPPING_STATE:
                break;
        }
    }
}
