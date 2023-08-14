package org.dsa.java.priorityqueue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LeetCode215 {

    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> integers = new PriorityQueue<>(Comparator.reverseOrder());

        for(int i=0;i<nums.length;i++){
            integers.add(nums[i]);
        }
        System.out.println(integers);

        for(int i=1;i<k;i++){
            integers.poll();
        }

        return integers.peek();
    }

    public static void main(String[] args) {
        int arr[] = {3,2,3,1,2,4,5,5,6};
        //k = 4
        int k = 4;

        System.out.println(findKthLargest(arr,k));

    }
}
