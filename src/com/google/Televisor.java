package com.google;

public class Televisor {

    public boolean isOn = false;

    public boolean turnOn() {
        return isOn = true;
    }

    public boolean turnOff() {
        return isOn = false;
    }

    public String showStatus() {
        return "is TV on? " + isOn;
    }
}
