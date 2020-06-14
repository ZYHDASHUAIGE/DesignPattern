package com.zyh.chapter03_Factory;

/**
 * @author zyh
 * @date 2020/4/12 12:37
 */
public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = SimpleFactory.getInstance();
        Car car = (Car) simpleFactory.create(Car.class);
        System.out.println(car.getVehicleName());

    }
}
