package Arrays_Problems.easy;
import java.util.*;
public class linearSearch {

    public static int linearsearch(int[] arr,int target){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the target: ");
        int target = sc.nextInt();
        System.out.print("At index: "+linearsearch(arr,target));
    }
}
