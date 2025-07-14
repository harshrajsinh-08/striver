package Stacks;
import java.util.*;
class asteroid {
    public int[] asteroidCollision(int[] asteroids) {
        Stack <Integer> st = new Stack<>();
        for(int a:asteroids){
            if(a>0){
                st.push(a);
            }else{//negative hai 
            //stack khali naa ho and top element positive ho and top element neg (i.e a) se chhota hai
                while(!st.isEmpty() && st.peek()>0 && st.peek() <-(a)){
                    st.pop();
                }
                //stack khali ho yaa top element neg (i.e a) hai
                if(st.empty()||st.peek()<0){
                    st.push(a);
                }
                //dono top and a same hai value mai 
                else if(st.peek()==-(a)){
                    st.pop();
                }
            }
        }
        int[] ans = new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            ans[i]=st.pop();
        }
        return ans;
    }
}