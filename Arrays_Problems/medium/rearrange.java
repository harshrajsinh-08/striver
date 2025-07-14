package Arrays_Problems.medium;
import java.util.*;
public class rearrange {
    public static int[] arrange_if_equal(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        int pos = 0;
        int neg = 1;
        for(int i=0;i<n/2;i++){
            if(arr[i]>0){
                ans[pos] = arr[i];
                pos+=2;
            }
            else{
                ans[neg] = arr[i];
                neg+=2;
            }
        }
        return ans;
    }
    public static int[]arrange_if_not_equal(int[] arr){
        int n = arr.length;
        int[] ans = new int[n];
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++) {
            if (arr[i] > 0) {
                pos.add(arr[i]);
            } else {
                neg.add(arr[i]);
            }
        }
        int i=0,p=0,ne=0;
        while(p<pos.size() && ne<neg.size()){
            arr[i++]=pos.get(p++);
            arr[i++] = neg.get(ne++);
        }
        while(p<pos.size()){
            arr[i++]=pos.get(p++);
        }
        while(ne<neg.size()){
            arr[i++]=neg.get(ne++);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,-1,-2,3,-3,4,5,-1,1,-2,3};
        System.out.println(Arrays.toString(arrange_if_not_equal(arr)));
    }
}
