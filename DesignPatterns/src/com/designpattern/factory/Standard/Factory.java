package com.designpattern.factory.Standard;

/**
 * Created by jon on 17-8-10.
 */
public class Factory {
    //静态工厂方法
    public static Cat produceCat() {
        return new Cat();
    }

    public static Dog produceDog() {
        return new Dog();
    }

    public static void main(String[] args) {
        Animal cat = Factory.produceCat();
        cat.move();

        Dog dog = Factory.produceDog();
        dog.move();
        dog.eatBone();
    }
}
