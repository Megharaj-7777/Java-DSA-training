package com.basics.Arrays;

public class E5 {
    public static void printArray(int[]arr){
        for (int x :arr){
            System.out.print(x+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[]arr ={1,2,3,4,5};
        printArray(arr);

    }
}
