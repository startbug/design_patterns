package com.ggs.pattern.p20_iteator;

import java.util.List;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:28
 * @Description 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator {

    private List<Student> list;
    private int position = 0; //用来记录遍历时的位置

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        //从集合中获取指定位置的元素
        return list.get(position++);
    }

}
