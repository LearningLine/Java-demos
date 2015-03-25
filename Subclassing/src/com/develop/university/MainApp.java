package com.develop.university;

public class MainApp {

    public static void main(String[] args) {
        Student[] students = {
                new Student("Bradley", 21, 1001),
                new Student("Paul", 23, 1004),
                new Student("Mary", 20, 1002),
                new Student("Mike", 19, 1010),
        };
        Employee[] emps = {
                new Employee("Mark", 30, "CS", 2010),
                new Employee("Ann", 29, "SocSci", 2040),
                new Employee("Bob", 46, "History", 2500),
                new Employee("Peter", 34, "Psych", 2400),
        };
        
        Person[] people = {
                new Student("Bradley", 21, 1001),
                new Student("Paul", 23, 1004),
                new Student("Mary", 20, 1002),
                new Student("Mike", 19, 1010),
                new Employee("Mark", 30, "CS", 2010),
                new Employee("Ann", 29, "SocSci", 2040),
                new Employee("Bob", 46, "History", 2500),
                new Employee("Peter", 34, "Psych", 2400),
        };
        
        //        System.out.println("Students");
//        for (Student s : students) {
//            System.out.println(s.toString());
//        }
//        
//        System.out.println("Employees");
//        for (Employee e : emps) {
//            System.out.println(e.toString());
//        }
//        
        
        
//        for (Person p : people) {
//            if (p instanceof Employee) {
//                System.out.print("Employee: ");
//                Employee e = (Employee)p;
//            }
//            System.out.println(p);
//        }
        
        Person p1 = new Person("Bradley", 21);
        Object p2 = new Person("Bradley", 21);
        
        System.out.println(p1.equals(p2));
        
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());

//        Student one = new Student("Bradley", 21, 1001);      
//        Student two = new Student("Bradley", 21, 1020);
//
//        System.out.println(one == two);
//        System.out.println(one.equals(two));
                
    }

}
