package com.google;

public class Main {

    public static void main(String[] args) {
        Televisor televisor = new Televisor();

        televisor.turnOn();
        System.out.println(televisor.showStatus());
        televisor.turnOff();
        System.out.println(televisor.showStatus());
    }
}
