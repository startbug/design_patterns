package com.ggs.pattern.p21_memento.white_box;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 13:50
 * @Description 白箱备忘录模式
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
        roleStateCaretaker.setRoleStateMemento(gameRole.saveState());

        System.out.println("--------------------------BOSS大战后-----------------------------");
        //损耗
        gameRole.fight();
        gameRole.stateDisplay();

        System.out.println("----------------------------恢复后------------------------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMemento());
        gameRole.stateDisplay();

    }

}
