package com.develop;

import java.util.ArrayList;
import java.util.List;

import com.develop.util.MyList;

import static java.lang.System.out;

class Item {
    static int count = 0;
    int id;
    public Item() {
        id = ++count;
    }
}
class Book extends Item {}
class Dog extends Item {}

public class GenericsApp {

    public static void process(List<? extends Item> items) {
        out.println("item list");
        for (Item i : items) {
            out.println(i.id);
        }
    }
    public static void process(String s) {}
    
    public static void main(String[] args) {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book());
        books.add(new Book());
        books.add(new Book());
        
        List<Dog> dogs = new ArrayList<Dog>();
        dogs.add(new Dog());
        dogs.add(new Dog());
        dogs.add(new Dog());
        
        process(dogs);
        process(books);
        
//        MyList<Object> listOfAny = new MyList<>();
//        listOfAny.add("hello");
//        MyList<String> listOfStrings = new MyList<>();
//        MyList<Integer> listOfIntegers = new MyList<Integer>();
//        
//        listOfIntegers.add(4);
//        listOfIntegers.add(new Integer(7));
//        
//        listOfStrings.add("hello");
//        listOfStrings.add("goodbye");
//        listOfStrings.add("hola");
//        listOfStrings.add("again");
//        listOfStrings.add("and again");
//        
//        out.println(listOfStrings.get(1));
//
//        process(listOfStrings.get(1));
//        
//       // process(listOfIntegers.get(1));
//        
//        listOfStrings.print();
//        listOfIntegers.print();
   
    }

}
