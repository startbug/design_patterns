package com.ggs.pattern.p11_combination;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/10 12:45
 * @Description 菜单类(树枝节点)
 */
public class Menu extends MenuComponent {

    //菜单可以有子菜单或子菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        //打印菜单名称
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(name);
        //打印子菜单或子菜单项名称
        menuComponentList.forEach(MenuComponent::print);
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }
}
