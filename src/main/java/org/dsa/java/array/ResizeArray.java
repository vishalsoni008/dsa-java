package org.dsa.java.array;

public class ResizeArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(arr.length);

        ResizeArray resizeArray = new ResizeArray();
        arr = resizeArray.resizeExistArray(arr, arr.length * 2);

        System.out.println(arr.length);
    }

    int[] resizeExistArray(int[] arr, int toBeResize) {
        int[] temp = new int[toBeResize];

        System.arraycopy(arr, 0, temp, 0, arr.length);
        arr = temp;
        return arr;
    }
}
