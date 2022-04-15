package Arrays;

import java.util.Scanner;
import java.util.*;

public class pairSum {
    public static String pairSumNum(int [] arr,int X){
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(l<r){
            if(arr[l]+arr[r]==X){
                return (arr[l] +","+arr[r]);
            }else if(arr[l]+arr[r]>X){
                r--;
            }else{
                l++;
            }
        }
        return ("-1");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int X=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
       System.out.println(pairSumNum(arr,X));
    }
}
