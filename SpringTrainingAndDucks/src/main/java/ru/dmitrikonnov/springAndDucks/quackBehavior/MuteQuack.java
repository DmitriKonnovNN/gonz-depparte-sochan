package ru.dmitrikonnov.springAndDucks.quackBehavior;



public class MuteQuack implements QuackBehavior {
    private final String quack;

    public MuteQuack(String quack) {
        this.quack = quack;
    }

    public String quack (){
        return quack;};

}
