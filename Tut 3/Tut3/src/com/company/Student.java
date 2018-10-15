package com.company;

public class Student extends Person {
    private int IDNum;
    private String name;
    private int Fee;
    private int grade;

    public Student(String name, int age, String gender, int IDNum, int fee, int
            grade) {
        super(name, age, gender,IDNum,fee,grade);
        this.IDNum = IDNum;
        this.name = name;
        this.Fee = fee;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIDNum() {
        return IDNum;
    }
    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }
    public int getFee() {
        return Fee;
    }
    public void setFee(int fee) {
        Fee = fee;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Person{" +
                "myName='" + name + '\'' +
                " Student{" +
                "IDNum=" + IDNum +
                ", name='" + name + '\'' +
                ", Fee=" + Fee +
                ", grade=" + grade +
                '}';
    }
}
