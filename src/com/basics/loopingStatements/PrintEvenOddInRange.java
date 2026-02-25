package com.basics.loopingStatements;

import java.util.Scanner;

public class PrintEvenOddInRange {
    public static void main(String[] args) {
        System.out.println("enter the range");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n>0){
            if (n %2==0) {
                System.out.println(n + " is even");
            }else{
                System.out.println(n + " is odd");
            }
            n--;
        }

    }
}
