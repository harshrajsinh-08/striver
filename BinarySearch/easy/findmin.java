package BinarySearch.easy;
import java.util.*;

public class findmin {
    public static int findminval(int[] arr){
        int n = arr.length;
        int low=0,high=n-1,ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<= arr[mid]){
                ans = Math.min(ans,arr[low]);
                low=mid+1;
            }
            else{
                ans = Math.min(ans,arr[mid]);
                high=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findminval(arr));
    }
}
