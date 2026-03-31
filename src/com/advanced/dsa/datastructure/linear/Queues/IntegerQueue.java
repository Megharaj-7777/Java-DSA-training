package com.advanced.dsa.datastructure.linear.Queues;

import java.util.Queue;

public class IntegerQueue {
    private static final int MAX_SIZE=5;
    private int[] arr=new int[MAX_SIZE];
    private int front;
    private int rear;
    IntegerQueue(){
        front=rear=-1;
    }
    public boolean isEmpty(){
        return (front==-1&&rear==-1);
    }
    public boolean isfull(){
        return rear==MAX_SIZE-1;
    }
    public void enqueue(int data){
        if (isfull()){
            System.out.println("cant add elements.");
            return;
        }
        if (isEmpty()){
            front=rear=0;
        }
        else {
            rear++;
        }
        arr[rear]=data;
        System.out.println("Enqueued"+data+"to the queue.");
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty.Can't remove data.");
            return;
        } else if (front==rear) {
            front=rear=-1;
        }
        else{
            front++;
        }
    }
    public int getFront(){
        if(isEmpty()){
            System.out.println("EMpty queue.No front element");
            return -1;
        }
        return arr[front];
    }
    public int getRear() {
        if (isEmpty()) {
            System.out.println("EMpty queue.No front element");
            return -1;
        }
        return arr[rear];
    }
    public int size(){
        if (isEmpty()){
            return 0;
        }
        return rear-front+1;
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Queue is empty.Nothing to display");
            return;
        }
        System.out.println("the queue elements in FIFO order");
        for (int i=front;i<=rear;i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        IntegerQueue queue=new IntegerQueue();
        int[]arr={1,2,3,4,5,6,7,8,9,10};
        for (int x:arr){
            queue.enqueue(x);
        }
        queue.display();
        System.out.println("size"+queue.size());
        System.out.println("Front Element"+queue.getFront());
        System.out.println("Rear element"+queue.getRear());
        System.out.println(queue.isEmpty());
    }
}