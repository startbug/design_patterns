package com.ggs.pattern.p16_responsibility;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 21:20
 * @Description 部门经理类
 */
public class Manager extends Handler {

    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天，原因：" + leaveRequest.getContent());
        System.out.println("部门经理审批：同意");
    }

}
