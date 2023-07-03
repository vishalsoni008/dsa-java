package org.dsa.java.array.sorting;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static int[] mergeArrays(int[] arr, int[] arr2) {
        int n = arr.length;
        int m = arr2.length;

        int[] op = new int[n + m];
        int i = 0, j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr[i] < arr2[j]) {
                op[k] = arr[i];
                i++;
            } else {
                op[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < n) {
            op[k] = arr[i];
            i++;
            k++;
        }
        while (j < m) {
            op[k] = arr2[j];
            j++;
            k++;
        }
        return op;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7};
        int[] arr2 = new int[]{2, 4, 6};

        Arrays.stream(mergeArrays(arr, arr2)).forEach(System.out::println);
    }
}
