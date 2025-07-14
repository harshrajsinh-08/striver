package Arrays_Problems.medium;
import java.util.*;
public class twoSum {
    public static int[] twosumHashing(int[] arr,int target){
        int n= arr.length;
        int[] ans= new int[2];
        Arrays.fill(ans,-1);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int a = arr[i];
            int b = target-a;
            if(map.containsKey(b)){
                ans[0] = map.get(b);
                ans[1] = i;
                return ans;
            }
            map.put(arr[i],i);
        }
        return ans;
    }
    public static boolean twopoint(int[] arr,int target) {
        int n=arr.length;
        Arrays.sort(arr);
        int left=0,right=n-1;
        while(left<right){
            int sum = arr[left]+arr[right];
            if(sum==target){
                return true;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {4, 7, 1, 3, 2};
        int target = 3;
        int[] ans = twosumHashing(arr,target);
        System.out.println(Arrays.toString(ans));
        System.out.println(twopoint(arr,target));
    }
}
