package com.advanced.collections.maps;

import com.advanced.dsa.algos.sorting.InsertionSort;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String >ht=new Hashtable<>();
        ht.put(106,"Ann");
        ht.put(117,"Nav");
        ht.put(128,"Meg");
        ht.put(102,"Pun");
        ht.put(100,"Sin");
        ht.put(99,"Kav");
        for (Map.Entry<Integer,String>entry: ht.entrySet()){
            System.out.println(entry.getKey()+"<->"+entry.getValue());
        }
    }
}
