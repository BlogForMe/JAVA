package com.designpattern.factory.extentd;


import com.designpattern.factory.Standard.Animal;

/**
 * Created by jon on 17-8-10.
 */
public class Test {
    public static void main(String[] args) {
        Provider provider = new CatFactory();
        Animal cat = provider.produce();
        cat.move();
    }
}

