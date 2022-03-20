package com.ggs.pattern.p22_interpreter;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 15:59
 * @Description 抽象表达式类
 */
public abstract class AbstractExpression {

    public abstract int interpret(Context context);

}
