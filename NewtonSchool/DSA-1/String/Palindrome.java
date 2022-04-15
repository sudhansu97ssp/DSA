package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void isPalindrome(String str){
        boolean ispalindrome=true;
        for(int i=0;i<str.length();i++){
            char begin=str.charAt(i);
            char end=str.charAt(str.length()-i-1);
            if(begin!=end){
                ispalindrome=false;
                break;
            }
        }
       if(ispalindrome==true){
           System.out.println("String is Palindrome");
       }else{
           System.out.println("String is not a Palindrome");
       }
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        isPalindrome(str);
    }
}
