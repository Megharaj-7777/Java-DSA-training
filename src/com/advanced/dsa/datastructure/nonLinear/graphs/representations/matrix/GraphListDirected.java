package com.advanced.dsa.datastructure.nonLinear.graphs.representations.matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GraphListDirected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        List<List<Integer>> adjacencyList=new ArrayList<>();
        for (int i=0; i<=n;i++){
            adjacencyList.add(new ArrayList<>());
        }
        for (int i=0;i<m;i++){
            int u=sc.nextInt();
            int v=sc.nextInt();
            adjacencyList.get(u).add(v);
        }
        for (int i=1;i<=n;i++){
            System.out.println("Node:"+i+",List of Neighbours:->");
            for (int neighbour: adjacencyList.get(i)){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
