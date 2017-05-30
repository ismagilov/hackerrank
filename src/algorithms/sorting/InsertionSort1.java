package algorithms.sorting;

import java.util.Scanner;

/**
* https://www.hackerrank.com/challenges/insertionsort1
*/
public class InsertionSort1 {
    public static void insertIntoSorted(int[] ar) {
        int val = ar[ar.length - 1];
        
        int i = ar.length - 1;
        while (i > 0 && ar[i - 1] > val) {
            ar[i] = ar[i - 1];
            i--;
            printArray(ar);
        }
        
        ar[i] = val;
        printArray(ar);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }  
}
