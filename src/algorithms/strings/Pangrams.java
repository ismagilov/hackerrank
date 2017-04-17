package algorithms.strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* https://www.hackerrank.com/challenges/pangrams
*/
public class Pangrams {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int[] letters = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isLetter(c))
                letters[(byte)Character.toLowerCase(c) - (byte)'a']++;
        }
            
        for (int i = 0; i < letters.length; i++) {
            if (letters[i] == 0) {
                System.out.println("not pangram");            
                return;
            }
        }        
        
        System.out.println("pangram");
    }
}
