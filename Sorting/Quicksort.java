package Sorting;
import java.util.*;

/*
    Quick sort has 3 parts : first find pivot,
                             second insert pivot at sorted pos
                             third recursive call on left and right
* */

public class Quicksort {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void qs(int[] arr,int low,int high){
        if(low<high){
            int pivot = partition(arr,low,high);
            qs(arr,low,pivot-1);
            qs(arr,pivot+1,high);
        }
    }
    public static int partition(int[]arr,int low,int high){
        int pivot=arr[low];
        int i=low+1;
        int j=high;
        while(i<=j){
           while(i<=high && arr[i] <= pivot){
               i++;
           }
           while(j>=low && arr[j]>pivot) {
               j--;
           }
           if(i<j){
               swap(arr,i,j);
           }
        }
        swap(arr,low,j);
        return j;
    }
    public static int[] quicksort(int[] arr){
        qs(arr,0,arr.length-1);
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans= quicksort(arr);
        for(int elem:ans){
            System.out.print(elem+" ");
        }
    }
}
