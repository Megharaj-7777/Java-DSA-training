package com.advanced.collections.maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class APILogs {
    public static void main(String[] args) {
        Map<String,String>logs=new LinkedHashMap<>();
        logs.put("2","Signup");
        logs.put("1","Login");
        logs.put("4","Browse Insta reels");
        logs.put("3","Scroll");
        logs.put("5","Logout");
        System.out.println("APILogs:"+logs);

    }
}
