package org.dsa.java.array.suarraysum;

public class MaximumSumSlidingWindow {

    public static int subArrayMaxSumSlidingWindow(int[] arr, int k){
        int n = arr.length;
        int sum = 0;

        for(int i=0;i<k;i++){
            sum = sum+arr[i];
        }
        int max=0;

        for(int i=k;i<n;i++){
            sum = sum+arr[i] - arr[i-k];
            max = Math.max(max,sum);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,2,4,3,5,7,4,5,7,5};

        int res = subArrayMaxSumSlidingWindow(arr, 3);

        System.out.println("sliding window : "+res);
    }
}
