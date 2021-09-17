package com.example.designPatternImpl.原型模式Impl;

//浅克隆测试                     非基本类型属性地址没变
//深克隆： 创建一个新对象，属性中引用的其他对象也会被克隆，不再指向原有对象地址。
//浅克隆： 创建一个新对象，新对象的属性和原来对象完全相同，对于非基本类型属性，仍指向原有属性所指向的对象的内存地址
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        School school = new School();
        school.setSchoolName("实验小学");
        school.setStuNumber(100);

        Student student = new Student();
        student.setName("张三");
        student.setSex(new StringBuffer("男"));
        school.setStudent(student);

        System.out.println("school的hasCode:" + school.hashCode() + "   学生的hasCode：" + school.getStudent().hashCode());

        School clone = school.clone();
        System.out.println("clone的hasCode:" + clone.hashCode() + "   clone学生的hasCode：" + clone.getStudent().hashCode());

    }
}
