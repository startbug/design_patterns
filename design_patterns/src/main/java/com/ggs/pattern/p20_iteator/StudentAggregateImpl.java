package com.ggs.pattern.p20_iteator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:32
 * @Description 具体聚合角色类
 */
public class StudentAggregateImpl implements StudentAggregate {

    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void deleteStudent(Student student) {
        list.remove(student);
    }

    //获取迭代器对象
    @Override
    public StudentIterator getStudentIterator() {
        return new StudentIteratorImpl(list);
    }
}
