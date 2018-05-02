package com.jaemzware;

public class Door {
    private int height;
    private int width;

    public Door(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void open() {
        System.out.println("Door.open()");
    }

    public void close() {
        System.out.println("Door.close()");
    }
}
