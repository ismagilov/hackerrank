import java.io.*;
import java.util.*;

/**
* https://www.hackerrank.com/challenges/the-love-letter-mystery
*/
public class TheLoveLetterMystery {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        ArrayList<String> ss = new ArrayList<>();
        for (int i = 0; i < n; i++)
            ss.add(in.next());
        
        for (String s : ss) {
            int b = 0;
            int e = s.length() - 1;
            
            int ops = 0;
            while (b <= e) {
                int ac = s.charAt(b);
                int bc = s.charAt(e);
                
                if (ac > bc)
                    ops += ac - bc;
                else if (bc > ac)
                    ops += bc - ac;
                    
                b++;
                e--;
            }
            
            System.out.println(ops);
        }
            
    }
}
