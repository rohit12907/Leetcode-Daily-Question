class Solution {
    public void sortColors(int[] nums) {

        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        // Count
        for (int x : nums) {
            if (x == 0)
                count0++;
            else if (x == 1)
                count1++;
            else
                count2++;
        }

        // Put 0
        int index = 0;

        while (count0-- > 0) {
            nums[index++] = 0;
        }

        // Put 1
        while (count1-- > 0) {
            nums[index++] = 1;
        }

        // Put 2
        while (count2-- > 0) {
            nums[index++] = 2;
        }
    }
}