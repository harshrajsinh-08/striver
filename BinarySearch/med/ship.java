package BinarySearch.med;
import java.util.*;
class ship {
    public static int finddays(int[] weights,int cap){
        int n = weights.length;
        int days=1;
        int load=0;
        for(int i=0;i<n;i++){
            if(load+weights[i] > cap){
                days=days+1;
                load=weights[i];
            }
            else{
                load+= weights[i];
            }
        }
        return days;
    }
    public static int shipWithinDays(int[] weights, int days) {
        int n = weights.length;
        int low=Integer.MIN_VALUE;int high = 0;
        for(int i=0;i<n;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<=high){
            int mid =(low+high)/2;
            int numdays = finddays(weights,mid);
            if(numdays <= days){
                high=mid-1;
            }else low=mid+1;
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int days = 5;
        System.out.println("Minimum capacity of ship required to ship within " + days + " days: " + shipWithinDays(arr, days));
    }
}