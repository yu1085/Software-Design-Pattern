package com.example.designPattern.桥接模式;

public class BridgeTest {
    public static void main(String[] args) {
        ConcreteImplementorA concreteImplementorA = new ConcreteImplementorA();
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(concreteImplementorA);
        refinedAbstraction.Operation();
    }

    interface Implementor {
        public void OperationImple();
    }

    class ConcreteImplementor implements Implementor {

        @Override
        public void OperationImple() {
            System.out.println("具体实现化（Concrete Implementor）角色被访问");
        }
    }

    static class ConcreteImplementorA implements Implementor {
        @Override
        public void OperationImple() {
            System.out.println("具体实现化(Concrete Implementor)角色被访问");

        }
    }


    abstract static class Abstraction {
        protected Implementor implementor;

        public Abstraction(Implementor implementor) {
            this.implementor = implementor;
        }

        public abstract void Operation();
    }

    static class RefinedAbstraction extends Abstraction {

        protected RefinedAbstraction(Implementor implementor) {
            super(implementor);
        }

        @Override
        public void Operation() {
            System.out.println("扩展抽象化(Refined Abstraction)角色被访问");
            implementor.OperationImple();
        }
    }

}
