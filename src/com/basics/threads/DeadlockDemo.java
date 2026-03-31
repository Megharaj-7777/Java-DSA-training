package com.basics.threads;

public class DeadlockDemo {
    static  final Object accountA= new Object();
    static  final Object accountB= new Object();

    public static void main(String[] args) {
        Thread t1= new Thread(()-> {
            synchronized (accountA){
                System.out.println("Thread 1 locked Account A");
                try {
                    Thread.sleep(2000);
                }catch (Exception e){}
                synchronized (accountB) {
                    System.out.println("Thread 1 locked Account B");
                }

            }
        });
            Thread t2= new Thread(()-> {
                synchronized (accountB) {
                    System.out.println("Thread 2 locked Account A");
                    try {
                        Thread.sleep(2000);
                    }catch (Exception e){}
                    synchronized (accountA) {
                        System.out.println("Thread 2 locked Account B");

                    }
                }
            });
            t1.start();
            t2.start();
    }
}
/*
Points to remember
Thread 1 acquires a lock on account A and then sleeps , giving
Thread 2 time to acquire a lock on account B.
Thread 1 waits for account A and Thread 2 waits for account B
Since neither thread releases the lock , both keep waiting for each other creating a deadlock Situation
How to resolve Deadlock- Write better code!
 */