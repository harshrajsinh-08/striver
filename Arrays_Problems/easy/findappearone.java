package Arrays_Problems.easy;
import java.util.*;
public class findappearone {
    public static void xor(int[] arr){
        int xor=0;
        for(int elem:arr){
            xor^=elem;
        }
        System.out.println(xor);
    }
    public static void hashing(int[]arr){
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            if(entry.getValue() == 1){
                System.out.print(entry.getKey()+ " " );
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,6,4,4};
        hashing(arr);
        xor(arr);
    }
}
