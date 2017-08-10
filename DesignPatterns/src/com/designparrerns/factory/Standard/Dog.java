package com.designparrerns.factory.Standard;

/**
 * Created by jon on 17-8-10.
 */
public class Dog implements Animal {
    @Override
    public void move() {
        System.out.println("I AM Dog");
    }

    public void eatBone() {
        System.out.println("I want bone");
    }
}
