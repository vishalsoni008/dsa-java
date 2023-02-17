package org.dsa.java.array;

public class RemoveEven {

    //time complexity is O(n)
    public int[] oddPrint(int[] arr){
        int odd = 0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2 != 0){
                odd++;
            }
        }

        int[] oddArr = new int[odd];
        int index = 0;

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2 != 0){
                oddArr[index] = arr[i];
                index++;
            }
        }

        for(int i=0;i<oddArr.length;i++){
            System.out.println(oddArr[i]);
        }

        return oddArr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};

        RemoveEven removeEven = new RemoveEven();
        removeEven.oddPrint(arr);
    }
}
