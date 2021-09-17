package com.example.designPattern.建造者模式;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public ProductBuilder construct() {
        builder.builderPartA();
        builder.builderPartB();
        builder.builderPartC();

        return builder.getResult();
    }
}
