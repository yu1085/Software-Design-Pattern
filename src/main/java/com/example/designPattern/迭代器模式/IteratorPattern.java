package com.example.designPattern.迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class IteratorPattern {
    public static void main(String[] args) {

        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("中山大学");
        aggregate.add("华南理工");
        aggregate.add("韶关学院");
        System.out.print("聚合的内容有：");
        Iterator1 it = aggregate.getIterator();
        while (it.hasNext()) {
            Object ob = it.next();
            System.out.print(ob.toString() + "\t");
        }
        Object ob = it.first();
        System.out.println("\nFirst：" + ob.toString());
    }
}

interface Aggregate {
    public void add(Object obj);

    public void remove(Object obj);

    public Iterator1 getIterator();
}

class ConcreteAggregate implements Aggregate {

    private ArrayList<Object> list = new ArrayList<>();

    @Override
    public void add(Object obj) {
        list.add(obj);
    }

    @Override
    public void remove(Object obj) {
        list.remove(obj);
    }

    @Override
    public Iterator1 getIterator() {
        return new ConcreteIterator(list);
    }
}

interface Iterator1 {
    Object first();

    Object next();

    boolean hasNext();

}

class ConcreteIterator implements Iterator1 {
    private List<Object> list = null;
    private int index = -1;

    public ConcreteIterator(List<Object> list) {
        this.list = list;
    }

    @Override
    public Object first() {
        index = 0;
        Object obj = list.get(index);
        return obj;
    }

    @Override
    public Object next() {
        Object object = null;
        if (this.hasNext()) {
            object = list.get(++index);
        }
        return object;
    }

    @Override
    public boolean hasNext() {
        if (index < list.size() - 1) {
            return true;
        } else {
            return false;
        }
    }
}
