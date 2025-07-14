package Arrays_Problems.medium;
import java.util.*;
public class maxsubsum {
    public static int findMaxSubarray(int[] arr) {
        int max=Integer.MIN_VALUE;
        int n = arr.length;
        int sum=0;
        int start=-1,end=-1;
        int ansstart=-1,ansend=-1;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
                start=i +1;

            }
            if(sum>max){
                max=sum;
                ansstart = start;
                ansend = i;
            }
        }
        System.out.println("The max subarray is: ["+ansstart+","+ansend+"]");
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,-2,1,-3,-3};
        System.out.println(findMaxSubarray(arr));
    }
}
