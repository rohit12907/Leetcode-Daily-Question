// class Solution {
//     boolean check(int[] nums) {
//         int n = nums.length;
//         for (int i = 0; i < n - 1; i++) {
//             if (nums[i] != nums[i + 1]) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public int minMoves(int[] nums) {
//         long n = nums.length;
//         int count = 0;
//         if (check(nums) == true) {
//             return 0;
//         } else {
//             while (check(nums) != true) {
//                 Arrays.sort(nums);
//                 for (int i = 0; n - 1 > i; i++) {
//                     nums[i] = nums[i] + 1;
//                 }
//                 count++;

//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int minMoves(int[] nums) {
        int min = Integer.MAX_VALUE;
        long sum = 0;

        for (int num : nums) {
            min = Math.min(min, num);
            sum += num;
        }

        return (int)(sum - (long) nums.length * min);
    }
}