package com.ggs.pattern.p15_command;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:56
 * @Description 服务员类(属于请求者角色)
 */
public class Waiter {

    //持有多个命令
    private List<Command> commandList = new ArrayList<>();

    public void setCommands(Command commands) {
        commandList.add(commands);
    }

    //发起命令的方法
    public void orderUp() {
        System.out.println("服务员：订单来了！");
        for (Command command : commandList) {
            if (null != command) {
                command.execute();
            }
        }
    }

}
