package algorithms.sorting;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort3
 */
public class QuickSort3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        qs(arr, 0, arr.length - 1);
    }

    public static void qs(int[] arr, int l, int r) {
        if (l >= r)
            return;

        int pIdx = partition(arr, l, r);

        qs(arr, l, pIdx - 1);
        qs(arr, pIdx + 1, r);

        return;
    }

    public static int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int pIdx = l;

        for (int i = l; i < r; i++) {
            if (arr[i] <= pivot) {
                swap(arr, pIdx, i);
                pIdx++;
            }
        }

        swap(arr, pIdx, r);

        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();

        return pIdx;
    }

    public static void swap(int[] arr, int l, int r) {
        int t = arr[l];
        arr[l] = arr[r];
        arr[r] = t;
    }
}