package org.dsa.java.array;

public class FindMissingElementFromArray {

    public static int findMissing(int[] arr){
        int n = arr.length;
        System.out.println(n);
        int sum =0;

        sum = ((n+1)*(n+2))/2;

        for(int i =0;i<n;i++){
            sum = sum-arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,5,6};

        System.out.println(findMissing(arr));
    }
}
