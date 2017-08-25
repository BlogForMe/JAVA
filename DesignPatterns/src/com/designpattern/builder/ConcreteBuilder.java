package com.designpattern.builder;

/**
 * Created by jon on 17-8-10.
 * 具体建造工具
 */
public class ConcreteBuilder implements Builder {
    Part partOne, partTwo;

    @Override
    public void buildPartOne() {
    //具体构建
    }

    @Override
    public void buildPartTwo() {

    }

    @Override
    public Product getProduct() {
        return null;
    }
}
