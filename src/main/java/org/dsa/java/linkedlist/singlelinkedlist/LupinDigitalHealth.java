package org.dsa.java.linkedlist.singlelinkedlist;

public class LupinDigitalHealth {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    Node head;

    public void insert(int data){
        Node node = new Node(data);
        node.data = data;

        if(head == null){
            head = node;
        }
        else{
            Node node1 = head;

            while (node1.next != null){
                node1 = node1.next;
            }
            node1.next = node;
        }
    }

    public void lastThired(){
        Node fp = head.next.next;
        Node sp = head;

        while (fp != null && fp.next!=null){
            fp = fp.next;
            sp = sp.next;
        }

        System.out.println(sp.data);
    }

    public void print(){
        Node node = head;
        while (node.next != null){
            System.out.print(node.data+" -> ");
            node = node.next;
        }
        System.out.println(node.data);
    }

    public static void main(String[] args) {

        LupinDigitalHealth lupinDigitalHealth = new LupinDigitalHealth();

        for(int i=1;i<=10;i++){
            lupinDigitalHealth.insert(i);
        }

        lupinDigitalHealth.print();

        lupinDigitalHealth.lastThired();
    }
}
