package com.basics.strings;

public class DifferenceDemo {
    public static void main(String[] args) {
        String s ="Java";
        System.out.println("String before"+ s.hashCode());
        s=s+"DSA";
        System.out.println("String after"+ s.hashCode());
        StringBuilder builder = new StringBuilder("Java");
        System.out.println("Builder before:"+ builder.hashCode());
        builder.append("DSA");
        System.out.println("Builder after:"+ builder.hashCode());
    }
}
