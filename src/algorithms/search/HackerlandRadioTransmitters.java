package algorithms.search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/hackerland-radio-transmitters
 */
public class HackerlandRadioTransmitters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int range = in.nextInt();
        int[] houses = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            houses[x_i] = in.nextInt();
        }

        if (houses.length == 1) {
            System.out.println(1);
            return;
        }

        Arrays.sort(houses);

        int cnt = 1;
        int start = houses[0];
        int end = start + 2 * range;
        int pos = start + range;
        for (int i = 1; i < houses.length; i++) {
            if (houses[i] == pos) {
                start = houses[i] - range;
                end = houses[i] + range;
            } else if (houses[i] > pos && houses[i - 1] < pos) {
                start = houses[i - 1] - range;
                end = houses[i - 1] + range;
                pos = houses[i - 1];
            }

            if (houses[i] > end) {
                cnt++;
                start = houses[i];
                end = start + 2 * range;
                pos = start + range;
            }
        }

        System.out.println(cnt);
    }
}
