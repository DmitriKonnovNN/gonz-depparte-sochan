package ru.dmitrikonnov.springAndDucks.ducks;


import ru.dmitrikonnov.springAndDucks.flyBehavior.FlyBehavior;
import ru.dmitrikonnov.springAndDucks.quackBehavior.QuackBehavior;

/**
 * Dependency Injection passed by Constructor
 * */



public class SimpleDuck extends Duck {
    @Override
    public void die (){
        System.out.println(getName() + " is being destroyed.");
    } // - destroy-method

    public SimpleDuck(){} // the empty constructor gives us a choice either to pass DI by Constructor or by Setter without an error in AC appears. See AC duck3

    public SimpleDuck(FlyBehavior fb) {
        flyBehavior = fb;;
        quackBehavior = new QuackBehavior() {};

    }

    public SimpleDuck(QuackBehavior qb, FlyBehavior fb) {
        quackBehavior = qb;
        flyBehavior = fb;

    }

    public SimpleDuck(double weight, QuackBehavior qb, FlyBehavior fb ) {
        super(weight);
        quackBehavior = qb;
        flyBehavior = fb;


    }

     public SimpleDuck(Duck ob) {
         super(ob);
        if (ob instanceof SimpleDuck) {
            SimpleDuck md = (SimpleDuck) ob;
            quackBehavior = md.quackBehavior;
            flyBehavior = md.flyBehavior;

        }
        else {
            super.weight = 0;
            super.setName("Unknown duck");
            flyBehavior = new FlyBehavior() {};
            quackBehavior = new QuackBehavior() {};

        }
     }
}
