package org.dsa.java.linkedlist.singlelinkedlist;

public class FindingLoops {

    Node head;

    public static void main(String[] args) {
        FindingLoops findingLoops = new FindingLoops();
        Node first = new Node(1);
        findingLoops.head = first;

        Node second = new Node(2);
        Node thried = new Node(3);
        Node forth = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);

        first.next = second;
        second.next = thried;
        thried.next = forth;
        forth.next = five;
        five.next = six;
        six.next = thried;

        System.out.println(findingLoops.isLooped());

        System.out.println(findingLoops.startPointOfLoop().data);

        findingLoops.removeLoop();
        System.out.println(findingLoops.isLooped());
    }

    private boolean isLooped() {
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
    }

    private Node startPointOfLoop() {
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;

            if (fastPointer == slowPointer) {
                return getStartElement(slowPointer);
            }
        }
        return null;
    }

    private Node removeLoop() {
        Node fastPointer = head;
        Node slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if (slowPointer == fastPointer) {
                return findAndRemove(slowPointer);
            }
        }
        return null;
    }

    private Node findAndRemove(Node slowPointer) {
        Node pre = null;
        Node temp = head;

        while (temp != slowPointer) {
            pre = slowPointer;
            slowPointer = slowPointer.next;
            temp = temp.next;
        }
        return pre.next = null;
    }

    private Node getStartElement(Node slowPointer) {
        Node temp = head;
        while (temp != slowPointer) {
            temp = temp.next;
            slowPointer = slowPointer.next;
        }
        return temp;
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
}
