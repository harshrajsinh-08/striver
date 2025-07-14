package Sorting;

import java.util.Scanner;

public class Selectionsort {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] selectsort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) { // ✅ loop till n-1
            int minIndex = i;             // ✅ store index
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;         // ✅ update index if smaller found
                }
            }
            swap(arr, i, minIndex);
            for(int elem : arr){
                System.out.print(elem+" ");
            }
            System.out.println();// ✅ swap current with smallest
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Selectionsort sort = new Selectionsort();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans[] = sort.selectsort(arr);
        for (int elem : ans) {
            System.out.print(elem + " ");
        }
        sc.close();
    }
}