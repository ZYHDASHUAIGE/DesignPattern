package com.zyh.chapter07_Proxy.Cglib;

/**
 * @author zyh
 * @date 2020/6/14 10:58
 */
public class CglibProxyClient {

    public static void main(String[] args) {
        // 生成 Cglib 代理类
        Engineer engineerProxy = (Engineer) CglibProxy.getProxy(new Engineer());
        // 调用相关方法
        engineerProxy.eat();
    }
}
