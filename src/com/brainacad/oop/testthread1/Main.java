package com.brainacad.oop.testthread1;

public class Main {

    public static void main(String[] args) {

        MyTimeBomb bomb1;
        MyTimeBomb myTimeBomb = new MyTimeBomb();

        Thread thread = new Thread(myTimeBomb);
        thread.start();

    }
}
