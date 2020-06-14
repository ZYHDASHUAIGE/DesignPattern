package com.zyh.chapter03_Factory;

/**
 * @author zyh
 * @date 2020/4/12 13:24
 */
public interface AbstractPlaneFactory {

    Vehicle createPlane();

    SubUnit createWing();
}
