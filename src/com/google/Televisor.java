package com.google;

public class Televisor {

    public boolean isOn = false;

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public String showStatus() {
        return "is TV on? " + isOn;
    }
}
