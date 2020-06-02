package ru.dmitrikonnov.springAndDucks.quackBehavior;



public class Squeak implements QuackBehavior {
    private final String quack;

    public Squeak(String quack) {
        this.quack = quack;
    }

    public String quack() {
        return quack;
    }
}
