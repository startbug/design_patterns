package com.ggs.pattern.p9_bridge;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 22:49
 * @Description 扩展抽象化角色（Windows操作系统
 */
public class Windows extends OperatingSystem {

    public Windows(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
