package com.basics.threads;

public class ATMTransaction extends Thread {
    public void  run(){
        System.out.println("Processing ATM Transaction");

    }

    public static void main(String[] args) {
        ATMTransaction tx = new
                ATMTransaction();
        System.out.println("Thread state before start():"+tx.getState());
        tx.start();
        System.out.println("Thread state after start");
        tx.getState();
    }
}
