package BinarySearch.easy;
import java.util.*;
public class lowerbound {
    public static int findLowerBound(int[] nums, int target) {
        int n = nums.length;
        int low=0;int high=n-1;
        int ans =n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] >=target){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static int findUpperBound(int[] nums, int target) {
        int n = nums.length;
        int low=0;int high=n-1;
        int ans =n;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid] >target){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,4};
        System.out.println(findUpperBound(arr,2));
    }
}
