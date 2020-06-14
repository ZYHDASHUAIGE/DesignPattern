package com.zyh.chapter07_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zyh
 * @date 2020/6/13 16:23
 */
public class MyInvocationHandler implements InvocationHandler {
    User loginUser;

    public User getLoginUser() {
        return loginUser;
    }

    public MyInvocationHandler(User loginUser){
        this.loginUser = loginUser;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(loginUser,args);
        return null;
    }
}
