package com.develop.shapes;

public class Elipse extends Shape implements Renderable {

    @Override
    public void draw() {
        System.out.println("Elipse");
    }

    @Override
    public void print() {
        System.out.println("Printing Elipse");
    }

}
