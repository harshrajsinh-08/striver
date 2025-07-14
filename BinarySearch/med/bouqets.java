package BinarySearch.med;
import java.util.*;
public class bouqets {
    public static boolean possible(int[] arr,int bloomday,int bouqet,int flowers){
        int count=0;
        int bouqets=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<=bloomday){
                count++;
            }else{
                bouqets+= count/flowers;
                count=0;
            }
        }
        bouqets += count/flowers;
        if(bouqets>=bouqet){
            return true;
        }
        return false;
    }
    public static int minDays(int[] arr,int m,int k){
        int n = arr.length;
        if(m*k > n ) return -1;
        int low=0,high=n;
        int ans = -1;
        while(low<=high){
            int mid = (low+high)/2;
            if(possible(arr,mid,m,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,10,3,10,2};
        int m = 3; // number of bouqets
        int k = 1; // flowers in each bouqet
        System.out.println("Minimum days required to make " + m + " bouqets with " + k + " flowers each: " + minDays(arr, m, k));
    }
    
}
