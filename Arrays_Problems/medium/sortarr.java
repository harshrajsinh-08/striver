package Arrays_Problems.medium;
import java.util.*;
public class sortarr {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void dnf(int[] arr){
        int n= arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                mid++;low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                swap(arr,mid,high);
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,1,0 ,1,2};
        dnf(arr);
        for(int elem:arr){
            System.out.print(elem+ " ");
        }
    }
}
