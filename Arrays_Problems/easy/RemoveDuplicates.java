package Arrays_Problems.easy;
import java.util.*;

// tc: O(N)   sc: O(1)   inplace
public class RemoveDuplicates {
    public static void removeDupes(int[] arr){
        int i=0;
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++){
            if(arr[i] !=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        for(int k=i+1;k<arr.length;k++){
            arr[k] = -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = sc.nextInt();
        }
        removeDupes(arr);
        for(int elem: arr ){
            System.out.print(elem+ " ");
        }
    }
}
