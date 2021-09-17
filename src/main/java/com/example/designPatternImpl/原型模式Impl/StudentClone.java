package com.example.designPatternImpl.原型模式Impl;

public class StudentClone implements Cloneable {
    private int id;
    private String name;
    private StringBuffer sex;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StringBuffer getSex() {
        return sex;
    }

    public void setSex(StringBuffer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                '}';
    }

    @Override
    public StudentClone clone() throws CloneNotSupportedException {
        return (StudentClone) super.clone();
    }
}
