package Hashing;
import java.util.*;

public class Char_hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] cs = s.toCharArray();
        int[] hash = new int[26];

        for (int i = 0; i < s.length(); i++) {
            if (cs[i] >= 'a' && cs[i] <= 'z') {
                hash[cs[i] - 'a']++;
            }
        }

        int q = sc.nextInt();
        sc.nextLine();
        String ch = sc.nextLine();
        char c[] = ch.toCharArray();
        int i=0;
        while (q-- > 0) {
            char cc = c[i];
            System.out.println("Ans : " +c[i]+ "--> "+ hash[cc - 'a']);
            i++;
        }
    }
}