package sorting_searching;

import java.util.*;

public class biasedStandingg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long n, badness;
        long sum = 0;
        String team_name;
        while (t-- > 0) {
            sum = 0;
            n = sc.nextLong();
            long ans = (n * (n + 1)) / 2;
            while (n-- > 0) {
                team_name = sc.next();
                sum += sc.nextLong();
            }
            badness = Math.abs(sum - ans);
            System.out.println(badness);
        }

    }
}