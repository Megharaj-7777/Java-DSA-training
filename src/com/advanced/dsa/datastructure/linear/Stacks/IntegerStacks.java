package com.advanced.dsa.datastructure.linear.Stacks;

import java.util.Stack;

public class IntegerStacks {
    public static void main(String[] args) {
        Stack<Integer>integers=new Stack<>();
        integers.push(1);
        integers.push(2);
        integers.push(3);
        integers.push(4);
        System.out.println(integers.peek());
        System.out.println(integers.empty());
        System.out.println(integers.size());

    }

}
