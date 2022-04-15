package Strings;

import java.util.Scanner;

public class reverseString {
   public static String reverseString(String str){
       String reverse="";
       for(int i=str.length()-1;i>=0;i--){
           reverse=reverse+str.charAt(i);
       }
       return reverse;
   }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(reverseString(str));
    }
}
