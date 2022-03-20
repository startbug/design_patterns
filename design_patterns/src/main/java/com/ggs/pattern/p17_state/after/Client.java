package com.ggs.pattern.p17_state.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/17 22:01
 * @Description 状态模式
 * 定义：
 * 对有状态的对象，把复杂的“判断逻辑”提取到不同状态的对象中，允许状态对象在其内部状态发生改变时改变其行为
 * 优点：
 * 1.将所有与某个状态有关的行为放到一个类中，并且可以方便地增加新的状态，只需要改变状态即可改变对象的行为
 * 2.允许状态转换逻辑与状态对象合为一体，而不是某个超大的条件语句块
 * 缺点：
 * 1.状态模式的使用必然会增加系统类和对象的个数
 * 2.状态模式的结构与实现都比较复杂，如果使用不当会导致程序结构和代码的混乱
 * 3.状态模式对”开闭原则“的支持并不友好
 * <p>
 * 使用场景
 * 1.当一个对象的行为取决于它的状态，并且它必须在运行时根据状态改变它的行为时，可以考虑使用状态模式
 * 2.一个操作含有庞大的分支结构，并且这些分支决定于对象的状态时
 */
public class Client {

    public static void main(String[] args) {
        //创建环境角色对象
        Context context = new Context();
        //设置当前电梯状态
        context.setLiftState(Context.CLOSING_STATE);
        context.close();
        context.run();
        context.open();
        context.stop();
    }

}
