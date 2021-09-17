package com.example.designPattern.组合模式;

import java.util.ArrayList;

public class CompositePattern {
    public static void main(String[] args) {

        Composite c0 = new Composite();
        Composite c1 = new Composite();

        Leaf leaf1 = new Leaf("1");
        Leaf leaf2 = new Leaf("2");
        Leaf leaf3 = new Leaf("3");

        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();

    }
}

interface Component {

    public void add(Component c);

    public void remove(Component c);

    public Component getChild(int c);

    public void operation();

}

class Leaf implements Component {
    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {

    }

    @Override
    public void remove(Component c) {

    }

    @Override
    public Component getChild(int c) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("树叶" + name + "：被访问!");
    }
}

class Composite implements Component {
    private ArrayList<Component> chirdren = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        chirdren.add(c);
    }

    @Override
    public void remove(Component c) {
        chirdren.remove(c);
    }

    @Override
    public Component getChild(int c) {
        return chirdren.get(c);
    }

    @Override
    public void operation() {

        for (Object o : chirdren) {
            ((Component) o).operation();
        }
    }
}




