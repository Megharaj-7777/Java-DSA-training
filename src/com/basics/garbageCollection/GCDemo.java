package com.basics.garbageCollection;

public class GCDemo {
    public static void main(String[] args) {
        GCDemo obj=new GCDemo();
        obj = null;
        System.gc();
        /*
        nowadays the gc() method is automatically
        called after program execution by the object class
         */
        System.out.println("GC Requested");
    }
}
