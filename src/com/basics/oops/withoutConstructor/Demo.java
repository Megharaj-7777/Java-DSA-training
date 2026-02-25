package com.basics.oops.withoutConstructor;

public class Demo {
    String i;
    void change(String i) {
        this.i = i;
    }
    void display(){
        System.out.println("the value of i is :"+1);
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.change("Demo");
        obj.display();
    }
}
