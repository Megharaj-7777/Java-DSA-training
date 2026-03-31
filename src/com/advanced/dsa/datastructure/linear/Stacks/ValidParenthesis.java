package com.advanced.dsa.datastructure.linear.Stacks;

import java.util.Stack;

public class ValidParenthesis {
    static boolean isValidParentesis(String s){
        Stack<Character> stack=new Stack<>();
        for (char c:s.toCharArray()){
            if (c=='{'||c=='['||c=='('){
                stack.push(c);
            }else{
                if ( stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if (c=='}'&& top !='{')return false;
                if (c==']'&& top !='[')return false;
                if (c==')'&& top !='(')return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s1="{[()])}";
        String s2="{[}](}";
        String s3="{{[[";
        System.out.println(s1+"->"+(isValidParentesis(s1)?"Valid":"Invaid"));
        System.out.println(s2+"->"+(isValidParentesis(s2)?"Valid":"Invaid"));
        System.out.println(s3+"->"+(isValidParentesis(s3)?"Valid":"Invaid"));


    }
}
