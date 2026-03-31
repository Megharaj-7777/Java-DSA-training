package com.basics.strings;

public class ReportGenerator {
    public static void main(String[] args) {
        StringBuilder report = new StringBuilder();
        for (int i=1; i<=5;i++){
            report.append("Student")
                    .append(i)
                    .append(" - Passed\n");


        }
        System.out.println(report);
    }
}