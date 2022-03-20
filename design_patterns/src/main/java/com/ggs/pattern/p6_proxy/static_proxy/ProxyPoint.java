package com.ggs.pattern.p6_proxy.static_proxy;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 22:43
 * @Description 代售点
 */
public class ProxyPoint implements SellTickets {

    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("收取一点代理费");
        trainStation.sell();
    }
}
