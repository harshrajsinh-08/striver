package BinarySearch.easy;
import java.util.*;
import BinarySearch.easy.lowerbound;
public class firstandlastoccuring {
    public static int first(int[] v,int key) {
    int n =  v.length;
    int start = 0;
    int end = n - 1;
    int res = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (v[mid] == key) {
        res = mid;
        end=mid-1;

      } else if (v[mid]<key) {
        start=mid+1;
      } else {
        end = mid - 1;
      }
    }
    return res;
  }
  public static int last(int[]arr,int x){
    int n= arr.length;
    int low=0;int high=n-1;
    int ans = -1;
    while(low<=high){
        int mid = (low+high)/2;
        if(arr[mid]==x){
            ans=mid;
            low=mid+1;
        }
        else if(arr[mid]<x){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return ans;
}

    public static Map<Integer,Integer> findfandl(int[] nums,int x){
        int n=nums.length;
        int first=-1,last=-1;
        for(int i=0;i<n-1;i++){
            if(nums[i] == x){
                if(first==-1){
                    first=i;
                }else{
                    last=i;
                }
            }
        }
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,first);
        map.put(1,last);
        return map;
    }
    public static void main(String args[]) {
    int key = 13;
    int[] v = {3,4,13,13,13,20,13};

    System.out.println(first(v,key));
    System.out.println(last(v,key));
  }

}
