package Strings;

import java.util.Scanner;

public class BinaryCount {
    public static int countStrings(int n){
        int [] arr=new int [n];
        int [] brr=new int [n];
        arr[0]=brr[0]=1;
        for(int i=1;i<n;i++){
            arr[i]=arr[i-1]+brr[i-1];
            brr[i]=arr[i-1];
        }
        return arr[n-1]+brr[n-1];
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(countStrings(n));
    }
}
