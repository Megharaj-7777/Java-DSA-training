package com.basics.strings;

public class StringMethod {
    public static void main(String[] args) {
        String str="Tripillar Solutions";
        System.out.println("Length"+str.length());
        System.out.println("Char at index 2:"+ str.charAt(2));
        System.out.println("Char at last index: "+ str.charAt(str.length()-1));
        System.out.println("Uppercase: "+ str.toUpperCase());
        System.out.println("Lowercase: "+ str.toLowerCase());
        System.out.println("Substring"+ str.substring(0,11));
        System.out.println("Equals(Case does'nt matter):"+str.equalsIgnoreCase("tripillar Solutions"));
        String jumbled = "Sys1Is1Working";
        String[] words = jumbled.split("1");
        System.out.println(words[2]);
        String name = "          Likitha B            ";
        System.out.println(name.trim());
        char[] letters={'M','A','L','L','I'};
        String word = new String(letters);
        System.out.println(word);
    }
}

