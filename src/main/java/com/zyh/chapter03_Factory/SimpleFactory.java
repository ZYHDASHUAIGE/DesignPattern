package com.zyh.chapter03_Factory;

import java.util.concurrent.TimeUnit;

/**
 * @author zyh
 * @date 2020/4/12 11:40
 */
public class SimpleFactory {

    private static volatile SimpleFactory SIMPLEFACTORY;

    private SimpleFactory(){

    }

    public static SimpleFactory getInstance(){
        if(SIMPLEFACTORY==null){
            synchronized (SimpleFactory.class){
                if (SIMPLEFACTORY==null){
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    SIMPLEFACTORY = new SimpleFactory();
                }
            }
        }
        return SIMPLEFACTORY;
    }

    public Car createCar(){
        //
        return new Car();
    }

    public Vehicle create(Class<? extends Vehicle> product){
        Vehicle vehicle = null;
        try {
            vehicle = (Vehicle) Class.forName(product.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return vehicle;
    }
}

class Car implements Vehicle{

    private String name = "car";
    @Override
    public String getVehicleName() {
        return this.name;
    }
}

class Train implements Vehicle{
    private String name;
    @Override
    public String getVehicleName() {
        return this.name;
    }
}

class Plane implements Vehicle{
    private String name;
    @Override
    public String getVehicleName() {
        return this.name;
    }
}