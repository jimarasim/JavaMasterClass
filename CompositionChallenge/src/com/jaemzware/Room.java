package com.jaemzware;

public class Room {
    private Door door;
    private Window window;

    public Room(Door door, Window window) {
        this.door = door;
        this.window = window;
    }

    public Window getWindow() {
        return window;
    }

    public void createDraft() {
        door.open();
        window.open();
    }
}
