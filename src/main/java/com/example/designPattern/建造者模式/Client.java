package com.example.designPattern.建造者模式;

public class Client {
    public static void main(String[] args) {
        ConcreteBuilder concreteBuilder = new ConcreteBuilder();
        Director director = new Director(concreteBuilder);
        ProductBuilder construct = director.construct();
        construct.show();
    }
}
