import java.io.*;
import java.util.*;

/**
* https://www.hackerrank.com/challenges/palindrome-index
*/
public class PalindromeIndex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String s = in.next();
            isPalindrome(s);
        }
    }
    
    public static void isPalindrome(String s) {
        int b = 0, e = s.length() - 1;
        
        while (b <= e) {
            if (s.charAt(b) != s.charAt(e)) {
                if (b + 1 == e)
                    System.out.println(b);           
                else if (s.charAt(b) == s.charAt(e - 1) && s.charAt(b + 1) == s.charAt(e - 2))
                    System.out.println(e);
                else
                    System.out.println(b);
                    
                return;
            }
            
            b++;
            e--;
        }
        
        if (b > e)
            System.out.println(-1);
    }
}
