package com.develop.university;

public class Person {
    String name;
    int age;
    
    public String toString() {
        return "Name: " + name + " age: " + age;
    }
    
    Person(String name, int age) {
        this.name = name; this.age = age;
    }
    
    @Override
    public boolean equals(Object other) {
        // check to see if other is a Person
        if (!(other instanceof Person)) {
            return false;
        }
        Person rhs = (Person)other;
        return this.name.equals(rhs.name) && this.age == rhs.age;
    }
    
    @Override
    public int hashCode() {
        return this.name.hashCode() + this.age;
    }
}
