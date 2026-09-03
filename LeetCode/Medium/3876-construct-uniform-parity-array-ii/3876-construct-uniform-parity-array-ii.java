import java.util.*;

class Solution {
    public boolean uniformArray(int[] nums1) {

        Arrays.sort(nums1);

        // First condition: all elements are even OR all elements are odd
        boolean allEven = true;
        boolean allOdd = true;

        for (int n : nums1) {
            if (n % 2 != 0) {
                allEven = false;
            }

            if (n % 2 == 0) {
                allOdd = false;
            }
        }

        if (allEven || allOdd) {
            return true;
        }

        // Second condition: first element is odd
        if (nums1[0] % 2 != 0) {
            return true;
        }

        return false;
    }
}