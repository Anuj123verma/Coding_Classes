package sorting_searching;

import java.util.Scanner;

public class solution {
    public static int lowerBound(int[] arr, int s, int e, int target) {
        int low = s;
        int high = e;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static int higherBound(int[] arr, int s, int e, int target) {
        int low = s;
        int high = e;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = { 0, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 5, 5, 6, 6, 6, 6 };
        System.out.println(higherBound(arr, 0, arr.length - 1, 0) - lowerBound(arr, 0, arr.length - 1, 0) + 1);
    }

}
