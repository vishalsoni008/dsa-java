package org.dsa.java.array.sorting;

import java.util.Arrays;

public class MergeSort {

    void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        for(int i=0;i<n1;i++){
            left[i] = arr[l+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = arr[mid+1+i];
        }

        int i=0,j=0,k=l;

        while(i<left.length && j<right.length){
            if(left[i] < right[j]){
                arr[k] = left[i];
                i++;
            }
            else{
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k] = left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    void sort(int[] arr,int l, int r){

        if(l<r){
            int mid = l+(r-l)/2;

            sort(arr, l, mid);
            sort(arr,mid+1,r);

            merge(arr, l, mid, r);
        }
    }

    void print(int[] arr){
        Arrays.stream(arr).forEach(i -> System.out.print(i+" "));
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3,1,4,2};

        MergeSort mergeSort = new MergeSort();

        mergeSort.sort(arr,0,arr.length-1);
        mergeSort.print(arr);

    }
}
