package Arrays_Problems.medium;
import java.util.*;
public class LongestConsecSubseq {
    public static int longestConsecopt(int[] arr){
        HashSet<Integer>set = new HashSet<>();
        int n = arr.length;
        int longest = 1;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int elem:set){
            if(!set.contains(elem-1)){
                int count=1;
                int x = elem;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
                longest = Math.max(longest,count);
            }
        }
        return longest;
    }
    public static int findLongestConsecSubseq(int[]arr){
        Arrays.sort(arr);
        int n = arr.length;
        int longest = 1;int cnt = 0;int lastSmall = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]-1 == lastSmall){
                cnt++;
                lastSmall = arr[i];
            }
            else if(lastSmall != arr[i]) {
                //lets start a new seq
                lastSmall = arr[i];
                cnt = 1;
            }
            longest = Math.max(longest,cnt);
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] arr = {100,102,100,101,101,4,3,2,3,2,1,1,1,2};
        System.out.println(findLongestConsecSubseq(arr));
        System.out.println(longestConsecopt(arr));
    }
}
