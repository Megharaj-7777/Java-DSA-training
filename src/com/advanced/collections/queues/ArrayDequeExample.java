package com.advanced.collections.queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> actions=new ArrayDeque<>();
        actions.addLast("User types A");
        actions.addLast("User types b");
        actions.addLast("User deletes A");
        System.out.println("Undo action:"+actions.removeLast());
        System.out.println("Remaining Actions:"+actions);
    }
}
