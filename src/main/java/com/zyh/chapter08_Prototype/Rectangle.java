package com.zyh.chapter08_Prototype;

/**
 * @author zyh
 * @date 2020/6/14 11:47
 */
public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
