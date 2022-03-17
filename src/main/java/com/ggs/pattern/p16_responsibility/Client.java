package com.ggs.pattern.p16_responsibility;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 21:21
 * @Description 责任链模式
 * 优点：
 * 1.降低了对象之间的耦合
 * 该模式降低了请求发送这和接收者的耦合度
 * 2.增强了系统的可扩展性
 * 可以根据需要增加新的请求处理类，满足开闭原则
 * 3.增强了给对象指派职责的灵活性
 * 当工作流程发生变化，可以动态的改变链内的成员或者修改其中的顺序，也可以动态的增删处理者
 * 4.责任链简化了对象之间的链接
 * 一个对象只需要保持一个只想其后继者的引用，不需保持其他所有处理者的引用，避免了使用众多的if或if else语句(结构类似链表)
 * 5.责任分组
 * 每个类只需要处理自己该处理的的工作，不能处理的传递给下一个对象完成，明确各个类的责任范围，符合类的单一职责原则
 * <p>
 * 缺点：
 * 1.不能保证每一个请求一定被处理。由于一个请求没有明确的接收者，所以不能保证它一定会被处理，请求可能一直到达链的末端都没有得到处理
 * 2.较长的责任链，请求可能涉及多个处理对象，系统性能收到一定的影响
 * 3.责任链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于责任链的错误设置而导致系统出错，如可能造成循环调用
 */
public class Client {

    public static void main(String[] args) {
        //创建一个请假条对象
        LeaveRequest leave1 = new LeaveRequest("小明", 1, "身体不舒服");

        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        //设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        //小明提交请假申请
        groupLeader.submit(leave1);

    }

}
