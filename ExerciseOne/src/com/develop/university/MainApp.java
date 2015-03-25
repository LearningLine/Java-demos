package com.develop.university;

public class MainApp {

    public static void main(String[] args) {
////        Student s = new Student("Bradley", 21, 1001);
//        Student s = new Student();
//        
//        //s.setName("John");
//        
//        System.out.println("Name : " + s.getName() + 
//                " age: " + s.getAge() +
//                " id: " + s.getId());
//        
//        
        int a = 1, b = 3, c = 5;
        
        
        int y = a + b;
        y = a - b;
        y = a * b;
        y = a / b;
        
        y = a % b;
        
        ++a;
        int x = a;
        System.out.println("a = " + a + " x = " + x);
        
        a = a + 1;
        
        
        int[] arr = {2,342,435,234632,1341,3346,3,413,};
        
        int z = 0;
//        for (int i = 0; i < arr.length; ++i) {
//            System.out.print("" + arr[i] + " "); 
//        }
        
        for (int val : arr) {
            System.out.print("" + val + " "); 
        }
        System.out.println();
        
        int ii = 0;

        while (ii < arr.length) {
            System.out.print("" + arr[ii] + " ");
            if (ii > 5) { break; }
            ++ii;
        } 
            ;
        
        
        System.out.println();
        while (ii < arr.length) {
          System.out.print("" + arr[ii] + " ");
          ++ii;
        }
        
        System.out.println();



        Student test = null;
        
        if (test != null && test.setName("Bradley")) {
            System.out.println("Name : " + test.getName() + 
                  " age: " + test.getAge() +
                  " id: " + test.getId());
        } else {
            System.out.println("Student is null");
        }
        
        String color = "red";
        
        switch (color) {
        case "blue":
        case "black":
            System.out.println("Color is Dark");
            break;
        case "yellow":
            System.out.println("Color is Light");
            break;
        default:
            System.out.println("Color is unknown");
        }
    
    
        boolean iftest = true;
        
        if (iftest) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

}
