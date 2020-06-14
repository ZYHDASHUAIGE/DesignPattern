package com.zyh.chapter05_Decorator;

/**
 * @author zyh
 * @date 2020/6/7 21:07
 * Abstract decoration class
 */
public class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
