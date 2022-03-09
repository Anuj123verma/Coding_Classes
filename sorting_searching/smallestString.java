package sorting_searching;

import java.util.*;

public class smallestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        int i = 0;
        while (n-- > 0) {
            arr[i++] = sc.next();
        }
        Arrays.sort(arr, new largestNumber());
        String ans = "";
        for (String p : arr) {
            ans += p;
        }
        System.out.println(ans);
    }
    // public String function(String[] arr){
    // String ans="";
    // Arrays.sort(arr, new largestNumber());

    // return ans;
    // }
    public static class largestNumber implements Comparator<String> {

        @Override
        public int compare(String o1, String o2) {
            // TODO Auto-generated method stub
            String a = o1 + o2;
            String b = o2 + o1;
            return a.compareTo(b); // x+y < y+x
        }

    }

}
