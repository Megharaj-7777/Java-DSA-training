package com.advanced.dsa.datastructure.nonLinear.heaps;

import java.util.PriorityQueue;

public class MinHeaps {
    public static void main(String[] args) {
        PriorityQueue<Integer>minheap=new PriorityQueue<>();
        minheap.add(8);
        minheap.add(6);
        minheap.add(4);
        minheap.add(2);
        minheap.add(1);
        minheap.add(9);
        minheap.add(7);
        minheap.add(5);
        System.out.println(minheap);
    }
}
