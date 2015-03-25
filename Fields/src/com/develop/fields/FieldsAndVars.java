package com.develop.fields;

import com.develop.university.*;

class One
{
    static final java.awt.Color WHITE = new java.awt.Color(0xFFFFFF);
    
    final static int defaultSize = 10;
    
    int x, y;
    
    final int size;

    One() {
        this(defaultSize);
    }
    
    One(int size) {
        this.size = size;
    }
    
    void print(int x, int y) {
        System.out.println("x = " + this.x + " y = " + this.y);
    }
}

public class FieldsAndVars {

  
    public static void main(String[] args) {
        int z = 9;
        One one = new One();
        One two = new One(20);
        //One.defaultSize = 30;
        One three = new One();
        
        Student s = new Student("Bradley", 25, 1010);

        int i = 0;
        for (i = 0; i < 10; ++i) {
            System.out.println("" + i + " ");
        }
        System.out.println(i);

        System.out.println(z);
        System.out.println(one.x);
        System.out.println("Size of one : " + one.size);
        System.out.println("Size of two : " + two.size);
        System.out.println("Size of three : " + three.size);
        

        //one.size = 20;
        
        System.out.println(One.defaultSize);
        System.out.println(One.WHITE);
        //One.WHITE = new java.awt.Color(0);

        one.print(11, 13);
    }

}
