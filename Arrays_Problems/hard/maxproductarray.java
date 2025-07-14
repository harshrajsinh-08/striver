package Arrays_Problems.hard;
import java.util.*;

public class maxproductarray {

    public static int maxprod(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = i; j < n; j++) {
                prod *= arr[j];
                maxi = Math.max(maxi, prod);
            }
        }
        return maxi;
    }

    public static int optimal(int[] arr) {
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        int prefix = 1;
        int suffix = 1;
        for (int i = 0; i < n; i++) {
            prefix = (prefix == 0) ? 1 : prefix;
            suffix = (suffix == 0) ? 1 : suffix;
            prefix *= arr[i];
            suffix *= arr[n - 1 - i];
            maxi = Math.max(maxi, Math.max(prefix, suffix));
        }
        return maxi;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 2, -3, 0, 6 };
        int brute = maxprod(arr);
        int opt = optimal(arr);
        System.out.println("Brute Force: " + brute);
        System.out.println("Optimal: " + opt);
    }
}