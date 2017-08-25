package com.designpattern.builder;

/**
 * Created by jon on 17-8-10.
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPartOne();
        builder.buildPartTwo();
    }

    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();
        Product product = builder.getProduct();

    }
}
