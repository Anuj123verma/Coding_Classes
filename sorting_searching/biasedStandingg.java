package sorting_searching;

import java.util.*;

public class biasedStandingg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                String team_name = sc.next();
                int preferred_position = sc.nextInt();
                arr[i] = preferred_position;
            }
            Arrays.sort(arr);
            int badness = 0;
            for (int i = 0; i < n; i++) {
                badness += Math.abs(i + 1 - arr[i]);
            }
            System.out.println(badness);
        }
    }
}