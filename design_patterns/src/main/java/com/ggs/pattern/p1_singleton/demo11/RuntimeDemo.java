package com.ggs.pattern.p1_singleton.demo11;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author lianghaohui
 * @Date 2022/3/5 0:31
 * @Description
 */
public class RuntimeDemo {

    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime runtime = Runtime.getRuntime();
        //调用runtime的exec方法，参数是一个命令
        Process process = runtime.exec("ipconfig");

        //获取输入流
        InputStream is = process.getInputStream();

        //获取信息，并打印
        byte[] bytes = new byte[1024];
        int len;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        while ((len = is.read(bytes)) != -1) {
            baos.write(bytes, 0, len);
        }
        System.out.println(baos.toString("GBK"));
    }

}
