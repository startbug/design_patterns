package com.ggs.pattern.p4_prototype.test;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 0:32
 * @Description 必须实现Cloneable接口
 * 克隆对象中有其他对象，进行浅克隆后，修改对象内的值，被克隆对象中的对象也会被改变
 * 因为其引用的是同一个对象
 */
public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setName("里斯");

        Citation citation = new Citation();
        citation.setStudent(student);

        Citation clone1 = citation.clone();
        clone1.getStudent().setName("张三");

        citation.show();
        clone1.show();
    }

}
