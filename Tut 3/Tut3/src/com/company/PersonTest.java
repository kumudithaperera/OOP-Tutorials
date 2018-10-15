package com.company;

public class PersonTest {
    public static void main(String[]args){
        Person p1=new Person("sam",21,"m");
        System.out.println(p1);
        Person jack = new Person("Jack Brooke", 27, "M");
        System.out.println(jack);
        Student kum = new Student("kumuditha",45,"m",25,1500,78);
        System.out.println(kum);
        Teacher sam = new Teacher("Sam Hamilton", 34, "M","Computer Science",50000);
        System.out.println(sam);
    }
}
