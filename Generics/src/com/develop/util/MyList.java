package com.develop.util;

public class MyList<T> {
    private T[] elements;
    private int size = 0;
    private int capacity = 4;

    @SuppressWarnings("unchecked")
    public MyList() {
        elements = (T[]) new Object[capacity];
    }
    public void add(T e) {
        if (size == capacity) {
            capacity *= 2;
            @SuppressWarnings("unchecked")
            T[] tmp = (T[]) new Object[capacity];
            System.arraycopy(elements, 0, tmp, 0, size);
            elements = tmp;
        }
        elements[size++] = e;
    }
    
    public T get(int index) {
        return elements[index];
    }
    
    public void print() {
        for (int i = 0; i < size; ++i) {
            System.out.print(elements[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
