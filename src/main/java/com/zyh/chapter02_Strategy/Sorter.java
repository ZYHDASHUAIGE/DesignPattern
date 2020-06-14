package com.zyh.chapter02_Strategy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author zyh
 * @date 2020/4/11 21:41
 *
 * 策略模式的作用：就是把具体的算法实现从业务逻辑中剥离出来(算法封装，不同场景随意切换)，成为一系列独立算法类，使得它们可以相互替换。
 *
 * 策略模式的着重点：不是如何来实现算法，而是如何组织和调用这些算法，从而让我们的程序结构更加的灵活、可扩展。
 */
public class Sorter<T> {


    public void sort(int[] arr){
        Arrays.sort(arr);
    }

    public void sort(Entity[] entities){
        Arrays.sort(entities, new Comparator<Entity>() {
            @Override
            public int compare(Entity o1, Entity o2) {
                return o1.getWeight()-o2.getWeight();
            }
        });
    }

    public void sortLambda(Entity[] entities){
        Arrays.sort(entities,(o1,o2)-> o1.getWeight()-o2.getWeight());
    }

}
