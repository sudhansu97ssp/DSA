package Strings;

import java.util.Scanner;

public class compressString {
    public static String compress(String str){
        String str2="";



        int i=0;
        while(i< str.length()){
            int count=1;
            int j=i+1;
            while(j<str.length() && str.charAt(i)==str.charAt(j)){
                count++;
                j++;
            }
            str2+=Character.toString(str.charAt(i))+Integer.toString(count);
            i=j;
        }
        return str2;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(compress(s));
    }
}
