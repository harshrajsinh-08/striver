package BinarySearch.easy;
import java.util.*;
public class findmininrotarray {
    public static int[]findmin(int[]arr){
        int n = arr.length;
        int ans[] = new int[2];
        int low = 0;
        int mini= Integer.MAX_VALUE;
        int index = -1;
        int high = n-1;
        while(low<=high){
            int mid = (low+high)/2;
            //left sorted
            if(arr[low] <= arr[mid]){
                mini = Math.min(mini,arr[low]);
                index = low;
                low=mid+1;
            }
            //right sorted
            else{
                mini = Math.min(arr[mid],mini);
                index = mid;
                high=mid-1;

            }
        }
        return new int[]{index,mini};
        
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,1,2,3};
        // int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(findmin(arr)));
        System.out.println("the array has been rotated "+(arr.length - findmin(arr)[0])+" times");
    }
}
