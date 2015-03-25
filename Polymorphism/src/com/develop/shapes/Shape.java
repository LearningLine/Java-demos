package com.develop.shapes;

public abstract class Shape {
    private static int currentCount = 0;
    private int id;
    
    public Shape() {
        this.id = ++currentCount;
    }
    
    public final int getId() {
        return reallyGetId();
    }
    
    private int reallyGetId() {
        return id;
    }
}
