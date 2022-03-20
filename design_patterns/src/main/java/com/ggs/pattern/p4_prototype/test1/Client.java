package com.ggs.pattern.p4_prototype.test1;

import java.io.*;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 0:32
 * @Description 必须实现Cloneable接口
 * 通过对象流深克隆
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Student student = new Student();
        student.setName("里斯");
        Citation citation = new Citation();
        citation.setStudent(student);

        //将对象写到文件中
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("deepClone.txt"));
        oos.writeObject(citation);

        //从文件中读取对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("deepClone.txt"));
        Citation clone = (Citation) ois.readObject();
        //修改克隆对象中的对象的值
        clone.getStudent().setName("深克隆后的对象");
        clone.show();
        citation.show();
    }
}
