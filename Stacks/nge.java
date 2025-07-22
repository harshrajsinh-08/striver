package Stacks;
import java.util.*;

public class nge {
    public static int[] nextGreater(int[] arr){
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek() <=arr[i%n]){
                st.pop();
            }
            if(i<n){
                if(!st.isEmpty()) nge[i] = st.peek();
                else nge[i] = -1;
            }
            st.push(arr[i%n]);
        }
        return nge;
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int nge[] = new int[n];
        Stack < Integer > st = new Stack < > ();
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (st.isEmpty() == false && st.peek() <= nums[i % n]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty() == false) nge[i] = st.peek();
                else nge[i] = -1;
            }

            st.push(nums[i % n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[] nums = {6,0,8,1,3};
        int[] result = nextGreater(nums);
        System.out.println(Arrays.toString(result));
    }
}
