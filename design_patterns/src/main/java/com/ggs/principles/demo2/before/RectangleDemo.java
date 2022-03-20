package com.ggs.principles.demo2.before;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 22:56
 * @Description
 */
public class RectangleDemo {

    //这个方法适合长方形，不适合正方形
    //正方形会一直扩宽，不会停止
    //所以这种只适合父类，不适合子类的结果，违反了里氏替换原则
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        resize(rectangle);
        printLength(rectangle);

        System.out.println("================================");
        //创建正方形对象
        Square square = new Square();
        square.setLength(10);
        resize(square);
        printLength(square);
    }

    //拓宽方法
    public static void resize(Rectangle rectangle) {
        //判断宽如果比长小，则进行扩宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLength(Rectangle rectangle) {
        System.out.println("length:" + rectangle.getLength());
        System.out.println("width:" + rectangle.getWidth());
    }

}
