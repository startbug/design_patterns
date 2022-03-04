package com.ggs.pattern.singleton.demo7;

import java.io.*;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 23:34
 * @Description 随便哪一个除了枚举外的单例实现
 * 通过序列化破坏单例模式
 */
public class Client {

    public static void main(String[] args) throws Exception {
//        writeObjectToFile();
        Singleton singleton1 = readObjectFromFile();
        Singleton singleton2 = readObjectFromFile();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }

    public static Singleton readObjectFromFile() throws Exception {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("a.txt"));
        Singleton instance = (Singleton) ois.readObject();
        ois.close();
        return instance;
    }

    public static void writeObjectToFile() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("a.txt"));
        Singleton instance = Singleton.getInstance();
        oos.writeObject(instance);
        oos.close();
    }

}
