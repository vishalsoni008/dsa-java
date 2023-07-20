package org.dsa.java.strings;

public class PalindromeString {
    public static boolean isPal(String str){
        int i=0;
        int j= str.length()-1;

        while (i<=j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s = "aviva";

        System.out.println(isPal(s));

    }
}
