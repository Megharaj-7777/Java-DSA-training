package com.basics.methods;

public class Example2 {
    static int sumOfNTerms(int n){
        return n*(n+1)/2;
    }
    public static void main(String[] args) {
       int sum=sumOfNTerms(10);
        System.out.println(sum);
        System.out.println(sumOfNTerms(100));

    }
}
