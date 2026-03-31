package com.basics.strings;

public class EmailCheck {
    public static void main(String[] args) {
        String email1 = "student@gmail.com";
        String email2 = "worker1_edu";
        if (email1.contains("@") && email1.endsWith(".com")) {
            System.out.println("Valid email");
        } else{
            System.out.println("Invalid email");

        }
        if (email2.contains("@") && email2.endsWith(".com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
        String USN="1SG23EC065";
        System.out.println(USN.startsWith("1SG"));
    }
}
