package com.basics.Arrays;

public class E1 {
    public static void main(String[] args) {
        //Method 1
        int []arr;
        arr=new int[5];//Memory allocation of 20 bytes
        System.out.println(arr[4]);
        // If we don't provide any values,
        // the JVM uses " Fallback Mechanism"
        // it uses the default values of that particular data type
        // int ->0, float->0.0, String -> null,boolean -> false , char-> null
        //Declaration and memory allocation in same line
        int []arr2 = new int[5];
        System.out.println(arr2[4]);
        int[] arr3= {2,8,-1,4,6};
        System.out.println(arr3[3]);
    }
}
