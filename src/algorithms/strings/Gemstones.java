package algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* https://www.hackerrank.com/challenges/gem-stones
*/
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] allElems = new int[26];
        
        int n = scanner.nextInt();
        String[] rocks = new String[n];
        for (int i = 0; i < n; i++) {
            rocks[i] = scanner.next();
        }
        
        for (int i = 0; i < n; i++) {
            int[] rockElems = new int[26];
                        
            int lng = rocks[i].length();
            for (int j = 0; j < lng; j++) {
                int idx = rocks[i].charAt(j) - 'a';
                if (rockElems[idx] == 0)
                    rockElems[idx] = 1;
            }
            
            for (int j = 0; j < rockElems.length; j++) {
                allElems[j] += rockElems[j];
            }
        }
        
        int cnt = 0;
        for (int i = 0; i < allElems.length; i++)
            if (allElems[i] == n)
                cnt++;
            
        System.out.println(cnt);
    }
}
