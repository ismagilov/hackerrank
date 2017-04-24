/**
* https://www.hackerrank.com/challenges/two-strings
*/
import java.io.*;
import java.util.*;

public class TwoStrings {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> s1 = new ArrayList<>();
        ArrayList<String> s2 = new ArrayList<>();
        
        int ps = in.nextInt();
        for (int i = 0; i < ps; i++) {
            s1.add(in.next());
            s2.add(in.next());
        }
        
        int[] letters1 = new int[26];
        int[] letters2 = new int[26];        
        
        for (int i = 0; i < ps; i++) {
            for (char c : s1.get(i).toCharArray())
                letters1[c - 97]++;
            for (char c : s2.get(i).toCharArray())
                letters2[c - 97]++;
            
            boolean hasCommon = false;
            for (int j = 0; j < 26; j++) {
                if (letters1[j] > 0 && letters2[j] > 0) {
                    hasCommon = true;
                    break;
                }
            }
            
            System.out.println(hasCommon ? "YES" : "NO");
            
            Arrays.fill(letters1, 0);
            Arrays.fill(letters2, 0);            
        }
    }
}
