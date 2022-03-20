package com.ggs.principles.demo5;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:51
 * @Description
 */
public class Agent {

    private Star star;

    private Fans fans;

    private Company company;

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void meeting() {
        System.out.println(fans.getName() + "与明星" + star.getName() + "见面了");
    }

    public void business() {
        System.out.println(company.getName() + "与明星" + star.getName() + "洽谈业务");
    }

}
