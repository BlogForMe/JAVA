package com.designpattern.builder;

/**
 * Created by jon on 17-8-10.
 */
public interface Builder {
    void buildPartOne();

    void buildPartTwo();

    Product getProduct();
}
