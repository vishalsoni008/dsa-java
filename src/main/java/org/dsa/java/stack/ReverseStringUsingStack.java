package org.dsa.java.stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String str = "vishal";

        Stack<Character> stack = new Stack<>();

        for (int i=0;i<str.length();i++){
            stack.push(str.charAt(i));
        }

        while (!stack.isEmpty()){
            System.out.print(stack.peek());
            stack.pop();
        }
    }
}
