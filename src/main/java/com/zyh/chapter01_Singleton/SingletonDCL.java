package com.zyh.chapter01_Singleton;

import java.util.concurrent.TimeUnit;

/**
 * @author zyh
 * @date 2020/4/9 21:59
 */
public class SingletonDCL {

    private static volatile SingletonDCL INSTANCE = null; //防止指令重排

    private SingletonDCL(){

    }

    public SingletonDCL getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonDCL.class){
                if(INSTANCE==null){
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE =new SingletonDCL();
                }
            }
        }
        return INSTANCE;
    }
}
