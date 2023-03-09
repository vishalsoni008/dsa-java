package org.dsa.java.stack;

public class StackUsingArray {
    int arr[];
    int top;
    int max;

    public StackUsingArray(){
        max = 15;
        arr = new int[max];
        top = -1;
    }
    boolean isEmpty(){
        if (top<0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        StackUsingArray stackUsingArray =  new StackUsingArray();

        System.out.println(stackUsingArray.isEmpty());
    }
}
