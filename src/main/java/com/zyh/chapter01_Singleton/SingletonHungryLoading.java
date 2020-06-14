package com.zyh.chapter01_Singleton;

/**
 * @author zyh
 * @date 2020/4/8 21:53
 *
 * 饿汉式加载
 * 类加载到内存后就实例化一个对象，JVM保障了线程安全
 * 简单实用
 */
public class SingletonHungryLoading {

    private static final SingletonHungryLoading INSTANCE = new SingletonHungryLoading();

    private SingletonHungryLoading(){

    }

    public static SingletonHungryLoading getInstance(){
        return INSTANCE;
    }

    public void print(String string){
        System.out.println(string);
    }

    public static void main(String[] args) {
        SingletonHungryLoading singleton = SingletonHungryLoading.getInstance();
        singleton.print("ss");
    }
}
