package BinarySearch.med;
import java.util.*;

public class kokoeatingkelas {

    public static int findmax(int[]arr){
        int n = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i:arr){
            maxi=Math.max(maxi,i);
        }
        return maxi;
    }

    public static int findhours(int[]arr,int hourlyspeed){
        int n = arr.length;
        int totalH = 0;
        for(int i=0;i<n;i++){
            totalH += Math.ceil((double)arr[i]/hourlyspeed);
        }
        return totalH;
    }
    public static int findEatingSpeed(int[]arr,int h){
        int n = arr.length;
        int low = 0;
        int high = findmax(arr);
        while(low<=high){
            int mid = (low+high)/2;
            int totalH = findhours(arr,mid);
            //jyaada matlab range mai bade values ki taraf hai jo kam ho sakti hai 
            if(totalH<= h){
                high = mid-1;
            }
            //kam matlab range mai choti values ki taraf hai jo badh sakti hai
            else{
                low=mid+1;
            }
            //humesha opposite polarity pe end karega low and high
            //low min pe hi end karega humesha
        }
        return low;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,7,11};
        int h = 8;
        System.out.println("The minimum eating speed is: " + findEatingSpeed(arr, h));
    }
}
