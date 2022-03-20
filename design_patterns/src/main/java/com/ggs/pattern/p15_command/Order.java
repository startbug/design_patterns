package com.ggs.pattern.p15_command;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:48
 * @Description 订单类
 */
public class Order {

    //餐桌号码
    private int diningTable;

    //所下的餐品及份数
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }
}
