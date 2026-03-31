package com.basics.Arrays;

public class E2 {
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,5};
        System.out.println(arr[1]);
        arr[1]=400;
        System.out.println(arr[1]);
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int x : arr){
            System.out.print(x+ " ");
        }
        System.out.println();
        for (Object o: arr){
            System.out.print(o+" ");
        }
        System.out.println();
        String name= "SNPSU";
        System.out.println(name.length());

    }
}
