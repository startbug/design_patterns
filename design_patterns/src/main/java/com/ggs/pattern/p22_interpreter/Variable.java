package com.ggs.pattern.p22_interpreter;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 15:59
 * @Description 封装变量的类
 */
public class Variable extends AbstractExpression {

    //声明存储变量名的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    public int interpret(Context context) {
        //返回变量的值
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
