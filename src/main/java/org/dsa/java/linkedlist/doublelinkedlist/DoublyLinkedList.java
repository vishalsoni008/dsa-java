package org.dsa.java.linkedlist.doublelinkedlist;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public static void main(String[] args) {

        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();

        doublyLinkedList.insert(2);
        doublyLinkedList.print();

        doublyLinkedList.insertFirst(1);
        doublyLinkedList.print();

        doublyLinkedList.insertLast(3);
        doublyLinkedList.print();

        doublyLinkedList.head = doublyLinkedList.reverseList(doublyLinkedList.head);
        doublyLinkedList.print();

        System.out.println("deleted first element : " + doublyLinkedList.deleteFirst().data);
        doublyLinkedList.print();

        System.out.println("deleted last element : " + doublyLinkedList.deleteLast().data);
        doublyLinkedList.print();

    }

    private void insert(int data) {
        Node node = new Node(data);
        node.data = data;
        if (head == null) {
            head = tail = node;
        }
        tail.next = node;
        node.previous = tail;
        tail = node;
        tail.next = null;
    }

    private void print() {
        Node node = head;

        while (node != null) {
            System.out.print(node.data + " --> ");
            node = node.next;
        }
        System.out.println("null");
    }

    private void insertFirst(int data) {
        Node node = new Node(data);
        node.data = data;

        if (head == null) {
            head = tail = node;
        }

        head.previous = node;
        node.next = head;
        head = node;
        head.previous = null;
    }

    private void insertLast(int data) {
        Node node = new Node(data);
        node.data = data;

        if (head == null && tail == null) {
            head = tail = node;
        }

        tail.next = node;
        node.previous = tail;
        tail = node;
        tail.next = null;
    }

    private Node deleteFirst() {
        if (head == null) {
            throw new RuntimeException("list is null");
        }

        Node deletedNode = head;

        head = head.next;
        head.previous = null;

        return deletedNode;
    }

    private Node deleteLast() {
        if (head == null && tail == null) {
            throw new RuntimeException("head and tail are null");
        }

        Node deletedNode = tail;

        tail = tail.previous;
        tail.next = null;
        return deletedNode;
    }

    private Node reverseList(Node node) {
        tail = tail.previous;
        node = tail;
        return node;
    }

    private static class Node {
        int data;
        Node next;
        Node previous;

        private Node(int data) {
            this.data = data;
        }
    }
}
