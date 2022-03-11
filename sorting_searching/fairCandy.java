package sorting_searching;

import java.util.HashSet;

public class fairCandy {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int Asum = 0, Bsum = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int x : aliceSizes) {
            Asum += x;
            set.add(x);
        }
        for (int x : bobSizes)
            Bsum += x;
        int offset = (Asum - Bsum) / 2;
        for (int x : bobSizes) {
            if (set.contains(x + offset)) {
                return new int[] { x + offset, x };
            }
        }
        return new int[] { -1, -1 };
    }

}
