package Sorting;

import java.util.Scanner;

public class Insertionsort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int[] insertionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<=n-1;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                swap(arr,j,j-1);
                j--;
            }
            for(int elem : arr){
                System.out.print(elem+" ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        Insertionsort insertsort = new Insertionsort();
        insertsort.insertionSort(arr);
        for(int elem:arr){
            System.out.print(elem+ " ");
        }
    }
}
