package Strings;

import java.util.*;

public class checkAnagram {
    public static void isAnagram(String str1,String str2){
        if(str1.length()==str2.length()){

            char [] str1Array=str1.toCharArray();
            char [] str2Array=str2.toCharArray();

            Arrays.sort(str1Array);
            Arrays.sort(str2Array);

            boolean result=Arrays.equals(str1Array,str2Array);
            if(result){
                System.out.println("Is Anagram");
            }else{
                System.out.println("Not An Anagram");
            }
        }else
            System.out.println("Two Strings are not Anagram");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        isAnagram(str1,str2);
    }
}
