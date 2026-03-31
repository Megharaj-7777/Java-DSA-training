package com.advanced.collections.sets;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,5,2,5,7,5,3,8,1};
        System.out.println(Arrays.toString(arr));
        Set<Integer>uniqueElements=new HashSet<>();
        for (int x:arr){
            uniqueElements.add(x);
        }
        System.out.println("Unique elements:"+ uniqueElements);
        Set<Integer>nonDuplicates=new HashSet<>();
        nonDuplicates.addAll(Arrays.asList(1,2,4,3,6,5));
        System.out.println(nonDuplicates);
    }
}
