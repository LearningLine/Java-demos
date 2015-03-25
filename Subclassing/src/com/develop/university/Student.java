package com.develop.university;

public class Student extends Person {
    int id;
    
    public Student() {
        this(null, 0, -1);
    }
    
    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
    
    public String toString() {
        return super.toString() + " id: " + id;
    }
    
    public boolean equals(Object other) {
        // check to see if other is a Person
        if (!(other instanceof Student)) {
            return false;
        }
        Student rhs = (Student)other;
        return super.equals(rhs) && this.id == rhs.id;
    }
}
