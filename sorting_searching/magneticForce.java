package sorting_searching;

import java.util.Arrays;

public class magneticForce {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int n = position.length;
        int low = 0;
        int high = position[n - 1];
        int opt = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (function(position, mid) >= m) {
                opt = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return opt;
    }

    public int function(int[] position, int d) {
        int ans = 1;
        int cur = position[0];
        for (int i = 1; i < position.length; i++) {
            if (position[i] - cur >= d) {
                cur = position[i];
                ans++;
            }
        }
        return ans;
    }

}
