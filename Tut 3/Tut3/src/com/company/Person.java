package com.company;

public class Person {
    private String myName;
    private int myAge;
    private String myGender;

    public Person(String name, int age, String gender, int idNum, int fee, int
            grade) {
    }
    public String getMyName() {
        return myName;
    }
    public void setMyName(String myName) {
        this.myName = myName;
    }
    public int getMyAge() {
        return myAge;
    }
    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }
    public String getMyGender() {
        return myGender;
    }
    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public Person(String name, int age, String gender) {
        myName =name;
        myAge = age;
        myGender =gender; }

    @Override
    public String toString() {
        return "Person{" +
                "myName='" + myName + '\'' +
                ", myAge=" + myAge +
                ", myGender='" + myGender + '\'' +                '}';
    }
}
