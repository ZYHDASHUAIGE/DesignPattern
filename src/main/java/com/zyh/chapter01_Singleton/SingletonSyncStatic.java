package com.zyh.chapter01_Singleton;

/**
 * @author zyh
 * @date 2020/4/11 17:13
 *
 * lazy loading(静态内部类的静态成员被调用时才会进行加载) + 线程安全(JVM保证多线程环境下只有一个线程可以正确的加载类，其他会阻塞)
 */
public class SingletonSyncStatic {

    private SingletonSyncStatic() {

    }

    private static class SingletonSyncStaticHolder {
        private static final SingletonSyncStatic INSTANCE = new SingletonSyncStatic();
    }

    public static SingletonSyncStatic getInstance() {
        return SingletonSyncStaticHolder.INSTANCE;
    }

    public void print(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(SingletonSyncStatic.getInstance().hashCode())
            ).start();
        }
    }
}
