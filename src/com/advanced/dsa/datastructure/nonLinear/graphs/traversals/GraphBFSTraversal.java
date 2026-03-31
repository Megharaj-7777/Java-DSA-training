package com.advanced.dsa.datastructure.nonLinear.graphs.traversals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class GraphBFS{
    public List<Integer>bfsGraph(int V,
                                 List<List<Integer>>adjList){
        List<Integer>result=new ArrayList<>();
        boolean[] visited=new boolean[V+1];
        Queue<Integer>q=new LinkedList<>();
        visited[1]=true;
        q.add(1);
        while (!q.isEmpty()){
            int node=q.poll();
            result.add(node);
            for (int neighbour:adjList.get(node)){
                if (!visited[neighbour]){
                    visited[neighbour]=true;
                    q.add(neighbour);
                }
            }
        }
        return result;
    }
}
public class GraphBFSTraversal {
    public static void main(String[] args) {
        int V=5;
        List<List<Integer>>adjList=new ArrayList<>();
        for (int i=0;i<=V;i++){
            adjList.add(new ArrayList<>());
        }
        addEdge(adjList,1,2);
        addEdge(adjList,1,3);
        addEdge(adjList,2,3);
        addEdge(adjList,3,4);
        addEdge(adjList,4,5);
        addEdge(adjList,2,5);
        GraphBFS obj= new GraphBFS();
        List<Integer> result=obj.bfsGraph(V,adjList);
        printBFS(result);

    }
    public static void addEdge(List<List<Integer>>adjList,int u, int v){
        adjList.get(u).add(v);
        adjList.get(v).add(u);
    }
    public static void printBFS(List<Integer>result){
        for (int num:result){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
