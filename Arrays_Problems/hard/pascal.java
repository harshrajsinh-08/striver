package Arrays_Problems.hard;
import java.util.*;
public class pascal {
    //find nthrow and nth col :  N-1 C R-1
    public static long findNCR(int n,int r){
        long res = 1;
        for(int i=0;i<r;i++){
            res = res*(n-i);
            res = res/(i+1);
        }
        return res;
    }
    public static ArrayList<Integer> nthrow(int n){
        ArrayList<Integer> list = new ArrayList<>();
//        System.out.print(ans+" ");
        int ans = 1;
        for(int i=1;i<n;i++){
            ans = ans*(n-i);
            ans=ans/(i);
            list.add(ans);

        }
        return list;
    }
    public static ArrayList<Integer> printwhole(int n){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=1;i<=n;i++){
            ans.add(1);
            ArrayList<Integer> temp = nthrow(i);
            ans.addAll(temp);
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=5;
        int r=3;
        System.out.println(findNCR(n-1,r-1));
        ArrayList<Integer> ans = printwhole(4);
        System.out.println(ans.toString());

    }
}
