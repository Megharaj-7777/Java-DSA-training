package com.basics.oops.pillars.abstraction.interfaces;

public interface Animal {
    void run();
    void loves_to_eat();

}
class Rat implements Animal{

    @Override
    public void run() {
        System.out.println("Rats run fast.");

    }

    @Override
    public void loves_to_eat() {
        System.out.println("Rats loves to eat cheese.");

    }
}
class Cat implements Animal{

    @Override
    public void run() {
        System.out.println("Cats run fast.");

    }

    @Override
    public void loves_to_eat() {
        System.out.println("Cats loves to eat rats.");

    }
}
class InterfaceDemo{
    public static void main(String[] args) {
        Rat rat = new Rat();
        rat.run();
        rat.loves_to_eat();
        Cat cat = new Cat();
        cat.run();
        cat.loves_to_eat();
    }
}