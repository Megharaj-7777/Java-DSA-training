package com.basics.exception;

public class InvaliAgeException extends Exception {
    InvaliAgeException(String msg){
        super(msg);
    }
}
class Main{
    static void vote(int age) throws InvaliAgeException{
        if (age<18){
            throw new InvaliAgeException("Age must be atleast 18");
        }
        System.out.println("You can vote");
    }

    public static void main(String[] args) {

        try {
            vote(12);
        }catch (InvaliAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

