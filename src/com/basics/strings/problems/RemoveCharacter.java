package com.basics.strings.problems;

import javax.xml.transform.Result;

public class RemoveCharacter {
    public static void main(String[] args) {
        String str ="programming";
        char ch='r';
        String result="";
        for (int i = 0 ; i<str.length();i++){
            if (str.charAt(i)!=ch){
                result+= str.charAt(i);

            }
        }
        System.out.println(result);
    }
}
