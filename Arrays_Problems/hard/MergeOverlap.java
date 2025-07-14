package Arrays_Problems.hard;
import java.util.*;
public class MergeOverlap {
    public static List<List<Integer>> mergeOverlap(int[][] intervals) {
        // Step 1: Sort the intervals by their starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<List<Integer>> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If merged list is empty or no overlap with last interval
            if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1).get(1)) {
                merged.add(Arrays.asList(interval[0], interval[1]));
            } else {
                // Overlapping intervals - merge them
                List<Integer> last = merged.get(merged.size() - 1);
                last.set(1, Math.max(last.get(1), interval[1]));
            }
        }

        return merged;
    }

    public static void swapifgreater(int[]arr1,int[]arr2,int ind1,int ind2){
        if(arr1[ind1]>arr2[ind2]){
            int temp = arr1[ind1];
            arr1[ind1] = arr2[ind2];
            arr2[ind2] = temp;
        }
    }

    public static void gapmethod(int[]arr1,int[]arr2,int ind1,int ind2){
        int len = ind1+ind2;
        int gap = (len/2)+(len%2);
        while(gap>0) {
            int left =0;
            int right = left+gap;
            while(right<len){
                if(left<ind1 && right>=ind1){
                    swapifgreater(arr1,arr2,left,right-ind1);
                }
                else if(left>=ind1){
                    swapifgreater(arr2,arr2,left-ind1,right-ind1);
                }else{
                    swapifgreater(arr1,arr1,left,right);
                }
                left++;right++;
            }
            if(gap==1) break;
            gap=(gap/2)+(gap%2);
        }
    }

    public static void main(String[] args) {
            int[] arr1 = {1, 4, 8, 10};
            int[] arr2 = {2, 3, 9};
            int n = 4, m = 3;
            gapmethod(arr1, arr2, n, m);
            System.out.println("The merged arrays are:");
            System.out.print("arr1[] = ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr1[i] + " ");
            }
            System.out.print("\narr2[] = ");
            for (int i = 0; i < m; i++) {
                System.out.print(arr2[i] + " ");
            }
            System.out.println();
        }
    }