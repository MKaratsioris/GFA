package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {

    int numberOfstrings;

    public abstract void sound();

    @Override
    public void play() {
        this.sound();
    }

}
