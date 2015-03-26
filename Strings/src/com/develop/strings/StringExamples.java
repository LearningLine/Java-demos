package com.develop.strings;

public class StringExamples {

    public static void main(String[] args) {
//        String one = "Hello";
//        String two = new String("hello");
//        //two += " and Goodbye";
//        
//        System.out.println(one == two);
//        System.out.println(one.equals(two));
//        System.out.println(one.equalsIgnoreCase(two));
//        System.out.println(one);
//        System.out.println(two);
        
        
        StringBuffer one = new StringBuffer("Hello");
        StringBuffer two = one;
        
        two.append(" and Goodbye");
        
        System.out.println(one == two);
        System.out.println(one.equals(two));
        System.out.println(one);
        System.out.println(two);
      
    }

}
