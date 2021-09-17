package com.example.designPattern;

//单例模式的优点：
//        单例模式可以保证内存里只有一个实例，减少了内存的开销。
//        可以避免对资源的多重占用。
//        单例模式设置全局访问点，可以优化和共享资源的访问。
//单例模式的缺点：
//        单例模式一般没有接口，扩展困难。如果要扩展，则除了修改原来的代码，没有第二种途径，违背开闭原则。
//        在并发测试中，单例模式不利于代码调试。在调试过程中，如果单例中的代码没有执行完，也不能模拟生成一个新的对象。
//        单例模式的功能代码通常写在一个类中，如果功能设计不合理，则很容易违背单一职责原则。


//对于 Java 来说，单例模式可以保证在一个 JVM 中只存在单一实例。单例模式的应用场景主要有以下几个方面。
//        需要频繁创建的一些类，使用单例可以降低系统的内存压力，减少 GC。
//        某类只要求生成一个对象的时候，如一个班中的班长、每个人的身份证号等。
//        某些类创建实例时占用资源较多，或实例化耗时较长，且经常使用。
//        某类需要频繁实例化，而创建的对象又频繁被销毁的时候，如多线程的线程池、网络连接池等。
//        频繁访问数据库或文件的对象。
//        对于一些控制硬件级别的操作，或者从系统上来讲应当是单一控制逻辑的操作，如果有多个实例，则系统会完全乱套。
//        当对象需要被共享的场合。由于单例模式只允许创建一个对象，共享该对象可以节省内存，并加快对象访问速度。如 Web 中的配置对象、数据库的连接池等。


//懒汉单利模式
//该模式的特点是类加载时没有生成单例模式，只有第一次调用getInstance方法时才创建这个单利。

public class LazySingleton {
    private static volatile LazySingleton instance = null;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}

//饿汉式单例
//该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。

class HnugrySingleton {

    private static final HnugrySingleton instance = new HnugrySingleton();

    private HnugrySingleton() {

    }

    public static HnugrySingleton getInstance() {
        return instance;
    }
}