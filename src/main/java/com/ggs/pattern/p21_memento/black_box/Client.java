package com.ggs.pattern.p21_memento.black_box;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 13:50
 * @Description 黑箱备忘录模式
 * 这里对备忘录角色的属性和方法进行了隐藏，对外只暴露Memento接口
 * 而真正的实现类被隐藏到了GameRole发起者角色对象中
 *
 * 备忘录模式的优缺点
 * 优点:
 *  1.提供了一种可以恢复状态的机制。当用户需要时能够比较方便地将数据恢复到某个历史的状态
 *  2.实现了内部状态的封装，除了创建它的发起人之外，其他对象都不能访问这些状态信息
 *  3.简化了发起人类，发起人不需要管理和保存其内部状态的各个备份，所有信息都保存在备忘录中，
 *  并由管理者进行管理，符合单一职责原则
 *
 *  缺点：
 *   资源消耗大，如果要保存的内部状态信息过多或者特别频繁，将会占用比较大的内存资源
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("--------------------------BOSS大战前-----------------------------");
        //创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();
        gameRole.stateDisplay();

        //创建游戏角色内部状态进行备份
        //创建管理者对象
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMemento(gameRole.saveState());

        System.out.println("--------------------------BOSS大战后-----------------------------");
        //损耗
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("----------------------------恢复后------------------------------");
        gameRole.recoverState(roleStateCaretaker.getMemento());
        gameRole.stateDisplay();

    }

}
