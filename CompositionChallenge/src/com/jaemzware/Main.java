package com.jaemzware;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(new Door(8, 4), new Window(4, 4));
        room.getWindow().open();
        room.getWindow().close();
        room.createDraft();
    }
}
