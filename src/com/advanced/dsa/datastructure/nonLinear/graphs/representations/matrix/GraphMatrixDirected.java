package com.advanced.dsa.datastructure.nonLinear.graphs.representations.matrix;

import java.util.Scanner;

public class GraphMatrixDirected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][] adjacencymatrix=new int[n+1][n+1];
        for (int i=0;i<n;i++){
            int u =sc.nextInt();
            int v=sc.nextInt();
            adjacencymatrix[u][v]=1;
        }
        for (int i=1; i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print(adjacencymatrix[i][j]+ " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
