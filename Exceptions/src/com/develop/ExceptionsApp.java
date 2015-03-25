package com.develop;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MyException extends RuntimeException {
    String msg;
    MyException(String msg) { this.msg = msg; }
}

class MySubException extends MyException {
    MySubException(String msg) { super(msg); }
}

class OtherException extends Exception {
    OtherException(String msg) { super(msg); }
}

class One
{
    void foo() //throws MyException 
    {}
}

class Two extends One
{
    void foo() //throws MySubException 
    { throw new MySubException("hello"); }
}

public class ExceptionsApp {

    public static void bar() {
        One one = getOne();
        try {
            one.foo();
        } catch (MyException e) {
            System.out.println(e.msg);
        }
    }
    
    public static One getOne() {
        return new Two();
    }
    public static void funcThatCouldThrow(int x) throws MyException {
        if (x % 2 == 0) {
            throw new MyException("test");
        }
    }
    public static void main(String[] args)  {
        
        bar();
        
        try (FileInputStream in = new FileInputStream("test.txt") { 
            public void close() throws IOException {
                super.close(); System.out.println("closing");
            }})
        {
            System.out.println("Found the requested file.");
            funcThatCouldThrow(2);
        } catch (Throwable e) {
            System.out.println("Throwable");
//        } catch (Exception e) {
//            System.out.println("Exception");
//        } catch (FileNotFoundException e) {
//            System.out.println("Sorry could not find the requested file.");
//        } catch (IOException e) {
//            System.out.println("Failed to close the requested file.");
        }
        
        System.out.println("After the guarded body");        
        
    }

}

//public static void main(String[] args)  {
//    FileInputStream in = null;
//    try
//    {
//        in = new FileInputStream("test.txt") { 
//            public void close() throws IOException {
//                super.close(); System.out.println("closing");
//            }
//        };
//        System.out.println("Found the requested file.");
//        funcThatCouldThrow(2);
//    } catch (FileNotFoundException e) {
//        System.out.println("Sorry could not find the requested file.");
//    } catch (IOException e) {
//        System.out.println("Failed to close the requested file.");
//    } catch (Exception e) {
//        System.out.println("Exception");
//    } finally {
//        System.out.println("finally");
//        try { in.close(); } catch (IOException e) {
//            System.out.println("Failed to close the requested file.");
//        }
//    }
//    System.out.println("After the guarded body");        
//    
//}
