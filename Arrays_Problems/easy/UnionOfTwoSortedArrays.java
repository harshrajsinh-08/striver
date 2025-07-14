package Arrays_Problems.easy;
import java.util.*;
public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> unionOfTwoArr(int[] arr1,int[]arr2){
        ArrayList<Integer> ans = new ArrayList<>();
        int i=0,j=0;
        int n1=arr1.length,n2=arr2.length;
        while(i<n1 && j<n2){
            if(arr1[i] == arr2[j]){
                if(ans.isEmpty() || !ans.contains(arr1[i])){
                    ans.add(arr1[i]);
                }
                i++;
            }else {
                if (ans.isEmpty() || !ans.contains(arr2[j])) {
                    ans.add(arr2[j]);
                }
                j++;
            }
        }
        while(j<n2){
            if (ans.isEmpty() || !ans.contains(arr2[j])) {
                ans.add(arr2[j]);
            }
            j++;
        }
        while(i<n1){
            if(ans.isEmpty() || !ans.contains(arr1[i])){
                ans.add(arr1[i]);
            }
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,1,1,2};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(unionOfTwoArr(arr1,arr2));

    }
}
