package sorting_searching;

import java.util.Scanner;

public class search {
    public static int binarySearch(int[] arr, int s, int e, int target) {
        int low = s;
        int high = e;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int target = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(binarySearch(arr, 0, n - 1, target));
        }
    }
}

/*
 * 3
 * return the index of element just greater than or equal to 3
 * 1 2 4 5
 * 2
 * 2
 * 1
 * l h l h
 */