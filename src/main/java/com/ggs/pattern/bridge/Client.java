package com.ggs.pattern.bridge;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 22:51
 * @Description 桥接模式
 * 有windows系统和Mac系统，每个系统分别又有Rmvb和Avi两种视频格式
 * 如果使用继承，每个系统就需要创建两个子类，分别继承windows和mac，
 * 再实现每个系统的视频格式播放，就需要实现4个子类，再多几个系统和格式
 * 就会造成类数量爆炸的问题
 */
public class Client {
    public static void main(String[] args) {
        //创建Mac系统对象
        OperatingSystem system = new Mac(new AviFile());
        //使用操作系统播放视频文件
        system.play("魔女之旅");
    }
}
