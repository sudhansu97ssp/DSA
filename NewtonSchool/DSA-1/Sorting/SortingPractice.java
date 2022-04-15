package Sorting;

import java.util.Scanner;

public class SortingPractice {
    static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int i = (l - 1);
        for (int j = l; j <= r - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, r);
        return (i + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

    static void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int pi = partition(arr, l, r);
            quickSort(arr, l, pi - 1);
            quickSort(arr, pi + 1, r);
        }
    }

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, size - 1);
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
