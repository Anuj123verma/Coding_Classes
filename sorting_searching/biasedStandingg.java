package sorting_searching;

import java.util.*;

public class biasedStandingg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n, badness;
        long preferred_position;
        String team_name;
        while (t-- > 0) {
            n = sc.nextInt();
            long[] arr = new long[n];
            for (int i = 0; i < n; i++) {
                team_name = sc.next();
                preferred_position = sc.nextInt();
                arr[i] = preferred_position;
            }
            Arrays.sort(arr);
            badness = 0;
            for (int i = 1; i <= n; i++) {
                badness += Math.abs(i - arr[i - 1]);
            }
            System.out.println(badness);
        }
    }
}