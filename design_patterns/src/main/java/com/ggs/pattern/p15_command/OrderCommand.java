package com.ggs.pattern.p15_command;

import java.util.Map;
import java.util.Set;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:51
 * @Description 具体命令类
 */
public class OrderCommand implements Command {

    //持有接收者对象
    private SeniorChef receiver;

    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "卓的订单：");
        Map<String, Integer> foodDir = order.getFoodDir();
        //遍历map集合
        Set<String> keys = foodDir.keySet();
        for (String name : keys) {
            //将每一份餐品名称和对应的数量交给接收者处理
            receiver.makeFood(name, foodDir.get(name));
        }
        System.out.println(order.getDiningTable() + "卓的饭准备完毕！！");
    }
}
