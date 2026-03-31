package com.advanced.dsa.datastructure.nonLinear.graphs.algorithms.toposort.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopologicalSortDFS {
    private void dfs(int node, int[]vis, Stack<Integer>st,
                     ArrayList<ArrayList<Integer>>adj){
        vis[node]=1;
        for (int neighbour: adj.get(node)){
            if (vis[neighbour]==0){
                dfs(neighbour,vis,st,adj);
            }
        }
        st.push(node);
    }
    public List<Integer> topoSort(int V,ArrayList<ArrayList<Integer>>adj){
        int[] vis=new int[V];
        Stack<Integer>st=new Stack<>();
        for (int i=0;i<V;i++){
            if (vis[i]==0){
                dfs(i,vis,st,adj);
            }
        }
        List<Integer>ans=new ArrayList<>();
        while (!st.isEmpty()){
            ans.add(st.pop());
        }
        return ans;
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
        TopologicalSortDFS obj=new TopologicalSortDFS();
        List<Integer>ans=obj.topoSort(V,adj);
        System.out.println("The toposort Lineatr ordering u-->v is;");
        for (int node:ans){
            System.out.print(node+" ");
        }
        System.out.println();
    }
}
