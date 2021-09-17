package com.example.designPattern.装饰者模式;

public class DecoratorPattern {
    public static void main(String[] args) {

        ConcreComponent concreComponent = new ConcreComponent();
        concreComponent.operation();
        System.out.println("---------------------");
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreComponent);
        concreteDecorator.operation();

    }

    interface Component {
        public void operation();
    }

    static class ConcreComponent implements Component {
        public ConcreComponent() {
            System.out.println("创建具体构件角色");
        }

        @Override
        public void operation() {
            System.out.println("调用具体构建角色的方法operation（）");
        }
    }


    static class Decorator implements Component {
        private Component component;

        public Decorator(Component component) {
            this.component = component;
        }

        @Override
        public void operation() {
            component.operation();
        }
    }

    static class ConcreteDecorator extends Decorator {

        public ConcreteDecorator(Component component) {
            super(component);
        }

        public void operation() {
            super.operation();
            addedFunction();
        }

        private void addedFunction() {
            System.out.println("为具体构件角色增加额外的功能 addedFunction()");
        }
    }
}
