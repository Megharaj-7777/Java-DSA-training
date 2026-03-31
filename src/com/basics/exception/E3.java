package com.basics.exception;

public class E3 {
    static void checkAge(int age){
        if(age>=18){
            System.out.println("Access granted - Eligible.");
        }else {
            throw new RuntimeException("Access denied- Not Eligible.");
        }
        System.out.println("Userstarts the app");
    }
    public static void main(String[] args) {
        checkAge(12);
    }
}
