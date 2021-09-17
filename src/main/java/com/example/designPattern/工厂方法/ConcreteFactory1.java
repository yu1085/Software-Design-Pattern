package com.example.designPattern.工厂方法;

public class ConcreteFactory1 implements com.example.designPattern.工厂方法.AbstractFactoryTest.AbstractFactory11 {
    @Override
    public com.example.designPattern.工厂方法.AbstractFactoryTest.Product111 newProduct() {
        System.out.println("工厂1 生产 产品A...");
        return new com.example.designPattern.工厂方法.AbstractFactoryTest.ConcreteProduct1();
    }
}
