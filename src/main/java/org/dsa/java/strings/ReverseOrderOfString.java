package org.dsa.java.strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseOrderOfString {

    public static String reverseOrder(String s){
        String str ="";
        String op = "";

        List<String> stringList = new ArrayList<>();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) !=' '){
                str = str+s.charAt(i);

            }
            else {
                stringList.add(str);
                str = "";
            }
        }
        stringList.add(str);
        System.out.println(stringList);
        for(int i=stringList.size()-1;i>=0;i--){
            op = op+" "+stringList.get(i);
        }

        return op.trim();
    }

    public static void main(String[] args) {
        String s = "I am vishal";

        System.out.println(reverseOrder(s));
    }
}
