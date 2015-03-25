package com.develop.shapes;

public class Circle extends Shape implements Drawable {
    private double radius = 1.0;
    
    public Circle() { }
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Circle");
    }
    
//    @Override
//    public int getId() {
//        return 42;
//    }
    
    public int reallyGetId() {
        return 42;
    }
    
    public double getRadius() {
        return radius;
    }
}
