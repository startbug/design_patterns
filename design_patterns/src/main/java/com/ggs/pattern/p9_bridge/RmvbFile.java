package com.ggs.pattern.p9_bridge;

/**
 * @Author lianghaohui
 * @Date 2022/3/9 22:47
 * @Description rmvb视频文件（具体的实现化角色）
 */
public class RmvbFile implements VideoFile {
    @Override
    public void decode(String fileName) {
        System.out.println("rmvb视频文件：" + fileName);
    }
}
