package com.ggs.pattern.p20_iteator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:31
 * @Description 抽象聚合角色类
 */
public interface StudentAggregate {

    //添加学生
    void addStudent(Student student);

    //删除学生
    void deleteStudent(Student student);

    //获取迭代器对象
    StudentIterator getStudentIterator();

}
