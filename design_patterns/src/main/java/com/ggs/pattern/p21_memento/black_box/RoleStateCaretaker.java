package com.ggs.pattern.p21_memento.black_box;

import com.ggs.pattern.p21_memento.white_box.RoleStateMemento;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 15:01
 * @Description 备忘录对象管理者
 */
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
