package Sorting;

import java.util.Scanner;

public class sortPracticeAll {
    public static void bubbleSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void selectionSort(int [] arr){
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[smallest]){
                    swap(arr,j,smallest);
                }
            }
        }
    }

    public static void insertionSort(int [] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j>=1;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }

    public static int [] merge (int [] n1,int [] n2 ){
        int [] mergedarray=new int [n1.length+ n2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<n1.length && j< n2.length){
            if(n1[i]<n2[j]){
                mergedarray[k++]=n1[i++];
            }else{
                mergedarray[k++]=n2[j++];
            }
        }
        while(i< n1.length){
            mergedarray[k++]=n1[i++];
        }
        while(j< n2.length){
            mergedarray[k++]=n2[j++];
        }
        return mergedarray;
    }

    public static int [] mergeSort(int [] arr,int l,int r){
        if(l==r){
            int [] res=new int [1];
            res[0]=arr[l];
            return res;
        }
        int mid=l+(r-l)/2;
        int [] lArr=mergeSort(arr,l,mid);
        int [] rArr=mergeSort(arr,mid+1,r);
        return merge(lArr,rArr);
    }

    public static void quickSort(int [] arr,int l,int r){
        if(l>=r)
            return;
        int pi=partition(arr,l,r);
        quickSort(arr,l,pi-1);
        quickSort(arr,pi+1,r);
    }

    public static int partition(int [] arr,int l,int r){
        int i=l;
        int j=l;
        int pivot=arr[r];
        while(i<=r){
            if(arr[i]<=pivot){
                if(i!=j)
                    swap(arr,i,j);
                j++;
            }
            i++;
        }
        return j-1;
    }

    public static void swap(int [] arr,int i,int minIdx){
        int temp=arr[i];
        arr[i]=arr[minIdx];
        arr[minIdx]=temp;
    }

    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int i;
        for (i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       // bubbleSort(arr);
       // selectionSort(arr);
        //insertionSort(arr);
       // int []res=mergeSort(arr,0,n-1);
        quickSort(arr,0,n-1);
       printArray(arr);
    }
}
