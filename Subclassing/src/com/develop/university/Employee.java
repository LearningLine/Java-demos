package com.develop.university;

public class Employee extends Person {
    String dept;
    double salary;
    
    Employee() {
        this(null, 0, null, 0.0);
    }
    
    Employee(String name, int age, String dept, double salary) {
        super(name, age);
        this.dept = dept; this.salary = salary;
    }
    
    public String toString() {
        return "Name: " + name + " dept: " + dept + " salary: " + salary;
    }
}
