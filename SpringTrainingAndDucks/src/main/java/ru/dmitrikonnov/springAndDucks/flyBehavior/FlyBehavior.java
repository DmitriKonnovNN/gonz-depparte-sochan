package ru.dmitrikonnov.springAndDucks.flyBehavior;

public interface FlyBehavior {
    String FLYBEHAVIOR = "Usually, every duck is able to fly "; /**<? is PUBLIC STATIC FINAL - a constant */
    default void fly () {
        System.out.println("Fly behavior not implemented yet!");
    }
    default void getFlyBehaviorStatus() {
        System.out.println(FLYBEHAVIOR);} /** that method has not necessarily to be implemented    */

}
