package com.example.designPattern.适配器模式;

public interface Target {
    public void Request();
}

class Adaptee {
    public void specificRequest() {
        System.out.println("是陪着中的业务代码被调用！");
    }
}

class ClassAdaptee extends Adaptee implements Target {

    @Override
    public void Request() {
        specificRequest();
    }
}

class ClassAdapteeTest {
    public static void main(String[] args) {
        System.out.println("适配器模式测试");
        Target target = new ClassAdaptee();
        target.Request();


    }
}
