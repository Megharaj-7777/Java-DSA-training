package com.advanced.dsa.datastructure.nonLinear.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom {
    public static void main(String[] args) {
        Queue<Integer> severity=new PriorityQueue<>();
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("Patient that gets operated first:"+
        severity.poll());
        System.out.println("Patients in queue:"+severity);
    }
}
