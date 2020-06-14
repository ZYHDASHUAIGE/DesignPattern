package com.zyh.chapter01_Singleton;

/**
 * @author zyh
 * @date 2020/4/11 17:30
 * <p>
 * 线程安全+防止反序列化
 */
public enum SingletonEnum {

    INSTANCE;

    public void method() {

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(SingletonEnum.INSTANCE.hashCode())).start();
        }
    }
}
