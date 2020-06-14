package com.zyh.chapter05_Decorator;

/**
 * @author zyh
 * @date 2020/6/7 21:16
 */
public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();
        setRedBorder();
    }

    private void setRedBorder(){
        System.out.println("Border Color: Red");
    }
}
