package com.ggs.pattern.p15_command;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:59
 * @Description 命令模式
 * 优点
 * 1.降低系统的耦合度。命令模式能将调用操作的对象与实现该操作的对象解耦
 * 2.增加或删除命令非常方便，采用命令模式增加与删除命令不会影响其他类，满足“开闭原则”，扩展灵活
 * 3.可以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令
 * 4.方便实现Undo和Redo操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复。
 *
 * 缺点：
 * 1.使用命令模式可能会导致某些系统有过多的具体命令类
 * 2.系统结构更复杂
 */
public class Client {

    public static void main(String[] args) {
        //创建一个订单对象
        Order order1 = new Order();
        order1.setDiningTable(1);
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("小贝可乐", 2);

        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("炸薯条", 1);
        order2.setFood("橙汁", 2);

        //创建接收者对象
        SeniorChef seniorChef = new SeniorChef();
        Command command1 = new OrderCommand(seniorChef, order1);
        Command command2 = new OrderCommand(seniorChef, order2);

        //创建请求者对象
        Waiter waiter = new Waiter();
        waiter.setCommands(command1);
        waiter.setCommands(command2);

        //执行命令
        waiter.orderUp();

    }

}
