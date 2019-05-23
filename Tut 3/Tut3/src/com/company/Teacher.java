package com.company;

public class Teacher extends Person {
    private String mySubject;
    private double mySalary;

    public Teacher(String name, int age, String gender, String subject, double
            salary) {
        super(name, age, gender);
        this.mySalary = salary;
        this.mySubject = subject;
    }
    public Teacher(String name, int age, String gender) {
        super(name, age, gender);

    }
    public String getSubject() {
        return mySubject;
    }
    public double getSalary() {
        return mySalary;
    }
    public void setSubject(String subject) {
        mySubject = subject;
    }
    public void setSalary(double salary) {
        mySalary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "mySubject='" + mySubject + '\'' +
                ", mySalary=" + mySalary +
                '}';
    }
}
