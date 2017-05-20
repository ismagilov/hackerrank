package algorithms.sorting;

/**
* https://www.hackerrank.com/challenges/ctci-bubble-sort
*/
import java.io.*;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = in.nextInt();
        
        int lastUnsorted = a.length - 1;
        int totalSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
    
            for (int j = 0; j < lastUnsorted; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    numberOfSwaps++;
                }
            }
            
            lastUnsorted--;
            totalSwaps += numberOfSwaps;
            
            if (numberOfSwaps == 0) {
                break;
            }
        }
        
        System.out.println("Array is sorted in " + totalSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length - 1]);
    }
    
    private static void swap(int[] a, int i, int j) {
        int tmp = a[j];
        a[j] = a[i];
        a[i] = tmp;
    }
}
