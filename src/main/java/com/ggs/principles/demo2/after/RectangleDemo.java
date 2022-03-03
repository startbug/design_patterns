package com.ggs.principles.demo2.after;

/**
 * @Author lianghaohui
 * @Date 2022/3/3 23:07
 * @Description
 */
public class RectangleDemo {

    public static void main(String[] args) {
        //1.创建长方形对象
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);

        resize(rectangle);
        printLengthAndWidth(rectangle);
    }

    //正方形和长方形不是父子关系，无法传入到该方法中，解决了传入正方形，程序无法结束的问题
    //符合里氏替换原则
    public static void resize(Rectangle rectangle) {
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }

    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println(quadrilateral.getLength());
        System.out.println(quadrilateral.getWidth());
    }

}
