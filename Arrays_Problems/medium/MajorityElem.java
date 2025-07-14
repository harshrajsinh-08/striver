package Arrays_Problems.medium;
import java.util.*;
public class MajorityElem {
    public static int findMajority(int[] arr){
        int n=arr.length;
        int maj=-1;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(arr[i]) > n/2){
                maj = arr[i];
            }else{
                continue;
            }
        }
        return maj;
    }

    public static int moore(int[] arr){
        int n=arr.length;
        int count=0;
        int elem = arr[0];
        for(int i=0;i<n;i++){
            if(count==0){
                elem=arr[i];
                count++;
            }
            else if(elem==arr[i]){
                count++;
            }else{
                count--;
            }

        }
        int cnt2=0;
        for(int i=0;i<n;i++){
            if(elem==arr[i]){
                cnt2++;
            }
        }
        if(cnt2>n/2){
            return elem;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,2};
        System.out.println(moore(arr));
    }
}
