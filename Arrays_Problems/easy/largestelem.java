package Arrays_Problems.easy;
import java.util.*;
public class largestelem {
    public static int largest(int[] arr){
        int min = Integer.MAX_VALUE;
        int ans =Integer.MAX_VALUE;
        for(int n:arr){
            ans = Math.min(n,min);
        }
        return ans;
    }

    public static int secondLargest(int[] arr){
        int largest = arr[0];
        int seclarge = -1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > largest){
                seclarge = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>seclarge){
                seclarge = arr[i];
            }
        }
        return seclarge;
    }
    public static int secondsmallest(int[] arr){
        int smallest = arr[0];
        int secsmall = Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest) {
                secsmall = smallest;
                smallest = arr[i];
            }
            else if(arr[i]>smallest && arr[i]<secsmall){
                secsmall = arr[i];
            }
        }
        return secsmall;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(largest(arr));
        System.out.println(secondLargest(arr));

        System.out.println("Second smallest : "+ secondsmallest(arr));
    }
}
