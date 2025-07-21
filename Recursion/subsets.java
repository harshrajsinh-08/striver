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

    public static void subsetswithsumk(int ind,ArrayList<Integer> ls , int[] arr,int s,int target,int n){
        if(ind == n){
            if(s==target) System.out.println(ls);
            return;
        }
        //take 
        ls.add(arr[ind]);
        s+=arr[ind];
        subsetswithsumk(ind+1,ls,arr,s,target,n);
        //not take
        ls.remove(ls.size()-1);
        s-=arr[ind];
        subsetswithsumk(ind+1,ls,arr,s,target,n);
    }

    public static int numberofsubsetswithsumk(int ind,ArrayList<Integer> ls , int[] arr,int s,int target,int n){
        if(ind == n){
            if(s==target){
                System.out.println(ls);
                return 1;
            }
            else{
                return 0;
            }
        }
        //take 
        ls.add(arr[ind]);
        s+=arr[ind];
        int l = numberofsubsetswithsumk(ind+1,ls,arr,s,target,n);
        //not take
        ls.remove(ls.size()-1);
        s-=arr[ind];
        int r = numberofsubsetswithsumk(ind+1,ls,arr,s,target,n);
        return l+r;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,1,1,2,1};
        int n = arr.length;
        ArrayList<Integer> ls = new ArrayList<>();
        // subsets(0,ls,arr,n);
        // subsetswithsumk(0,ls,arr,0,2,n);
        // System.out.println("Number of subsets with sum 2:");
        ls.clear(); // Clear the list for the next function call

        int target = 2;
        int ans = numberofsubsetswithsumk(0,ls,arr,0,target,n);
        System.out.println(ans);
    }
}

