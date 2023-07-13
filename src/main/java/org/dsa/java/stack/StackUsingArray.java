package org.dsa.java.stack;

public class StackUsingArray {
    int top;
    int capacity;
    int[] arr;

    public StackUsingArray(int length){
        top =-1;
        capacity = length;
        arr = new int[capacity];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == capacity;
    }

    public int push(int value){
        if(isFull()){
            throw new StackOverflowError("stack is full");
        }
        else {
            arr[++top] = value;
            return value;
        }
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        else{
            int old = arr[top];
            top--;
            return old;
        }
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        else {
            return arr[top];
        }
    }

    public static void main(String[] args) {

        StackUsingArray stackUsingArray = new StackUsingArray(3);

        System.out.println(stackUsingArray.peek());

        System.out.println(stackUsingArray.push(12));

        System.out.println(stackUsingArray.peek());

        System.out.println(stackUsingArray.pop());

        System.out.println(stackUsingArray.peek());

        System.out.println(stackUsingArray.isEmpty());

        System.out.println(stackUsingArray.push(12));
        System.out.println(stackUsingArray.push(13));
        System.out.println(stackUsingArray.push(14));
        //System.out.println(stackUsingArray.push(15));


    }

}
