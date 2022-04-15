package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class allSorting {
    public static void bubbleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //if(arr[j]<arr[j+1])     //ascending order
                    swap(arr,j,j+1);

                    //swap(arr,j+1,j);       //descending order bubble sort
                    //swap
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void selectionSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
               // if(arr[j]<arr[smallest]){     //ascending order selection sort
                   swap(arr,j,smallest);
                if(arr[j]>arr[smallest]){
                 //   swap(arr,smallest,j);  //Descending order selection sort
                }
            }
        }
    }

    public static void insertionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){          //Ascending order insertion sort
                 //   if(arr[j]>arr[j-1])     //Descending order insertion sort

                    //swap(arr,j-1,j)     //Descending order insertion sort
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static int [] merge(int [] n1,int [] n2){
        int i=0;
        int j=0;
        int k=0;
        int [] arr=new int [n1.length+n2.length];
        while(i<n1.length && j< n2.length) {
            if (n1[i] < n2[j]) {
                arr[k++] = n1[i++];
            } else {
                arr[k++] = n2[j++];
            }
        }
            while(i<n1.length){
                arr[k++]=n1[i++];
            }
            while(j<n2.length){
                arr[k++]=n2[j++];
            }
            return arr;
    }

   public static int [] mergeSort(int[] arr,int l,int r){
        if(l==r){
            int [] res=new int [1];
            res[0]=arr[l];
            return res;
        }
       int mid=(l+r)/2;
       int [] lArr= mergeSort(arr,l,mid);
       int [] rArr= mergeSort(arr,mid+1,r);
        return merge(lArr,rArr);
   }



    public static void swap(int[] arr, int i, int minIdx) {
        int temp=arr[i];
        arr[i]=arr[minIdx];
        arr[minIdx]=temp;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
            bubbleSort(arr);
       // selectionSort(arr);
       // insertionSort(arr);
        //int [] res=mergeSort(arr,0,n-1);
         //   System.out.println(Arrays.toString(res));
        }
    }
