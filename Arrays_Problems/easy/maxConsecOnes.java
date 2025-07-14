package Arrays_Problems.easy;
import java.util.*;
public class maxConsecOnes {
    public static int maxOnes(int[] arr){
        int maxi = 0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
                maxi = Math.max(maxi,count);
            }
            else{count=0;}

        }

        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1,0,0};
        int ans = maxOnes(arr);
        System.out.println(ans);
    }
}
