package com.ggs.pattern.p22_interpreter;

/**
 * @Author lianghaohui
 * @Date 2022/3/19 16:02
 * @Description 加法表达式类
 */
public class Plus extends AbstractExpression {

    //+号左边的表达式
    private AbstractExpression left;
    //+号右边的表达式
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Context context) {
        //将左边表达式的结果和右边表达式的结果进行相加
        return left.interpret(context) + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
