package com.ggs.pattern.p20_iteator;

/**
 * @Author lianghaohui
 * @Date 2022/3/18 22:34
 * @Description 迭代器模式
 */
public class Client {

    public static void main(String[] args) {

        //创建聚合对象
        StudentAggregateImpl studentAggregate = new StudentAggregateImpl();
        studentAggregate.addStudent(new Student("白超", "310101199112183987"));
        studentAggregate.addStudent(new Student("郭洋", "500101197207048848"));
        studentAggregate.addStudent(new Student("邹磊", "360201199207211914"));
        studentAggregate.addStudent(new Student("许秀兰", "sf210201197507199783"));

        StudentIterator studentIterator = studentAggregate.getStudentIterator();
        while (studentIterator.hasNext()) {
            Student next = studentIterator.next();
            System.out.println(next);
        }
    }

}
