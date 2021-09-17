package com.example.designPattern.模板模式;

public class TemplateMethodPattern {
    public static void main(String[] args) {
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.TemplateMethod();
    }
}

abstract class AbstractClass {
    public void TemplateMethod() {
        SpecificMethod();
        abstractMethod1();
        abstractMethod2();
    }

    protected abstract void abstractMethod2();

    protected abstract void abstractMethod1();

    protected void SpecificMethod() {
        System.out.println("抽象类中的具体方法被调用");
    }
}

class ConcreteClass extends AbstractClass {

    @Override
    protected void abstractMethod2() {
        System.out.println("抽象方法2的实现被调用");
    }

    @Override
    protected void abstractMethod1() {
        System.out.println("抽象方法1的实现被调用");
    }
}
