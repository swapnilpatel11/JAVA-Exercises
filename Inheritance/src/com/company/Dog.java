package com.company;

public class Dog extends Animal {
   private int eyes;
   private int legs;
   private int teeth;
   private int tail;
   private String coat;

    public Dog(String name, int size1, int weight1, int i1, int i, int size, int weight, String long_silky) {
        super(name, 1, 1,size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }

    private void chew(){}

    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs Called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move is called");
        moveLegs(speed);
        super.move(speed);
    }
}
