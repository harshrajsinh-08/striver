package BinarySearch.easy;
import java.util.*;
public class findpeak {
    public static int findpeakelem(int[]arr){
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0]> arr[1]) return 0;
        if(arr[n-1] > arr[n-2]) return n-1;

        int low = 1,high=n-2;
        while(low<=high){
            int mid = (low+high)/2;
            //if mid is peak
            if(arr[mid] > arr[mid+1] && arr[mid] >arr[mid-1]){
                return mid;
            }
            //on the increasing curve
            else if(arr[mid] > arr[mid-1] ){
                low=mid+1;
            }
            else if(arr[mid] > arr[mid+1]){
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,4,7,3,2,1};
        System.out.println(findpeakelem(arr)+"-->"+ arr[findpeakelem(arr)]);
    }
}
