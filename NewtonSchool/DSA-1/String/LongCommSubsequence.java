package Strings;

import java.util.Scanner;

public class LongCommSubsequence {
    public static int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        int[][] t = new int[m + 1][n + 1];
        for (int i = 1; i < t.length; i++) {
            for (int j = 1; j < t[0].length; j++) {
                if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                    t[i][j] = 1 + t[i - 1][j - 1];
                } else {
                    t[i][j] = Math.max(t[i - 1][j], t[i][j - 1]);
                }
            }
        }
        return t[m][n];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        System.out.println(longestCommonSubsequence(s1,s2));
    }
}
