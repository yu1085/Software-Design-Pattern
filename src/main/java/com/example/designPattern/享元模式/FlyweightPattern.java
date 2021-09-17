package com.example.designPattern.享元模式;

import java.util.HashMap;

public class FlyweightPattern {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        Flyweight a = flyweightFactory.getFlyweight("a");
        Flyweight b = flyweightFactory.getFlyweight("a");
        Flyweight c = flyweightFactory.getFlyweight("a");
        Flyweight d = flyweightFactory.getFlyweight("b");
        Flyweight e = flyweightFactory.getFlyweight("b");

        a.operation(new UnsharedConcreteFlyweight("第一次调用a."));
        b.operation(new UnsharedConcreteFlyweight("第2次调用a."));
        c.operation(new UnsharedConcreteFlyweight("第3次调用a."));
        d.operation(new UnsharedConcreteFlyweight("第1次调用b."));
        e.operation(new UnsharedConcreteFlyweight("第2次调用b."));


    }
}

class UnsharedConcreteFlyweight {
    private String info;

    public UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

interface Flyweight {
    public void operation(UnsharedConcreteFlyweight state);
}

class ConcreteFlyweight implements Flyweight {
    private String key;

    public ConcreteFlyweight(String key) {
        this.key = key;
        System.out.println("具体享元" + key + "被创建");
    }

    @Override
    public void operation(UnsharedConcreteFlyweight state) {
        System.out.print("具体享元" + key + "被调用,");
        System.out.println("非享元信息是：" + state.getInfo());
    }

}


class FlyweightFactory {
    HashMap<String, Flyweight> hashMap = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        Flyweight flyweight = (Flyweight) hashMap.get(key);
        if (flyweight != null) {
            System.out.println("具体享元" + key + "已经存在，被获取成功");
        } else {
            flyweight = new ConcreteFlyweight(key);
            hashMap.put(key, flyweight);
        }
        return flyweight;
    }
}