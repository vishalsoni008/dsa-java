package org.dsa.java.array.search;

public class SearchElementWithCount {

    public static int search(int[] arr, int target){
        int l = 0;
        int r = arr.length-1;

        while (l<=r){
            int mid = l+(r-l)/2;

            if(arr[mid] == target){
                //return mid;
                return count(arr,mid);
            }
            else if(arr[mid]>target){
                r = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return -1;
    }

    public static int count(int[] arr,int mid){
        int count =1;
        int i = mid-1;
        int j = mid+1;

        while(i>=0 && j<arr.length){
            if(arr[i] == arr[mid]){
                count++;
                i--;
            }
            else {
                break;
            }
            if(arr[j] == arr[mid]){
                count++;
                j++;
            }
            else {
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,2,3,4,5,6,7,8,9};

        System.out.println(search(arr,2));
    }
}
