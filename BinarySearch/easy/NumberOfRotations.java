package BinarySearch.easy;
import java.util.*;
public class NumberOfRotations {
    public static int findRotations(int[] arr){
        int n = arr.length;
        int index= -1;
        int low=0,high=n-1,ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;

            if (arr[low] <= arr[high]) {
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }
                break;
            }

            if (arr[low] <= arr[mid]) {
                // keep the minimum:
                if (arr[low] < ans) {
                    index = low;
                    ans = arr[low];
                }

                // Eliminate left half:
                low = mid + 1;
            } else { //if right part is sorted:

                // keep the minimum:
                if (arr[mid] < ans) {
                    index = mid;
                    ans = arr[mid];
                }

                // Eliminate right half:
                high = mid - 1;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr= {4,5,6,7,0,1,2};
        System.out.println(findRotations(arr));
    }
}
