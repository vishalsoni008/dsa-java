package org.dsa.java.array;

public class SecondMaximum {

    public static void main(String[] args) {
        int[] arr = {11, 55, 34, 6, 477, 3, 200};

        SecondMaximum secondMaximum = new SecondMaximum();
        secondMaximum.secondMax(arr);
    }

    int secondMax(int[] arr) {

        int max = 0;
        int sMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                sMax = max;
                max = arr[i];
            } else if (arr[i] > sMax && arr[i] != max) {
                sMax = arr[i];
            }
        }
        System.out.println(sMax);
        return sMax;
    }
}
