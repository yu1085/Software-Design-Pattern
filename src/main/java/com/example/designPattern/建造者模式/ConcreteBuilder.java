package com.example.designPattern.建造者模式;

public class ConcreteBuilder extends Builder {
    @Override
    public void builderPartA() {
        productBuilder.setPartA("建造 PartA");
    }

    @Override
    public void builderPartB() {
        productBuilder.setPartA("建造 PartB");
    }

    @Override
    public void builderPartC() {
        productBuilder.setPartA("建造 PartC");
    }
}
