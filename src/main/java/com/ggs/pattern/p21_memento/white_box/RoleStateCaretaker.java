package com.ggs.pattern.p21_memento.white_box;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 14:34
 * @Description 备忘录对象管理者
 */
public class RoleStateCaretaker {

    //声明RoleStateMemento类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }

    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
