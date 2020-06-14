package com.zyh.chapter08_Prototype;

/**
 * @author zyh
 * @date 2020/6/14 11:49
 */
public class Circle extends Shape {
    public Circle(){
        type = "Circle";
    }

    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
