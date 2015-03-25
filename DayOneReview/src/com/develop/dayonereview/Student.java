package com.develop.dayonereview;

public class Student extends Person {
    int id;
    
    Student() {
        this(null, 0, -1);
    }
    
    Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
}
