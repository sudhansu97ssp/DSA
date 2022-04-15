package Sorting;

import java.util.Scanner;

public class MergeSorted {
    public static void merge(int [] arr1,int n1,int [] arr2,int n2,int [] arr3){
        int i=0;
        int j=0;
        int k=0;
        while(i<n1 && j< n2){
            if(arr1[i]<arr2[j]){
                arr3[k++]=arr1[i++];
            }else
                arr3[k++]=arr2[j++];
        }
        while (i< n1){
            arr3[k++]=arr1[i++];
        }
        while(j< n2){
            arr3[k++]=arr2[j++];
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int [] brr=new int [m];
        for(int j=0;j<m;j++){
            brr[j]=sc.nextInt();
        }
        int [] arr1=new int [n+m];
        merge(arr,n,brr,m,arr1);
        for(int i=0;i<n+m;i++)
            System.out.print(arr1[i]+" ");

    }
}
