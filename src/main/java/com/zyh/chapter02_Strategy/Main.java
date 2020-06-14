package com.zyh.chapter02_Strategy;

import java.util.Arrays;

/**
 * @author zyh
 * @date 2020/4/11 21:50
 */
public class Main {

    public static void main(String[] args) {
        Entity[] entities = {new Entity(2,2), new Entity(1,3),new Entity(3,4)};
        Sorter sorter = new Sorter();
        sorter.sortLambda(entities);
        System.out.println(Arrays.toString(entities));
    }
}
