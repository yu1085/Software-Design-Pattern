package com.example.designPattern.建造者模式;

abstract class Builder {
    protected ProductBuilder productBuilder = new ProductBuilder();

    public abstract void builderPartA();

    public abstract void builderPartB();

    public abstract void builderPartC();

    public ProductBuilder getResult() {
        return productBuilder;
    }

}
