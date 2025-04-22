package com.greenfoxacademy.animals;
import flyable.Flyable;

public class Bird extends Animal implements Flyable {

    int wingsOpening;

    public Bird(String birdName) {
        this.name = birdName;
    }

    @Override
    public String getName() {
        return this.name.toString();
    }

    @Override
    public String breed() {
        return "laying eggs.";
    }

    @Override
    public String breeth() {
        return "using its lungs.";
    }

    @Override
    public String eat() {
        return "not a lot.";
    }

    @Override
    public String drink() {
        return "water.";
    }
}
