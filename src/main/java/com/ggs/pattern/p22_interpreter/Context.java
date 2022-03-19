package com.ggs.pattern.p22_interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 15:58
 * @Description 环境角色类
 */
public class Context {

    //定义一个map集合，存储变量名及值
    private Map<Variable, Integer> map = new HashMap<>();

    //添加变量的功能
    public void assign(Variable var, Integer value) {
        map.put(var, value);
    }

    //根据变量获取对应的值
    public int getValue(Variable var) {
        return map.get(var);
    }

}
