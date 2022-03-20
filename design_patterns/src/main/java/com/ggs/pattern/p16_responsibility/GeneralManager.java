package com.ggs.pattern.p16_responsibility;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 21:21
 * @Description 总经理类
 */
public class GeneralManager extends Handler {


    public GeneralManager() {
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，原因：" + leaveRequest.getContent());
        System.out.println("总经理审批：同意");
    }

}
