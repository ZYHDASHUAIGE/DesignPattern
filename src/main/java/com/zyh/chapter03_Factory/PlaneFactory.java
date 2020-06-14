package com.zyh.chapter03_Factory;

/**
 * @author zyh
 * @date 2020/4/12 13:25
 *
 * 抽象工厂：产品要抽象，工厂也要抽象，且工厂生产一组产品
 * 角色：抽象工厂->AbstractPlaneFactory; 具体工厂->PlaneFactory; 抽象产品->Vehicle, SubUnit; 具体产品->Plane, Wing;
 */
public class PlaneFactory implements AbstractPlaneFactory{


    @Override
    public Vehicle createPlane() {
        return new Plane();
    }

    @Override
    public SubUnit createWing() {
        return new Wing();
    }
}

class Wing implements SubUnit{
    private long height;


    public long getHeight() {
        return height;
    }

    public void setHeight(long height) {
        this.height = height;
    }

    @Override
    public void assemble() {
        System.out.println("this is wing");
    }
}