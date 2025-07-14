package BinarySearch.easy;
import java.util.*;
public class binarysrch {
    public static int bs(int[]arr,int low,int high,int target){
       Arrays.sort(arr);
       while(low<=high) {
           int mid = (low + high) / 2;
           if(arr[mid] == target){
               return mid;
           }
           else if(arr[mid] < target){
               low=mid+1;
           }
           else{
               high = mid-1;
           }
       }
       return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2,2,3,4,4,5};
        int ans = bs(arr,0,arr.length-1,4);
        System.out.println(ans);
    }
}
