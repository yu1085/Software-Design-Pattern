package com.example.designPatternImpl.原型模式Impl;

public class School implements Cloneable {

    private String schoolName;
    private int stuNumber;
    private Student student;


    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStuNumber() {
        return stuNumber;
    }

    public void setStuNumber(int stuNumber) {
        this.stuNumber = stuNumber;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "School{" +
                "schoolName=" + schoolName +
                ", stuNumber=" + stuNumber +
                ", student=" + student +
                '}';
    }


    @Override
    public School clone() throws CloneNotSupportedException {
        return (School) super.clone();
    }

}
