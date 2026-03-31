package com.advanced.dsa.datastructure.nonLinear.heaps;


import java.util.Collections;
import java.util.PriorityQueue;

public class kthSamllestlargest {
    public static int KthSmallest(int[]arr,int k) {
        PriorityQueue<Integer>maxHeap=new
                PriorityQueue<>(Collections.reverseOrder());
        for(int x:arr){
            maxHeap.add(x);
            if (maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();

    }
    public static int KthLargest(int[]arr,int k){
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        for (int x:arr){
            minHeap.add(x);
            if (minHeap.size()>k){
                minHeap.poll();
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[]arr={3,2,4,7,5,};
        int k=3;
        System.out.println(KthSmallest(arr,k));
        System.out.println(KthLargest(arr,k));

    }
}