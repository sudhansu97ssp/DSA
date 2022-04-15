package Strings;

import java.util.*;

public class remDupliSorting {
    static String removeDupsSorted(String str)
    {
        int resind = 1, ipind = 1;
        char arr[] = str.toCharArray();
        while (ipind != arr.length)
        {
            if(arr[ipind] != arr[ipind-1])
            {
                arr[resind] = arr[ipind];
                resind++;
            }
            ipind++;

        }

        str = new String(arr);
        return str.substring(0,resind);
    }

    static String removeDups(String str)
    {
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);
        return removeDupsSorted(str);
    }
public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
    System.out.println(removeDups(s));
}
}
