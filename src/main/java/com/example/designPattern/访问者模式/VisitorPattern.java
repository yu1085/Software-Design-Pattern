package com.example.designPattern.访问者模式;

//在现实生活中，有些集合对象存在多种不同的元素，且每种元素也存在多种不同的访问者和处理方式。例如，公园中存在多个景点，也存在多个游客，
// 不同的游客对同一个景点的评价可能不同；医院医生开的处方单中包含多种药元素，査看它的划价员和药房工作人员对它的处理方式也不同，
// 划价员根据处方单上面的药品名和数量进行划价，药房工作人员根据处方单的内容进行抓药。


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class VisitorPattern {
    public static void main(String[] args) {


        ObjectStructure os = new ObjectStructure();
        os.add(new ConcreteElementA());
        os.add(new ConcreteElementB());
        Visitor visitor = new ConcreteVisitorA();
        os.accept(visitor);
        System.out.println("------");
        Visitor visitorB = new ConcreteVisitorB();
        os.accept(visitorB);


    }
}

interface Visitor {
    void visit(ConcreteElementA concreteElementA);

    void visit(ConcreteElementB concreteElementB);
}

class ConcreteVisitorA implements Visitor {

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体的访问者A访问" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体的访问者A访问" + concreteElementB.operationB());
    }
}

class ConcreteVisitorB implements Visitor {

    @Override
    public void visit(ConcreteElementA concreteElementA) {
        System.out.println("具体的访问者A访问" + concreteElementA.operationA());
    }

    @Override
    public void visit(ConcreteElementB concreteElementB) {
        System.out.println("具体的访问者B访问" + concreteElementB.operationB());
    }
}

interface Element {
    void accept(Visitor visitor);
}

class ConcreteElementA implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public String operationA() {
        return "具体元素A的操作";
    }
}

class ConcreteElementB implements Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    public String operationB() {
        return "具体元素B的操作";
    }
}

class ObjectStructure {

    private List<Element> list = new ArrayList<Element>();

    public void accept(Visitor visitor) {
        Iterator<Element> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void add(Element e) {
        list.add(e);
    }

    public void remove(Element e) {
        list.remove(e);
    }
}