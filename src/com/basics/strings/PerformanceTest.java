package com.basics.strings;

public class PerformanceTest {
    public static void main(String[] args) {
        long startTime= System.currentTimeMillis();
        StringBuilder builder=new StringBuilder("Java");
        for (int i=1;i<10000000;i++){
            builder.append("DSA");
        }
        System.out.println("BuilderTime:"+(System.currentTimeMillis() - startTime)+"ms");
        StringBuffer buffer=new StringBuffer("Java");
        for (int i=1;i<10000000;i++) {
            buffer.append("DSA");
        }
        System.out.println("BufferTime:"+(System.currentTimeMillis() - startTime)+"ms");

    }
}
