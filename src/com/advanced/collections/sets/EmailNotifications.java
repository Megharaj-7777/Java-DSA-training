package com.advanced.collections.sets;

import java.util.HashSet;

public class EmailNotifications {
    public static void main(String[] args) {
        HashSet<String>emailqueue=new HashSet<>();
        emailqueue.add("a@gmail.com");
        emailqueue.add("b@gmail.com");
        emailqueue.add("a@gmail.com");
        emailqueue.add("a@gmail.com");
        emailqueue.add("c@gmail.com");
        emailqueue.add("d@gmail.com");
        emailqueue.add("c@gmail.com");
        System.out.println("Emails to send:"+emailqueue);
        System.out.println("Unique Emails :"+emailqueue.size());
    }
}
