package Strings;

import java.util.Scanner;

public class findPalindrome {
    public static void isPalindrome(String str){
        boolean isPalindrome=true;
        for(int i=0;i<str.length();i++){
            char begin=str.charAt(i);
            char end=str.charAt(str.length()-i-1);
            if(begin!=end){
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome==true){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        isPalindrome(str);
    }
}
