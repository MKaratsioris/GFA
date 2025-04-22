package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument{

    public ElectricGuitar() {
        this.numberOfstrings = 6;
        this.name = "Twang";
    }

    public ElectricGuitar(int numOfStrings) {
        this.numberOfstrings = numOfStrings;
        this.name = "Twang";
    }

    @Override
    public void sound() {
        System.out.println("Electric Guitar, a " + numberOfstrings + "-stringed instrument that goes " + name);
    }
}
