package com.zyh.chapter03_Factory;

/**
 * @author zyh
 * @date 2020/4/12 13:15
 *
 * Factory method: 与简单工厂不同的是，工厂方法模板中的工厂类需要实现一个抽象工厂
 * 每一个工厂方法工厂类只能生成单一产品对象
 */
public class CarFactory implements IFactory {


    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}
