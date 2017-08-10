package com.designpattern.factory.Standard;

/**
 * Created by jon on 17-8-10.
 */
public class Cat implements Animal {
    @Override
    public void move() {
        System.out.println("I  am Cat");
    }

    public void eatFish() {
        System.out.println("I want fish ");
    }
}
