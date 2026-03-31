package com.advanced.collections.base;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Liveorders {
    public static void main(String[] args) {
        Collection<String>liveOrders=new ArrayList<>();
        liveOrders.add("ORD101");
        liveOrders.add("ORD102");
        liveOrders.add("ORD103");
        System.out.println("ORD101 Available? Exists?"+liveOrders.contains("ORD101"));
        System.out.println("Live Orders:"+liveOrders.remove("ORD101"));
        System.out.println("Live Orders:"+liveOrders.contains("ORD101"));
    }
}
