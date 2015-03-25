package com.develop.dayonereview;

public class Person extends java.lang.Object {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name; this.age = age;
    }
    
    @Override
    public boolean equals(Object other) {
        if (other instanceof Person) {
            Person o = (Person)other;
            return this.name.equals(o.name) && this.age == o.age;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age;
    }
    
    @Override
    public String toString() {
        return "Name : " + name + " age: " + age;
    }
}
