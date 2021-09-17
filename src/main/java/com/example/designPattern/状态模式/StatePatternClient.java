package com.example.designPattern.状态模式;

public class StatePatternClient {
    public static void main(String[] args) {


        Context context = new Context();
        context.Handle();
        context.Handle();
        context.Handle();
        context.Handle();


    }
}

class Context {

    private State state;

    public Context() {
        this.state = new ConcreteStateA();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void Handle() {
        state.Handle(this);
    }

}

abstract class State {
    public abstract void Handle(Context context);
}

class ConcreteStateA extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是A");
        context.setState(new ConcreteStateB());
    }
}

class ConcreteStateB extends State {

    @Override
    public void Handle(Context context) {
        System.out.println("当前状态是 B");
        context.setState(new ConcreteStateA());
    }
}