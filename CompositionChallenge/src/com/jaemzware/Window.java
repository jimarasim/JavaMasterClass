package com.jaemzware;

public class Window {
    private int height;
    private int width;

    public Window(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public void open() {
        System.out.println("Window.open()");
    }

    public void close() {
        System.out.println("Window.close()");
    }
}
