package com.develop.arrays;

import com.develop.university.Student;

public class ArrayTests {
    
    public static void process(Object... args) {
        System.out.println("Num of args is " + args.length);
        for (Object obj : args) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Bradley", 25, 1001);
        
        Student[] students = {
            new Student(),
            new Student(),
            new Student(),
            new Student(),
            new Student(),
        };
      
        
        Object[] objs = {"hello", 7, new Student("Paul", 25, 1001), s};
//        
//        process(objs);
//        
//        objs = new Object[]{ "goodbye", 11, new Student() };
//           
//        process(objs);
        
        process("hello", 7, new Student("Paul", 25, 1001), s);
        process("goodbye", 11, new Student());
        process("goodbye");
        process((Object)objs);
    }

}
