package org.dsa.java.array.search;

public class BinarySearchUsingRecussion{

    public static  int search(int[] arr, int l, int r, int target){
        if(l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                return search(arr, l, mid-1, target);
            }
            else{
                return search(arr, mid+1, r, target);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8};

        System.out.println(search(arr,0, arr.length-1,6));
    }
}
