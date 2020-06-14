package com.zyh.chapter06_Adapter;

/**
 * @author zyh
 * @date 2020/6/13 15:35
 */
public class SdCard implements Card {
    @Override
    public void sort() {

    }

    @Override
    public void transfer() {
        System.out.println("card transfer");
    }
}
