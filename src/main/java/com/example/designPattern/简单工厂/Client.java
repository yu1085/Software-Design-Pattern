package com.example.designPattern.简单工厂;

public class Client {

    interface Product {
        void show();
    }

    static class ProductA implements Product {
        @Override
        public void show() {
            System.out.println("产品A....");
        }
    }

    static class ProductB implements Product {
        @Override
        public void show() {
            System.out.println("产品B....");
        }
    }

    static class ProductC implements Product {
        @Override
        public void show() {
            System.out.println("产品C....");
        }
    }


    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static Product makeProduct(int kind) {
            switch (kind) {
                case Const.PRODUCT_A:
                    return new ProductA();
                case Const.PRODUCT_B:
                    return new ProductB();
                case Const.PRODUCT_C:
                    return new ProductC();
            }
            return null;
        }
    }
}
