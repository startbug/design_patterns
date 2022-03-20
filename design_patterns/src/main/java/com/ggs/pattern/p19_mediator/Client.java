package com.ggs.pattern.p19_mediator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:16
 * @Description 中介者模式
 */
public class Client {

    public static void main(String[] args) {
        //创建中介者对象
        MediatorStructure mediatorStructure = new MediatorStructure();

        //创建租房者对象
        Tenant tenant = new Tenant("里斯", mediatorStructure);

        //创建房主对象
        HouseOwner houseOwner = new HouseOwner("张三", mediatorStructure);

        //中介者要知道具体的房东和租房者
        mediatorStructure.setTenant(tenant);
        mediatorStructure.setHouseOwner(houseOwner);

        tenant.contact("我要租两室的房子！");
        houseOwner.contact("这里有！！！");
    }

}
