package Sorting;
import java.util.Arrays;
import java.util.Scanner;

public class Bubblesort {
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int[] bubble(int[] arr){
        int n= arr.length;
        for(int i=n-1;i>=0;i--){
            int didSwap = 0;
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
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
        Bubblesort bb = new Bubblesort();
        bb.bubble(arr);
        for(int elem:arr){
            System.out.print(elem+ " ");
        }
    }
}
