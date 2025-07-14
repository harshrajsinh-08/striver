package Recursion;
import java.util.*;

//TAKE NOT TAKE APPROACH
//Time Complexity: O(2^n) for n elements, as each element can either be included or excluded.
//Space Complexity: O(n) for the recursion stack, where n is the number of elements in the input array.
//This code generates all subsets of a given array, including duplicates, and prints them.

public class subsets{
    public static void subsets(int ind,ArrayList<Integer> ls , int[] arr,int n){
        if(ind == n){
            System.out.println(ls);
            return;
        }
        //take 
        ls.add(arr[ind]);
        subsets(ind+1,ls,arr,n);
        //not take
        ls.remove(ls.size()-1);
        subsets(ind+1,ls,arr,n);
    }

    public static void subsets(int ind,ArrayList<Integer> ls , int[] arr,int s,int target,int n){
        if(ind == n){
            if(s==target) System.out.println(ls);
            return;
        }
        //take 
        ls.add(arr[ind]);
        s+=arr[ind];
        subsets(ind+1,ls,arr,s,target,n);
        //not take
        ls.remove(ls.size()-1);
        s-=arr[ind];
        subsets(ind+1,ls,arr,s,target,n);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
        // subsets(0,ls,arr,n);
        int target = 2;
        subsets(0,ls,arr,0,target,n);
    }
}

