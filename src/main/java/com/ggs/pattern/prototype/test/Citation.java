package com.ggs.pattern.prototype.test;

/**
 * @Author lianghaohui
 * @Date 2022/3/6 0:30
 * @Description 三好学生
 */
public class Citation implements Cloneable {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void show() {
        System.out.println("本次三好学生为：" + student.getName());
    }

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
}
