package com.zyh.chapter07_Proxy;

import java.lang.reflect.Proxy;

/**
 * @author zyh
 * @date 2020/6/13 16:33
 */
public class DynamicProxy {
    public static void main(String[] args) {
        MyInvocationHandler handler = new MyInvocationHandler(new LoginUser());

        User userProxy = (User) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),new Class[]{User.class}, handler);
        userProxy.use();
    }
}
