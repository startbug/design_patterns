package com.ggs.principles.demo5;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:54
 * @Description 迪米特法则
 * 对象直接不进行直接的关联，通过中间对象进行关联
 * 降低类之间的耦合，提高模块的相对独立性
 */
public class Client {

    public static void main(String[] args) {
        //经纪人
        Agent agent = new Agent();
        //明星
        Star star = new Star("林青霞");
        agent.setStar(star);
        //创建粉丝
        Fans fans = new Fans("里斯");
        agent.setFans(fans);
        //创建媒体公司
        Company company = new Company("星星虫公司");
        agent.setCompany(company);
        agent.meeting();
        agent.business();
    }

}
