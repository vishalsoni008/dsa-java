package org.dsa.java.linkedlist.doublelinkedlist;

public class DoublyLinkedList {

    private static class Node{
        int data;
        Node next;
        Node previous;
    }

    private Node head;
    private Node tail;

    private DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }


    public static void main(String[] args) {

    }
}
