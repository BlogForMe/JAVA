package com.designpattern.factory.extentd;


import com.designpattern.factory.Standard.Animal;
import com.designpattern.factory.Standard.Dog;

/**
 * Created by jon on 17-8-10.
 */
public class DogFactory implements  Provider {
    @Override
    public Animal produce() {
        return new Dog();
    }
}
