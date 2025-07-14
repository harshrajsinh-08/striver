package Arrays_Problems.medium;
import java.util.*;
public class LeadersInArray {
    public static void reversearr(int[] arr,int start,int end){
        int left = start;int right=end;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] findleaderopt(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        int n = arr.length;
        ArrayList<Integer> ans  = new ArrayList<>();
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] > maxi) {
                maxi = arr[i];
                ans.add(maxi);
            }
        }
        int[] finalans  = new int[ans.size()];
        for(int i =0 ;i<ans.size();i++){
            finalans[i] = ans.get(i);
        }
        reversearr(finalans,0,finalans.length-1);
        return finalans;
    }

    public static int[] findLeaderbrute(int[] arr){
        ArrayList<Integer> leader = new ArrayList<>();
        for(int i = 0;i<arr.length;i++){
            boolean check = true;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]>arr[i]){
                    check=false;
                }
            }
            if(check){
                leader.add(arr[i]);
            }
        }
        int[] ans=new int[leader.size()];
        for(int i=0;i<leader.size();i++){
            ans[i] = leader.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = {10,22,12,3,0,6};
        int [] result = findleaderopt(ans);
        for(int elem:result){
            System.out.print(elem+" ");
        }

    }
}
