package BinarySearch.med;
import java.util.*;
public class nthroot {
    public static int findpower(int mid,int n,int x){
        long ans=1;
        for(int i=1;i<=n;i++){
            ans*=mid;
            if(ans>x) return 2;
        }
        if(ans== x) return 1;
        return 0;

    }
    public static int findnth(int n,int x){
        int low=1;
        int high=x;
        while(low<=high){
            int mid = (low+high)/2;
            int pow = findpower(mid,n,x);
            if (pow == 1) {
                return mid;
            } else if (pow == 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findnth(4, 256));
    }
}
