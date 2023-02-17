package org.dsa.java.array;

public class ResizeArray {

    int[] resizeExistArray(int[] arr, int toBeResize){
        int[] temp = new int[toBeResize];

        for(int i=0;i<arr.length;i++){
            temp[i] = arr[i];
        }
        arr = temp;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        System.out.println(arr.length);

        ResizeArray resizeArray = new ResizeArray();
        arr = resizeArray.resizeExistArray(arr, arr.length*2);

        System.out.println(arr.length);
    }
}
