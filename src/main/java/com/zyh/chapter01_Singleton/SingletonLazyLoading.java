package com.zyh.chapter01_Singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author zyh
 * @date 2020/4/9 21:28
 *
 * 懒汉式加载
 * 按需初始化，但是会有线程安全问题
 */
public class SingletonLazyLoading {

    private static SingletonLazyLoading INSTANCE = null;

    private SingletonLazyLoading(){

    }

    public static SingletonLazyLoading getInstance(){
        if(INSTANCE==null){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new SingletonLazyLoading();
        }
        return INSTANCE;
    }
}
