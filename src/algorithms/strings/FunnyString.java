package algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* https://www.hackerrank.com/challenges/funny-string/
*/
public class FunnyString {
    public static boolean isFunny(String s) {
        int n = s.length();
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(s.charAt(i + 1) - s.charAt(i)) != 
                  Math.abs(s.charAt(n - 1 - (i + 1)) - s.charAt(n - 1 - i)))
                return false;
        }
        
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                
        int n = in.nextInt();
        String[] ss = new String[n];
        
        for (int i = 0; i < n; i++) {
            ss[i] = in.next();
            if (isFunny(ss[i]))
                System.out.println("Funny");
            else 
                System.out.println("Not Funny");
        }

    }
}
