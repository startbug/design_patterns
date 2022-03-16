package com.ggs.pattern.p1_singleton.demo9;

import java.io.*;

/**
 * @Author lianghaohui
 * @Date 2022/3/4 23:34
 * @Description 添加readResolve方法，防止反序列化创建新对象
 * <p>
 * 源码了解: ObjectInputStream#readObject0方法，有一个switch判断
 * 查看当条件为TC_OBJECT时的代码，会执行一个readOrdinaryObject方法
 * 该方法中有一判断
 * if (obj != null &&
 * handles.lookupException(passHandle) == null &&
 * desc.hasReadResolveMethod())
 * 重点看hasReadResolveMethod，表示查看类是否有readResolve()方法，
 * 有就调用，作为反序列化的结果
 */
public class Client {


    public static void main(String[] args) throws Exception {
//        writeObjectToFile();
        Singleton singleton1 = readObjectFromFile();
        Singleton singleton2 = readObjectFromFile();
        System.out.println(singleton1);
        System.out.println(singleton2);
        System.out.println(singleton1 == singleton2);
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
