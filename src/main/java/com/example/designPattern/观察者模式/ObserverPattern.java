package com.example.designPattern.观察者模式;


import java.util.ArrayList;

public class ObserverPattern {
    public static void main(String[] args) {

        ConcreteSubject concreteSubject = new ConcreteSubject();
        ConcreteObserver1 concreteObserver1 = new ConcreteObserver1();
        ConcreteObserver2 concreteObserver2 = new ConcreteObserver2();
        concreteSubject.add(concreteObserver1);
        concreteSubject.add(concreteObserver2);
        concreteSubject.notifyObserver();


    }
}

abstract class Subject {
    ArrayList<Observer> observers = new ArrayList<>();

    public void add(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {
        observers.remove(observer);
    }

    public abstract void notifyObserver();//通知观察者方法

}

class ConcreteSubject extends Subject {

    @Override
    public void notifyObserver() {
        System.out.println("具体目标发生改变");
        System.out.println("----------------");
        for (Object o : observers) {
            ((Observer) o).response();
        }
    }

}


interface Observer {
    void response();
}

class ConcreteObserver1 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者1作出反应！");
    }
}


class ConcreteObserver2 implements Observer {

    @Override
    public void response() {
        System.out.println("具体观察者2作出反应！");
    }
}