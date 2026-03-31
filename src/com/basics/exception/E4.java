package com.basics.exception;

public class E4 {
    static void withdraw(int tb, int amt){
        final int mb = 2000;
        if(tb-amt< mb){
            throw new RuntimeException("Minimum balance of 2000 must be maintained");

        }
        System.out.println("withdrawal Successfull");
        System.out.println("Remaining balance is "+  (tb-amt));
    }

    public static void main(String[] args) {
        withdraw(6000,3000);
        withdraw(4000,2000);
    }
}
