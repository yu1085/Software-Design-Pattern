package com.example.designPatternImpl;

//关于苹果的懒汉单例模式的测试
class AppleSingleton {
    private static volatile AppleSingleton apple = null;

    private AppleSingleton() {
        System.out.println("凭空出现一个苹果");
    }

    public static synchronized AppleSingleton getInstance() {
        if (apple == null) {
            apple = new AppleSingleton();
        } else {
            System.out.println("你已经有一个苹果了，不能多吃");
        }
        return apple;
    }

}


//测试方法一定要写在其他class类中 原因是java有内部类的说法 私有构造器可以在内部找到  私有构造器在外部是不允许的
class Test {

    public static void main(String[] args) {
        //私有构造器不能实例化，打开看会报错的
//        AppleSingleton appleSingleton = new AppleSingleton();
//        System.out.println(appleSingleton);

        AppleSingleton instance = AppleSingleton.getInstance();

        AppleSingleton instance2 = AppleSingleton.getInstance();


        if (instance == instance2) {
            System.out.println("同一个苹果");
        } else {
            System.out.println("不是一个苹果");
        }
    }
}
//单例模式太强了