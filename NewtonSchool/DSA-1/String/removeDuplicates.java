package Strings;

import java.util.*;

public class removeDuplicates {
    public static void remDuplicate(String str) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        for (int i = 0; i < str.length(); i++) {
            lhs.add(str.charAt(i));
        }

        for (Character ch : lhs) {
            System.out.print(ch);
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        remDuplicate(s);
    }
}
