package Arrays_Problems.easy;
import java.util.*;

//
public class MoveZerosToEnd {

    //TC : O(x) +  O(n-x) = O(n)
    // SC : O(1)
    public static void moveZeroes(int[] arr){
        int n=arr.length;
        int j=-1;
        //O(x)
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        //O(n-x)
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    public static int[] takeinputarr(int k){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public static void main(String[] args) {
        int [] arr = takeinputarr(5);
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}
