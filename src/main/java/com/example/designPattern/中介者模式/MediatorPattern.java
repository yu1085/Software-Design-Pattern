package com.example.designPattern.中介者模式;

import java.util.ArrayList;

public class MediatorPattern {
    public static void main(String[] args) {
        ConcreteMediator concreteMediator = new ConcreteMediator();
        Colleague c1, c2;
        c1 = new ConcreteColleague1();
        c2 = new ConcreteColleague2();

        concreteMediator.reister(c1);
        concreteMediator.reister(c2);

        c1.send();
        System.out.println("--------");

        c2.send();


    }
}

abstract class Mediator {

    public abstract void reister(Colleague colleague);

    public abstract void relay(Colleague c1);
}

class ConcreteMediator extends Mediator {

    private ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    public void reister(Colleague colleague) {
        if (!colleagues.contains(colleague)) {
            colleagues.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void relay(Colleague c1) {
        for (Colleague ob : colleagues) {
            if (ob != c1) {
                ob.receive();
            }
        }
    }
}

abstract class Colleague {

    protected Mediator mediator;

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void receive();

    public abstract void send();

}

class ConcreteColleague1 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类1收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类1发出请求");
        mediator.relay(this);
    }
}

class ConcreteColleague2 extends Colleague {

    @Override
    public void receive() {
        System.out.println("具体同事类2收到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类2发出请求");
        mediator.relay(this);
    }
}