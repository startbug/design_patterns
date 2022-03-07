package com.ggs.pattern.proxy.static_proxy;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 22:42
 * @Description
 */
public class TrainStation implements SellTickets{
    @Override
    public void sell() {
        System.out.println("火车站买票");
    }
}
