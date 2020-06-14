package com.zyh.chapter07_Proxy;

/**
 * @author zyh
 * @date 2020/6/13 16:20
 */
public class LoginUser implements User {

    @Override
    public void use() {
        System.out.println("To login.");
    }
}
