package com.greenfoxacademy.animals;

public class Reptile extends Animal {

    int length;

    public Reptile(String animalName) {
        this.name = animalName;
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
