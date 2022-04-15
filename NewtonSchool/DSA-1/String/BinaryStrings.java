package Strings;

import java.util.Scanner;

public class BinaryStrings {
    public static void stringsForm(int k,char[] arr,int n){
        if(n==k){
            arr[n]=' ';
            System.out.print(arr);
            System.out.print(" ");
            return;
        }
        if(arr[n - 1] == '1'){
            arr[n]='0';
            stringsForm(k,arr,n+1);
        }
        if(arr[n-1]=='0'){
            arr[n]='1';
            stringsForm(k,arr,n+1);
            arr[n]='0';
            stringsForm(k,arr,n+1);
        }
    }
    public static void printStrings(int n){
        if(n<=0){
            return;
        }
        char [] a=new char[n+1];
        a[0]='0';
        stringsForm(n,a,1);
        a[0]='1';
        stringsForm(n,a,1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printStrings(n);
    }
}
