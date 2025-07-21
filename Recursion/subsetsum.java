package Recursion;
import java.util.*;
public class subsetsum {
    public static void func(int ind,int sum,ArrayList<Integer> arr,int n,ArrayList<Integer> subset){
        if(ind==n){
            subset.add(sum);
            return;
        }
        //pick
        func(ind+1,sum+arr.get(ind),arr,n,subset);
        //notpick
        func(ind+1,sum,arr,n,subset);
    }
    static ArrayList<Integer> ssum(ArrayList<Integer> arr,int n){
        ArrayList<Integer> sum =new ArrayList<>();
        func(0,0,arr,n,sum);
        Collections.sort(sum);
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3));
        int n = arr.size();
        ArrayList<Integer> result = ssum(arr, n);
        System.out.println(result);
    }
}
