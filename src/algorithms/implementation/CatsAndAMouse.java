package algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
* https://www.hackerrank.com/challenges/cats-and-a-mouse
*/
public class CatsAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            
            int d1 = Math.abs(z - x);
            int d2 = Math.abs(z - y);            
            
            if (d1 < d2)
                System.out.println("Cat A");
            else if (d1 > d2)
                System.out.println("Cat B");
            else
                System.out.println("Mouse C");
        }
    }
}
