package com.develop;

import com.develop.shapes.*;

public class DrawingApp {

    public static void render(Drawable[] shapes) {
        for (Drawable s : shapes) {
            if (s instanceof Shape) {
                System.out.print("ID : " + ((Shape)s).getId() + " ");
            }
            s.draw();
            if (s instanceof Circle) {
                System.out.println("Radius is " + ((Circle)s).getRadius());
            }
        }
    }
    
    public static void print(Printable[] shapes) {
        for (Printable s : shapes) {
            s.print();
        }
    }
    public static void main(String[] args) {
        render(getPicture());
    }

    public static Drawable[] getPicture() {
        Drawable[] s = null;

        s = new Drawable[]{ 
                new Elipse(),
                new Line(),
                new Rect(),
                new Line(),
                new Circle(),
        };
       
        return s;
    }
}
