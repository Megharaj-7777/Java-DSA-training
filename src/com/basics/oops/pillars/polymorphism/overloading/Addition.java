package com.basics.oops.pillars.polymorphism.overloading;

public class Addition {
    static void add(int a, int b){
        System.out.println(a+b);
        System.out.println("int");
    }
    static void add(int a, int b,int c){
        System.out.println(a+b+c);
        System.out.println("Triple");
    }
    static void add(float a, float b){
        System.out.println(a+b);
        System.out.println("float");
    }
    static void add(double a, double b){
        System.out.println(a+b);
        System.out.println("Double");
    }

    public static void main(String[] args) {
        add(2,4);
        add(2.5,6.7);
        add(2,4,5);
        add(3.945,7.888);
        add(1.25f,2.45f);

    }

}
