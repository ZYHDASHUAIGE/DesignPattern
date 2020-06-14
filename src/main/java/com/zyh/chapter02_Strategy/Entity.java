package com.zyh.chapter02_Strategy;

/**
 * @author zyh
 * @date 2020/4/11 21:38
 *
 */
public class Entity implements Comparable<Entity> {

    private int weight;

    private double high;

    public Entity(){

    }

    public Entity(int weight, double high) {
        this.weight = weight;
        this.high = high;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "weight=" + weight +
                ", high=" + high +
                '}';
    }

    @Override
    public int compareTo(Entity entity) {
        return this.weight-entity.weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }
}
