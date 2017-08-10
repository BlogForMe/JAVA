package com.designpattern.factory.extentd;


import com.designpattern.factory.Standard.Animal;
import com.designpattern.factory.Standard.Cat;

/**
 * Created by jon on 17-8-10.
 */
public class CatFactory implements Provider {

    @Override
    public Animal produce() {
        return new Cat();
    }
}
