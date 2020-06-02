package ru.dmitrikonnov.springAndDucks.quackBehavior;



public class Quack implements QuackBehavior {

   private final String quack;

   public Quack(String quack) {
      this.quack = quack;
   }
   public String quack (){
       return quack;}



}
