package sorting_searching;

public class sortedSearch {
    public int search(int[] nums, int target) {
        int n = nums.length - 1;
        int pivot = findPivot(nums, 0, n);
        if (pivot == -1) {
            return binarySearch(nums, 0, n, target);
        }
        int a = binarySearch(nums, 0, pivot, target);
        if (a != -1) {
            return a;
        }
        int b = binarySearch(nums, pivot + 1, n, target);
        if (b != -1) {
            return b;
        }
        return -1;
    }

    public int findPivot(int[] arr, int s, int e) {
        int low = s;
        int high = e;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (mid < high && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > low && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[low] >= arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public int binarySearch(int[] arr, int s, int e, int target) {
        int low = s;
        int high = e;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
