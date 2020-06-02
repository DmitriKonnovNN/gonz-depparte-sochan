package ru.dmitrikonnov.springAndDucks.flyBehavior;



public class FlyNoWay implements FlyBehavior {
    private final int speed;
    private final String message;

    public FlyNoWay(int speed, String message) {
        this.speed = speed;
        this.message = message;
    }

    public void fly (){
        System.out.println(message + " " + speed + "km/h");}
}
