package com.example.designPattern.外观模式;

public class FacadePattern {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }

    static class Facade {
        SubSystem01 subSystem01 = new SubSystem01();
        SubSystem02 subSystem02 = new SubSystem02();
        SubSystem03 subSystem03 = new SubSystem03();

        public void method() {
            subSystem01.method1();
            subSystem02.method2();
            subSystem03.method3();
        }

    }

    static class SubSystem01 {
        public void method1() {
            System.out.println("子系统01的method1()的调用！");
        }
    }

    static class SubSystem02 {
        public void method2() {
            System.out.println("子系统02的method2()的调用！");
        }
    }

    static class SubSystem03 {
        public void method3() {
            System.out.println("子系统03的method3()的调用！");
        }
    }
}
