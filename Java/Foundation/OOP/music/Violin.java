package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{

    public Violin() {
        this.numberOfstrings = 4;
        this.name = "Screech";
    }

    public Violin(int numOfStrings) {
        this.numberOfstrings = numOfStrings;
        this.name = "Screech";
    }

    @Override
    public void sound() {
        System.out.println("Violin, a " + numberOfstrings + "-stringed instrument that goes " + name);
    }

}
