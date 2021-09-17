package com.example.designPattern.原型模式;

//原型模式就是实现clone接口 重写chone方法   用clone快速创建对象

//里面有个深克隆 浅克隆的问题
// 浅克隆 -- 复制属性和 相同的指向地址
// 深克隆 -- 复制属性但有了新的地址

public class Fruit implements Cloneable {
    Fruit() {
        System.out.println("创建对象成功");
    }

    @Override
    public Fruit clone() throws CloneNotSupportedException {
        System.out.println("clone成功");
        return (Fruit) super.clone();
    }
}


class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Fruit fruit = new Fruit();
        Fruit clone = fruit.clone();

        System.out.println("你猜猜她们相同吗");
        System.out.println(fruit == clone);
    }
}