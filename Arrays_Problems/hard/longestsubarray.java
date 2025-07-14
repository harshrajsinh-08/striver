package Arrays_Problems.hard;
import java.util.*;
public class longestsubarray {
    public static int findlongestSubarray(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxi = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            if (sum == 0) {
                maxi = i + 1;
            } else {
                if (map.get(sum) != null) {
                    maxi = Math.max(maxi, i - map.get(sum));
                } else {
                    map.put(sum, i);
                }
            }
        }
        return maxi;
    }
}
