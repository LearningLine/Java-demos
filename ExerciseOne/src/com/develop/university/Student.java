package com.develop.university;

public class Student {
    private String name;
    private int age;
    private int id;
    
    public Student() { 
        this(null, 0, -1);
        System.out.println("initialized with default constructor");
    }
    
    public Student(String name, int age, int id) {
        this.name = name; this.age = age; this.id = id;
    }
    
    public String getName() {
        if (name != null) {
            return name;
        }
        System.out.println("Name not set");
        return "unknown";
    }
    
    public int getAge() {
        return age;
    }
    
    public int getId() {
        return id;
    }
    
    public boolean setName(String name) {
        this.name = name;
        return true;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void setId(int id) {
        this.id = id;
    }
}
