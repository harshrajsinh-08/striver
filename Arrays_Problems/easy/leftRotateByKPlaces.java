package Arrays_Problems.easy;
import java.util.*;
public class leftRotateByKPlaces {
    public static void reverse(int[] arr,int start,int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void rightbyK(int [] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
    }
    public static void leftbyK(int [] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        leftbyK(arr,k);
        for(int elem : arr){
            System.out.print(elem+ " ");
        }
        rightbyK(arr,k);
        System.out.println();
        for(int elem : arr){
            System.out.print(elem+ " ");
        }
    }
}
