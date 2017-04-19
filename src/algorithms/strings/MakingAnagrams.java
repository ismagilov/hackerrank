package algorithms.strings;

import java.io.*;
import java.util.*;

/**
* https://www.hackerrank.com/challenges/making-anagrams
*/
public class MakingAnagrams {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String s1 = in.next();
        int[] cnt1 = new int[26];
        String s2 = in.next();
        int[] cnt2 = new int[26];
        
        for (int i = 0; i < s1.length(); i++)
            cnt1[s1.charAt(i) - 'a']++;
        
        for (int i = 0; i < s2.length(); i++)
            cnt2[s2.charAt(i) - 'a']++;
        
        int cnt = 0;
        for (int i = 0; i < 26; i++)
            cnt += Math.abs(cnt1[i] - cnt2[i]);
            
            
        System.out.println(cnt);
    }
}
