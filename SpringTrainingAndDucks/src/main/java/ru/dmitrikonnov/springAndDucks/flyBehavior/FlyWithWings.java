package ru.dmitrikonnov.springAndDucks.flyBehavior;

public class FlyWithWings implements FlyBehavior {
    private final int speed;
    private final String message;
    public FlyWithWings(int speed, String message) {
        this.speed = speed;
        this.message = message;
    }

    public void fly (){
        System.out.println(message + " " + speed + "km/h.");}


    /** @Override
     public void getFlyBehaviorStatus() {
      }
    You don't necessarily need to override that method at all. Moreover it has already its implementation
     @Override
     public void getFlyBehaviorStatus() {
     System.out.println("FLYABLE");}
     That's a new implementation of the method that overrides the original default implementation.
     */
}
