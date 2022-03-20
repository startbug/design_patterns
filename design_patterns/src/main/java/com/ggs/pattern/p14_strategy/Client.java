package com.ggs.pattern.p14_strategy;

/**
 * @Author lianghaohui
 * @Date 2022/3/16 22:21
 * @Description  策略模式
 *  优点：
 *      1.策略类之间可以自由切换
 *          由于策略类都是实现同一个接口，所以可以自由切换
 *      2.易于扩展
 *          增加一个新的策略只需要添加一个具体的策略类即可，基本不需要改变原有的代码
 *      3.避免使用多重条件选择语句 (if else)，充分体现了面向对象的设计思想
 *  缺点：
 *      1.客户端必须知道所有的策略类，并自行决定使用哪一个策略类
 *      2.策略模式将造成产生很多策略类，可以通过使用享元模式在一定程度上减少对象的数量
 */
public class Client {

    public static void main(String[] args) {
        //春节促销活动
        SalesMan salesMan = new SalesMan(new StrategyA());
        //展示促销活动
        salesMan.salesManShow();

        System.out.println("============中秋活动=============");
        salesMan.setStrategy(new StrategyB());
        salesMan.salesManShow();

        System.out.println("============国庆节活动=============");
        salesMan.setStrategy(new StrategyC());
        salesMan.salesManShow();

    }

}
