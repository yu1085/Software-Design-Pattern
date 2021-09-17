package com.example.designPattern.责任链模式;

public class ChainOfResponsibilityPattern {
    public static void main(String[] args) {

        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        handler1.setHandler(handler2);
        handler1.handleRequest("two");
    }
}

abstract class Handler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(String request);

}

class ConcreteHandler1 extends Handler {

    @Override
    public void handleRequest(String request) {

        if (request.equals("one")) {
            System.out.println("具体处理者1负责该请求");
        } else {
            if (getHandler() != null) {
                getHandler().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求");
            }
        }
    }
}

class ConcreteHandler2 extends Handler {

    @Override
    public void handleRequest(String request) {

        if (request.equals("two")) {
            System.out.println("具体处理者2负责该请求");
        } else {
            if (getHandler() != null) {
                getHandler().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求");
            }
        }
    }
}