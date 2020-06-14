package com.zyh.chapter08_Prototype;

/**
 * @author zyh
 * @date 2020/6/14 11:51
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
