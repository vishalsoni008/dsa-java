package org.dsa.java.linkedlist.singlelinkedlist;

public class SingleLinkedList {

    private ListNode head;

    protected static class ListNode{
        int data;
        ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data){
        ListNode node = new ListNode(data);
        node.data = data;

        if(head == null){
            head = node;
        }

        head.next = node;

    }
    public void print(){
        ListNode node = head;

        while (node != null){
            System.out.print(node.data+" ---> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public int size(){
        if (head == null){
            return 0;
        }
        int count = 0;
        ListNode node = head;

        while (node != null){
            count++;
            node = node.next;
        }
        return count;
    }

    public void insertFirst(int data){
        ListNode node = new ListNode(data);
        node.data = data;

        if(head != null){
            node.next = head;
        }
        head = node;
    }

    public void insertLast(int data){
        ListNode node = new ListNode(data);
        node.data = data;

        ListNode current  = head;

        if(head == null){
            head = node;
        }

        while (current.next != null){
            current = current.next;
        }
        current.next = node;
    }
    public static void main(String[] args) {

        SingleLinkedList singleLinkedList = new SingleLinkedList();

        singleLinkedList.insert(2);
        singleLinkedList.insert(3);

        singleLinkedList.print();
        System.out.println("size of linked list "+singleLinkedList.size());

        singleLinkedList.insertFirst(1);
        singleLinkedList.print();
        System.out.println("size of linked list "+singleLinkedList.size());

        singleLinkedList.insertLast(4);
        singleLinkedList.print();
        System.out.println("size of linked list "+singleLinkedList.size());
    }
}
