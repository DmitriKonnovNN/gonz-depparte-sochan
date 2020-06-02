package ru.dmitrikonnov.springAndDucks.quackBehavior;

public interface QuackBehavior {
    default String quack(){return "No quack implementation yet";}

}
