package com.basics.conditionalStatements;

public class IfElseIfElse {
    public static void main(String[] args) {
        int x = 0;
        if ( x > 0) {
            System.out.println(x + " is a positive int.");
        }else if(x < 0) {
            System.out.println(x + " is a negative int.");

        }else{
            System.out.println("the no. is equal to 0");
        }
    }
}
