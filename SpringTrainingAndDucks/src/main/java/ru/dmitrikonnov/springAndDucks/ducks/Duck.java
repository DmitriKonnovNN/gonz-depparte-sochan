package ru.dmitrikonnov.springAndDucks.ducks;


import ru.dmitrikonnov.springAndDucks.flyBehavior.FlyBehavior;
import ru.dmitrikonnov.springAndDucks.quackBehavior.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    private static int duckCounter = 0;
    private String name;
    double weight;



    Duck(){
        duckCounter++;
    }


    Duck(double weight){
        duckCounter++;
        this.weight = weight;
    }
    Duck(Duck duck) {
        duckCounter++;
        this.weight = duck.weight;
        this.name = duck.name;

    }

    public abstract void die ();

    public final void swim (){
        System.out.println("All ducks float, even decoys");}

    public String performQuack (){ return quackBehavior.quack();}
    public void performFly(){flyBehavior.fly();}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public Class<? extends FlyBehavior> getFlyBehavior() {
        return flyBehavior.getClass();
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public Class<? extends QuackBehavior> getQuackBehavior() {
        return quackBehavior.getClass();
    }



    public double getWeight() {
        return weight;
    }

    public void  getDuckCounter() {
        System.out.println(duckCounter);;
    }
}
