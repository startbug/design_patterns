package com.ggs.pattern.bridge;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 22:49
 * @Description 扩展抽象化角色（Mac操作系统）
 */
public class Mac extends OperatingSystem {

    public Mac(VideoFile videoFile) {
        super(videoFile);
    }

    @Override
    public void play(String fileName) {
        videoFile.decode(fileName);
    }
}
