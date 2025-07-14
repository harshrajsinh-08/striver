package Arrays_Problems.hard;
import java.util.*;
public class threesum {
    public static List<List<Integer>> optimal(int[] arr, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (i != 0 && arr[i] == arr[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = arr[i] + arr[j] + arr[k];
                if (sum == target) {
                    List<Integer> list = Arrays.asList(arr[i], arr[j], arr[k]);
                    res.add(list);
                    j++;
                    k--;

                    while (j < k && arr[j] == arr[j - 1]) j++;
                    while (j < k && arr[k] == arr[k + 1]) k--;
                } else if (sum < target) {
                    j++;
                } else k--;
            }
        }
        return res;
    }

    public static List<List<Integer>> findSum(int[] arr) {
        int n = arr.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            Set<Integer> st = new HashSet<>();
            for (int j = i + 1; j < n; j++) {
                int third = -(arr[i] + arr[j]);
                if (st.contains(third)) {
                    List<Integer> temp = Arrays.asList(arr[i], arr[j], arr[third]);
                    temp.sort(null);
                    set.add(temp);
                }
                st.add(arr[j]);
            }
        }
        List<List<Integer>> res = new ArrayList<>(set);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = optimal(arr,0);
        System.out.println(ans.toString());
    }
}