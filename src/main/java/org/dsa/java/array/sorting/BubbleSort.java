package org.dsa.java.array.sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{23, 3523, 6, 857, 9790, 1, 5, 2, 4};

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
