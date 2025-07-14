package BinarySearch.easy;
import java.util.*;
public class searchinrotated {
    public static int find(int[]arr,int x){
        int low = 0;
        int high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x) return mid;

            //left sorted
            if(arr[low] <= arr[mid] ){
                //check if x is in left sorted
                if(arr[low] <= x && x<= arr[mid]){
                    high=mid-1;
                }else low=mid+1;
            }
            else{
                //right sorted
                if(arr[mid]<=x && x<=arr[high]){
                    low=mid+1;
                }else high=mid-1;
            }
        }
        return -1;
    }


    /*     ROTATED WITH DUPLICATES  */
    public static boolean findwithdupes(int[] arr,int x){
        int n = arr.length;
        int low=0;int high=n-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == x) return true;

            // low,mid and high are all same elements then trim down search space
            if(arr[low] == arr[mid] && arr[mid]== arr[high]){
                low++;
                high--;
                continue;
            }
            //left sorted
            if(arr[low] < arr[mid]){
                //check if x is in left sorted
                if(arr[low] <= x && x<= arr[mid]){
                    high=mid-1;
                }else low=mid+1;
            }
            //right sorted
            else if(arr[low] > arr[mid]){
                if(arr[mid]<=x && x<=arr[high]){
                    low=mid+1;
                }else high=mid-1;
            }
            else{
                low++;
            }
        }
        return false;
    }






    public static void main(String[] args) {
        int[] arr = {3, 3, 9, 3, 3, 3, 3, 3, 6};
        int n = arr.length;
        int x = 3;
        System.out.println(findwithdupes(arr, x));
    }
}
