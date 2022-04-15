package Arrays;

import java.util.Scanner;

public class rotateArray {
    public static void rotationArray(int[] nums, int k) {

        int n = nums.length;

        k = k % n;

        // reverse the array
        reverse(nums,0,n-1);

        //split reverse the array
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }

    public static void reverse(int[] arr, int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static void printArray(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        rotationArray(arr,k);
        printArray(arr);
    }
}
