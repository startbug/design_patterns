package com.ggs.pattern.p19_mediator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:13
 * @Description 具体的中介者角色类
 */
public class MediatorStructure extends Mediator {

    //聚合房东和租房者
    private HouseOwner houseOwner;
    private Tenant tenant;

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    @Override
    public void contact(String message, Person person) {
        if (person == houseOwner) {
            //如果发消息的人是房东，那么就提供消息给租房者
            tenant.getMessage(message);
        } else {
            //如果发消息的人是租房者，那么就提供消息给房东
            houseOwner.getMessage(message);
        }
    }
}
