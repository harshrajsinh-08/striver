package BinarySearch.med;
import java.util.*;
public class floorofsqrtn {
    public static int floorsqrt(int x,int[]arr){
        int n = arr.length;
        int low = 0;
        int high = n;
        while(low<=high){
            int mid = (low+high)/2;
            if(mid*mid <= x){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8};
        int x = 39;
        System.out.println("The floor of square root of " + x + " is: " + floorsqrt(x, arr));
    }
}
