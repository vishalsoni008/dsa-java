package org.dsa.java.array.suarraysum;

public class MaximumSubArraySumBruteForse {

    static int subArrayMaxSum(int[] arr, int key) {
        int n = arr.length;

        int max = 0;
        int val = 0;

        for (int i = 0; i <= n - key; i++) {
            val = 0;
            for (int j = i; j < i + key; j++) {
                val = val + arr[j];
            }
            max = Math.max(max, val);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 2, 4, 3, 5, 7, 4, 5, 7, 5};

        int res = subArrayMaxSum(arr, 3);

        System.out.println("brute force approch : " + res);

        // subArrayMaxSum(arr,3);
    }
}
