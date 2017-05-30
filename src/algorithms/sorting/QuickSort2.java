package algorithms.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/quicksort2
 */
public class QuickSort2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++)
            arr.add(in.nextInt());

        partition(arr);
    }

    public static List<Integer> partition(List<Integer> arr) {
        if (arr.isEmpty())
            return arr;

        int p = arr.get(0);

        List<Integer> leftPart = new ArrayList<>();
        List<Integer> rightPart = new ArrayList<>();
        List<Integer> eqPart = new ArrayList<>();
        for (Integer v : arr) {
            if (v < p)
                leftPart.add(v);
            else if (v > p)
                rightPart.add(v);
            else
                eqPart.add(v);
        }

        leftPart = partition(leftPart);
        rightPart = partition(rightPart);

        ArrayList<Integer> res = new ArrayList<>();

        res.addAll(leftPart);
        res.addAll(eqPart);
        res.addAll(rightPart);

        if (res.size() > 1) {
            for (Integer i : res)
                System.out.print(i + " ");
            System.out.println();
        }

        return res;
    }
}
