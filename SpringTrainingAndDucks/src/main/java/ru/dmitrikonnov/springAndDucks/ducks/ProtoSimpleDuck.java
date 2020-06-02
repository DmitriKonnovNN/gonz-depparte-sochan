package ru.dmitrikonnov.springAndDucks.ducks;

import ru.dmitrikonnov.springAndDucks.flyBehavior.FlyBehavior;
import ru.dmitrikonnov.springAndDucks.quackBehavior.QuackBehavior;

public class ProtoSimpleDuck extends Duck {
    @Override
    public void die (){
        System.out.println(getName() + " is being destroyed.");
    }

    private ProtoSimpleDuck(FlyBehavior fb, QuackBehavior qb) {
        flyBehavior = fb;
        quackBehavior = qb;

    }

    public static ProtoSimpleDuck generate(FlyBehavior fb, QuackBehavior qb){
        return new ProtoSimpleDuck(fb, qb);
    }
}
