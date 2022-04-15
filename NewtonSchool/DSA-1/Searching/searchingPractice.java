package Searching;

import java.util.Scanner;

public class searchingPractice {
    public static void linearSearch(int [] arr,int  n,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                System.out.println(k);
            }else
                System.out.println(-1);
        }
    }
    public static int binarySearch(int [] arr,int n,int k){
     int l=0;
     int r=arr.length-1;
     while(l<=r) {
         int mid = l + (r - l) / 2;
         if (arr[mid] == k)
             return mid;
         else if (arr[mid] < k)
             l = mid + 1;
         else
             r = mid - 1;
     }     return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(binarySearch(arr,n,k));
    }
}
