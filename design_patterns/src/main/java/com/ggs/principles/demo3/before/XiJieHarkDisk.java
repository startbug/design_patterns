package com.ggs.principles.demo3.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:17
 * @Description 希捷硬盘
 */
public class XiJieHarkDisk {

    private String data = "数据";

    public void save(String data) {
        this.data = data;
        System.out.println("使用希捷硬盘存储数据为：" + data);
    }

    public String get() {
        System.out.println("使用希捷硬盘取数据");
        return data;
    }

}
