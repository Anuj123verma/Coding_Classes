package sorting_searching;

import java.util.Scanner;

public class sparseSearch {

    public static int searchSparse(String[] arr, int s, int e, String target) {
        int low = s;
        int high = e;
        while (low <= high) {
            int mid = (low + high) / 2;
            int ml = mid - 1;
            int mr = mid + 1;
            // System.out.println(ml + " " + mr);
            while (true) {
                if (ml < low && mr > high) {
                    return -1;
                }
                if (ml >= low && arr[ml].compareTo("") != 0) {
                    mid = ml;
                    break;
                } else if (mr <= high && arr[mr].compareTo("") != 0) {
                    mid = mr;
                    break;
                }
                ml--;
                mr++;

            }
            if (arr[mid].equals(target)) {
                return mid;
            } else if (arr[mid].compareTo(target) < 0) {
                low = mid - 1;
            } else {
                high = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = { "for", "geeks", "", "", "", "", "ide", "practice", "", "", "", "quiz" };
        System.out.println(searchSparse(arr, 0, 11, "geeks"));

    }
}
