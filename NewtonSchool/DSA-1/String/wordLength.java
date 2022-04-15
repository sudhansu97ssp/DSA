package Strings;

import java.util.Scanner;

public class wordLength {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s =s+" ";
        int start=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c==' '){
                String word=s.substring(start,i);
                System.out.println(word + " -> " + word.length());
                start=i+1;
            }
        }
    }
}
