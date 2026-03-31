package com.basics.exception;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class E6 {
    public static void main(String[] args) throws Exception{
        BufferedReader br= null;
        String str;
        try {
            br= new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the data");
            str= br.readLine();
            System.out.println(str);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            br.close();
        }
    }
}
