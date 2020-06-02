package ru.dmitrikonnov.springAndDucks.ducks;

/**
 * Dependency Injection passed by Setter
 * */

public class MallardDuck extends Duck {
    @Override
    public void die() {
        System.out.println(getName() + " is being destroyed.");
    }

}
