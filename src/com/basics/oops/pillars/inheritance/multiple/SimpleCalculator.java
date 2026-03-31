package com.basics.oops.pillars.inheritance.multiple;

public class SimpleCalculator {
    void add (int a, int b){
        System.out.println(a+b);
    }
    void subtract(int a, int b){
        System.out.println(a-b);
    }
}
class AdvancedCalculator extends SimpleCalculator{
    void  divide(int a, int b){
        System.out.println(a/b);
    }
    void  multiply(int a, int b){
        System.out.println(a*b);
    }
}
class SuperAdvancedCalculator extends AdvancedCalculator{
    void  square(int x){
        System.out.println(Math.pow(x,2));
    }
    void  cube(int x){
        System.out.println(Math.pow(x,3));
    }

    public static void main(String[] args) {
        System.out.println("==========================================================");
        SimpleCalculator c1=new SimpleCalculator();
        c1.subtract(4,5);
        System.out.println("==========================================================");
        AdvancedCalculator c2= new AdvancedCalculator();
        c2.subtract(10,5);
        c2.divide(10,5);
        c2.add(4,6);
        c2.multiply(6,7);
        System.out.println("==========================================================");
        SuperAdvancedCalculator c3= new SuperAdvancedCalculator();
        c3.subtract(4,2);
        c3.cube(4);
        c3.square(2);
        System.out.println("==========================================================");
    }
}
