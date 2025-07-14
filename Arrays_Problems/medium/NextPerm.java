package Arrays_Problems.medium;
import java.util.*;
public class NextPerm {
    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void reversearr(int[]arr,int i,int j){
        int left = i;int right= j;
        while(left<right){
            swap(arr,left,right);
            left++;
            right--;
        }
    }
    public static void findNextPerm(int[] arr) {
        int n = arr.length;
        int pivot = -1;
        //find pivot
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot = i;
                break;
            }
        }
        //if pivot not found
        if(pivot==-1){
            reversearr(arr,0,n-1);
        }

        //find next small than pivot and swap
        for(int i=n-1;i>pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        //reverse
        reversearr(arr,pivot+1,n-1);
    }

    public static void main(String[] args) {
        int[] arr = {2,1,5,4,3,0,0};
        findNextPerm(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
