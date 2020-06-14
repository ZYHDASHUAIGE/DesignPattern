package com.zyh.chapter01_Singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author zyh
 * @date 2020/4/9 21:50
 *
 * 使用synchronized关键字可以解决懒汉加载的线程问题，但是会降低并发效率
 */
public class SingletonSync {

    private static SingletonSync INSTANCE = null;

    private SingletonSync(){

    }

    public static synchronized SingletonSync getInstance(){
        if(INSTANCE==null){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new SingletonSync();
        }
        return INSTANCE;
    }
}
