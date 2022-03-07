package sorting_searching;

import java.util.Arrays;

public class sumSubseqWidths {
    public int subseqWidths(int[] nums) {
        long sum = 0;
        int n = nums.length;
        long mod = (long) 1e9 + 7;
        long[] pow = new long[n];
        Arrays.sort(nums);
        pow[0] = 1;
        for (int i = 1; i < n; i++) {
            pow[i] = pow[i - 1] * 2 % mod;
        }
        for (int i = 0; i < n; i++) {
            sum = (sum + (pow[i] - pow[n - i - 1]) * nums[i]) % mod;
        }
        return (int) sum;
    }
}
