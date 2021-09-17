package com.example.designPattern.抽象工厂模式;

public class AbstractFactoryTest2 {
    interface Product {
        void show();
    }

    class Product1 implements Product {

        @Override
        public void show() {
            System.out.println("产品A..");
        }
    }

    class Product2 implements Product {

        @Override
        public void show() {
            System.out.println("产品B..");

        }
    }

    interface AbstractFactory {
        public Product1 newProduct1();

        public Product2 newProduct2();
    }

    class ProductFactory implements AbstractFactory {

        @Override
        public Product1 newProduct1() {
            System.out.println("具体工厂 1 生成-->具体产品 11...");
            return new Product1();
        }

        @Override
        public Product2 newProduct2() {
            System.out.println("具体工厂 1 生成-->具体产品 11...");
            return new Product2();
        }
    }
}
