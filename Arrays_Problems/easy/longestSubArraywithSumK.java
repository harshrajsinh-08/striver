package Arrays_Problems.easy;
import java.util.*;

public class longestSubArraywithSumK {

    public static int longesttwopointer(int[] arr,int k){
        int left=0,right=0;
        Arrays.sort(arr);
        int n = arr.length;
        int sum = arr[0];
        int maxlen = 0;
        while(right<n){
            while(sum>k && left<=right){
                sum-=arr[left];
                left++;
            }
            if(sum==k){
                maxlen = Math.max(maxlen,right-left+1);
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxlen;
    }
    public static void longestlengthHash(int[] arr,int k){
        int sum = 0;
        int maxLength = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            int rem = sum - k;
            if (hm.containsKey(rem)) {
                int len = i - hm.get(rem);
                maxLength = Math.max(maxLength, len);
            }

            // Only store the first occurrence of each sum
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            }
        }

        System.out.println(maxLength);
    }
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        longestlengthHash(arr, k);
        System.out.println(longesttwopointer(arr,k));

    }
}