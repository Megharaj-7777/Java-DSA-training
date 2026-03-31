package com.advanced.dsa.datastructure.linear.Stacks;
public class StringStacks {
    private static final int MAX_SIZE = 10;
    private String[] arr = new String[MAX_SIZE];
    private int top = -1;

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isfull() {
        return top == MAX_SIZE - 1;
    }

    public void push(String data) {
        if (isfull()) {
            System.out.println("Stack overflow.Can't push more elements");
            return;
        }
        arr[++top] = data;
        System.out.println("The string" + data + "was pushed to stack");
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack overflow.Can't pop elements");
            return null;
        }
        String popped = arr[top - 1];
        return popped;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.Can't display anything");
            return;
        }
        System.out.println("The stack elements from top to bottom(LIFO):");
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i] + "");
        }
        System.out.println();
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.No top element:");
            return null;
        }
        return arr[top];
    }
    public int size(){
        return top+1;
    }

    public static void main(String[] args) {
        StringStacks stack=new StringStacks();
        stack.push("Jaguar");
        stack.push("lion");
        stack.push("tiger");
        System.out.println(stack.peek());
        String popped= stack.pop();
        System.out.println("popped"+popped);
        System.out.println("size"+stack.size());
    }

}