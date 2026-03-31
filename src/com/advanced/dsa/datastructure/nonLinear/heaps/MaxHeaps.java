package com.advanced.dsa.datastructure.nonLinear.heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeaps {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap=new PriorityQueue<>(Collections.reverseOrder());
        maxheap.add(8);
        maxheap.add(6);
        maxheap.add(4);
        maxheap.add(2);
        maxheap.add(1);
        maxheap.add(9);
        maxheap.add(7);
        maxheap.add(5);
        System.out.println(maxheap);
    }
}
