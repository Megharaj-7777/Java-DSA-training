package com.advanced.collections.sets;

import com.advanced.dsa.algos.sorting.InsertionSort;

import java.util.*;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer>scores=new TreeSet<>(Collections.reverseOrder());
        scores.add(200);
        scores.add(100);
        scores.add(300);
        scores.add(400);
        scores.add(200);
        scores.add(500);
        scores.add(450);
        System.out.println("Leader Board stats:"+scores);
    }
}
