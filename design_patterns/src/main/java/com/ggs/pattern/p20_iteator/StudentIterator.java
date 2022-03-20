package com.ggs.pattern.p20_iteator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:27
 * @Description 抽象迭代器角色接口
 */
public interface StudentIterator {

    //判断是否还有元素
    boolean hasNext();

    //获取下一个元素
    Student next();

}
