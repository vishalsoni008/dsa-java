package org.dsa.java.array.contigoussum;

public class KadanesAlgorithm {
    public static void main(String[] args) {

        int[] arr = new int[] {1,2,1,-19,1,2,3,-3,4};

        System.out.println(maxCongArraySum(arr));
    }

    static int maxCongArraySum(int[] arr){
        int max = 0;
        int end = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            end = end+arr[i];

            if(max<end){
                max = end;
            }
            if(end<0){
                end = 0;
            }
        }

        return max;
    }
}
