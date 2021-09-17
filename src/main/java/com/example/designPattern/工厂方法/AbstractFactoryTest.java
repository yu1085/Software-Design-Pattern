package com.example.designPattern.工厂方法;

public class AbstractFactoryTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Product111 A;
        AbstractFactory11 factory1;
        factory1 = (AbstractFactory11) ReadXML1.getObject();
        A = factory1.newProduct();
        A.show();
    }


    interface Product111 {
        public void show();
    }

    static class ConcreteProduct1 implements Product111 {
        @Override
        public void show() {
            System.out.println("产品A 生产出来了。。。");
        }
    }


    class ConcreteProduct2 implements Product111 {
        @Override
        public void show() {
            System.out.println("产品B 生产出来了。。。");
        }
    }

    interface AbstractFactory11 {
        public Product111 newProduct();
    }


    public class ConcreteFactory2 implements AbstractFactory11 {
        @Override
        public Product111 newProduct() {
            System.out.println("工厂2 生产 产品B...");
            return new ConcreteProduct2();
        }
    }
}
