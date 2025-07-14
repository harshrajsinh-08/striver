package Hashing;
import java.util.*;
class Number_hash{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int nums[] = new int[n+1];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }

        // hashing
        int hash[] = new int[n+1];
        for(int elem:nums){
            hash[elem] +=1;
        }
        int q = sc.nextInt();
        int qr[] = new int[q+1];
        for(int i=0;i<q;i++){
            qr[i]=sc.nextInt();
        }
        int i=0;
        while(q!=0){
            System.out.print("The hash of "+qr[i]+" is:"+ hash[qr[i]]+"\n");
            i++;
            q--;
        }
    }
}
