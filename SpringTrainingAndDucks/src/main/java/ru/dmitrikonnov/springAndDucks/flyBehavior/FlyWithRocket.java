package ru.dmitrikonnov.springAndDucks.flyBehavior;



public class FlyWithRocket implements FlyBehavior {
    private final int speed;
    private final String message;

    public FlyWithRocket(int speed, String message) {
        this.speed = speed;
        this.message = message;
    }

    public void fly (){
        System.out.println(message + " " + speed + "km/h");}
}
