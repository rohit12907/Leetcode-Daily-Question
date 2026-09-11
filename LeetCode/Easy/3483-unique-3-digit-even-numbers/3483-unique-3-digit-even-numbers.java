import java.util.*;

class Solution {
    public int totalNumbers(int[] arr) {

        Set<Integer> set = new HashSet<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            // Hundreds digit cannot be 0
            if (arr[i] == 0) continue;

            for (int j = 0; j < n; j++) {

                for (int k = 0; k < n; k++) {

                    // Three different positions
                    if (i == j || i == k || j == k) {
                        continue;
                    }

                    // Units digit must be even
                    if (arr[k] % 2 != 0) {
                        continue;
                    }

                    int num = arr[i] * 100 + arr[j] * 10 + arr[k];

                    set.add(num);
                }
            }
        }

        return set.size();
    }
}