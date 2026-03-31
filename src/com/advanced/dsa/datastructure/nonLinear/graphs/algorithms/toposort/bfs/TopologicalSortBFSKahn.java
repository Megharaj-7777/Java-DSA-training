package com.advanced.dsa.datastructure.nonLinear.graphs.algorithms.toposort.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TopologicalSortBFSKahn {
    public List<Integer>toposort(int V, ArrayList<ArrayList<Integer>>adj){
        int[] inDegree=new int[V];
        for (int i = 0;i<V;i++){
            for (int neighbour:adj.get(i)){
                inDegree[neighbour]++;
            }
        }
        Queue<Integer>q=new LinkedList<>();
        for (int i=0;i<V;i++){
            if (inDegree[i]==0){
                q.add(i);
            }
        }
        List<Integer>topo=new ArrayList<>();
        while (!q.isEmpty()){
            int node=q.poll();
            topo.add(node);
            for (int neighbour:adj.get(node)){
                inDegree[neighbour]--;
                if(inDegree[neighbour]==0){
                    q.add(neighbour);
                }
            }
        }
        return topo;
    }

    public static void main(String[] args) {
        int V=6;
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for (int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);
        TopologicalSortBFSKahn obj=new TopologicalSortBFSKahn();
        List<Integer>ans=obj.toposort(V,adj);
        System.out.println("The toposort Lineatr ordering(BFS) u-->v is;");
        for (int node:ans){
            System.out.print(node+" ");
        }
        System.out.println();
    }
}
