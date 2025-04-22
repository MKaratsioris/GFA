package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{

    public BassGuitar() {
        this.numberOfstrings = 4;
        this.name = "Duum-duum-duum";
    }

    public BassGuitar(int numOfStrings) {
        this.numberOfstrings = numOfStrings;
        this.name = "Duum-duum-duum";
    }

    @Override
    public void sound() {
        System.out.println("Bass Guitar, a " + numberOfstrings + "-stringed instrument that goes " + name);
    }

}
