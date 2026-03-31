package com.advanced.dsa.datastructure.nonLinear.trees.traversals.dfs;

public class Node {
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=this.right=null;
    }
    public static void preOrder(Node root){
        if (root!=null){
            System.out.print(root.data+" ");
            preOrder(root.left);
            preOrder(root.right);
        }

    }
    public static void inOrder(Node root){
        if (root!=null){
            inOrder(root.left);
            System.out.print(root.data+" ");
            inOrder(root.right);
        }

    }
    public static void postOrder(Node root){
        if (root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+" ");
        }

    }


    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.right.left=new Node(9);
        root.right.right.left=new Node(15);
        System.out.println("PreOrder Traversal");
        preOrder(root);
        System.out.println();
        System.out.println("InOrder Traversal");
        inOrder(root);
        System.out.println();
        System.out.println("PostOrder Traversal");
        postOrder(root);
        System.out.println();

    }
}
