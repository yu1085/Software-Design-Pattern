package com.example.designPattern.代理模式;

public class ProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.Request();
    }


    interface Subject {
        void Request();
    }

    static class RealSubject implements Subject {

        @Override
        public void Request() {
            System.out.println("访问真实主题方法");
        }
    }

    static class Proxy implements Subject {
        private RealSubject realSubject;

        @Override
        public void Request() {
            if (realSubject == null) {
                realSubject = new RealSubject();
            }
            preRequest();
            realSubject.Request();
            postRequest();
        }
    }


    static public void preRequest() {
        System.out.println("访问真实主题前的预处理");
    }

    public static void postRequest() {
        System.out.println("访问真实主题的后续处理");
    }
}
