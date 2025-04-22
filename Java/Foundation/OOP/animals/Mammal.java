package com.greenfoxacademy.animals;

public class Mammal extends Animal {

    String group;


    public Mammal(String mammalName) {
        this.name = mammalName;
    }

    @Override
    public String getName() {
        return this.name.toString();
    }

    @Override
    public String breed() {
        return "pushing miniature versions out.";
    }

    @Override
    public String breeth() {
        return "using its lungs.";
    }

    @Override
    public String eat() {
        return "a lot.";
    }

    @Override
    public String drink() {
        return "a lot of water.";
    }
}
