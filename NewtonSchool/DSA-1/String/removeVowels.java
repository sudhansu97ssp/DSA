package Strings;

import java.util.Scanner;

public class removeVowels {
    public static String remVowel(String str)
    {
        String st= str.replaceAll("[aeiouAEIOU]", "");
    return st;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(remVowel(str));
    }
}
