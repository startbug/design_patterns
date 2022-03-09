package com.ggs.pattern.bridge;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 22:48
 * @Description 抽象的操作系统类（抽象化角色）
 */
public abstract class OperatingSystem {

    //声明videoFile
    protected VideoFile videoFile;

    public OperatingSystem(VideoFile videoFile) {
        this.videoFile = videoFile;
    }

    public abstract void play(String fileName);
}
