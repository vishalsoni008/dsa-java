package org.dsa.java.array;

public class MoveZeroToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 43, 0, 23, 6, 0};

        MoveZeroToEnd moveZeroToEnd = new MoveZeroToEnd();
        moveZeroToEnd.moveZeroToEnd(arr);
    }

    void moveZeroToEnd(int[] arr) {
        int zeroPointer = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[zeroPointer] == 0) {
                int temp = arr[i];
                arr[i] = arr[zeroPointer];
                arr[zeroPointer] = temp;
            }
            if (arr[zeroPointer] != 0) {
                zeroPointer++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
