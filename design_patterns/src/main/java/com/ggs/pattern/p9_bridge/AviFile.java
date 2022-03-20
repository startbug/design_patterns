package com.ggs.pattern.p9_bridge;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 22:46
 * @Description avi视频文件（具体实现化角色）
 */
public class AviFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("avi视频文件：" + fileName);
    }
}
