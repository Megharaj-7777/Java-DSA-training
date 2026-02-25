package com.basics.methods;

public class Example1 {
    static int x = 10;
    static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Example1 obj = new Example1();
        obj.add(1,2);
        System.out.println(x);
    }
}
