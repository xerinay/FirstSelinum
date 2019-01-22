package com.cybertek.AbstarctClasses;

public class Student {
    int age;
    // abstract class can not be instansiated
    // goal is to provide reusable variable and methods to aub-class
    // abstract clas is ment to be extended
    int age;

    public Student(int age) {
        this.age = age;

    }

    public void attendclass() {}

}

class localstudent extends Student {
    public localstudent() {
       // super(200);

    }

    @Override
    public void attendclass() {}


}
