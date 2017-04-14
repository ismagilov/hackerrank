import java.io.*;
import java.util.*;

/**
* https://www.hackerrank.com/challenges/missing-numbers
*/
public class Solution {
    public static void main(String[] args) {                
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] lost = new int[n];
        for (int i = 0; i < n; i++)
            lost[i] = in.nextInt();
        int m = in.nextInt();
        int[] original = new int[m];
        for (int i = 0; i < m; i++)
            original[i] = in.nextInt();
        
        int min = 100000;
        for (int i = 0; i < m; i++)
            min = Math.min(min, original[i]);
        
        int[] countLost = new int[102];
        int[] countOriginal = new int[102];            
        
        for (int i = 0; i < n; i++)
            countLost[lost[i] - min]++;
        
        for (int i = 0; i < m; i++)
            countOriginal[original[i] - min]++;

        for (int i = 0; i < countLost.length; i++) {
            if (countOriginal[i] != countLost[i])
                System.out.print(i + min + " ");
        }
        
        System.out.println();            
    }
}
