package com.example.designPatternImpl.原型模式Impl;

public class SchoolClone implements Cloneable {

    private String schoolName;
    private int stuNumber;
    private StudentClone student;


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

    public StudentClone getStudent() {
        return student;
    }

    public void setStudent(StudentClone student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "SchoolClone{" +
                "schoolName='" + schoolName + '\'' +
                ", stuNumber=" + stuNumber +
                ", student=" + student +
                '}';
    }

    @Override
    public SchoolClone clone() throws CloneNotSupportedException {
        SchoolClone clone = null;
        clone = (SchoolClone) super.clone();
        clone.student = student.clone();
        return clone;
    }

}
