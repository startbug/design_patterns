package com.ggs.pattern.facade;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 23:05
 * @Description 外观模式或者门面模式
 * 好处:
 * 1.降低了子系统与客户端之间的耦合度, 使得子系统的变化不会影响调用它的客户端类
 * 2.对客户屏蔽了子系统组件,减少客户处理的对象数目,使得子系统更容易操作
 * 缺点:
 * 不符合开闭原则,修改麻烦
 */
public class Client {

    public static void main(String[] args) {
        //创建智能音响对象
        SmartAppliancesFacade facade = new SmartAppliancesFacade();
        //控制家电
        facade.say("打开家电");
        System.out.println("==================");
        facade.say("关闭家电");

    }

}
