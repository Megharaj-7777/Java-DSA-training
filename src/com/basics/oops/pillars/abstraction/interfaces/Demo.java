package com.basics.oops.pillars.abstraction.interfaces;

public interface Demo {
    void display();
}
class Main{
    public static void main(String[] args) {
        Demo obj=new Demo(){
            public void display(){
                System.out.println("Normal Code-mBoilerplate Code");
            }
        };
        // SCALA
        Demo obj1= () -> System.out.println("Scala Code");
        obj1.display();
    }
}