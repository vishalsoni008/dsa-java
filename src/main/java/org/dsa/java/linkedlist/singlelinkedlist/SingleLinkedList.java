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
    public void insertAtSpecificIndex(int data, int index){
        ListNode node = new ListNode(data);
        node.data = data;

        if(index == 1){
            node.next = head;
            head = node;
        }
        else {
            int counter = 1;
            ListNode pre = head;

            while (counter< index-1){
                counter++;
                pre = pre.next;
            }
            ListNode current = pre.next;
            node.next = current;
            pre.next = node;
        }
    }
//    public void deleteStart(){
//
//        head = head.next.next;
//    }

    public ListNode deleteStart(){
        if(head == null){
            return null;
        }
        ListNode deletedNode = head;
        head = head.next;
        deletedNode.next = null;

        return deletedNode;
    }

    public ListNode deleteLast() {
        if(head == null || head.next == null){
            return null;
        }

        ListNode current = head;
        ListNode pre = null;

        while (current.next != null){
            pre = current;
            current = current.next;
        }
        pre.next = null;
        return current;
    }

    public ListNode deleteSpecificIndex(int index) {
        ListNode current = null;
        if (index == 1) {
            deleteStart();
        } else {
            ListNode pre = head;
            int count = 1;

            while (count < index - 1) {
                pre = pre.next;
                count++;
            }
            current = pre.next;
            pre.next = current.next;
        }
        return current;
    }

    public boolean findElement(int data){
        ListNode current = head;

        while (current != null){
            if(current.data == data){
                return true;
            }
            current = current.next;
        }
        return false;
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

        singleLinkedList.insertAtSpecificIndex(12,2);
        singleLinkedList.print();

        System.out.println("give element present or not : "+singleLinkedList.findElement(3));

        System.out.println("first element deleted from linked list : "+singleLinkedList.deleteStart().data);
        singleLinkedList.print();

        System.out.println("last element deleted from linked list : "+singleLinkedList.deleteLast().data);
        singleLinkedList.print();

        System.out.println("specific element delete from linked list : "+singleLinkedList.deleteSpecificIndex(3).data);
        singleLinkedList.print();
    }
}
