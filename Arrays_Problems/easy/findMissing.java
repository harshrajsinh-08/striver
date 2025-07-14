package Arrays_Problems.easy;

public class findMissing {
    public static int missing(int[] arr,int n){
        int sum = n*(n+1) / 2;
        int sum2=0;
        for(int elem:arr){
            sum2+= elem;
        }
        return (sum-sum2);
    }

    public static int usingXor(int[]arr,int n){
        int xor1=0,xor2=0;
        for(int i=0;i<n-1;i++){
            xor1^= i+1;
            xor2^= arr[i];
        }
        xor1^=n;
        return xor1^xor2;
    }
    public static void main(String[] args) {
        int[]arr = {1,2,3,5};
        int ans = missing(arr,5);
        System.out.println(ans);
        int ans2 = usingXor(arr,5);
        System.out.println(ans2);
    }
}
