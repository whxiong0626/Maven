package com.whx;

/**
 * 委托类Dog
 */
public class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("小狗啃骨头");
    }

    @Override
    public void sleep() {
        System.out.println("小狗睡觉");
    }
}
