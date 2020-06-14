package com.zyh.chapter05_Decorator;

/**
 * @author zyh
 * @date 2020/6/7 21:21
 */
public class Demo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());

        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();


    }
}
