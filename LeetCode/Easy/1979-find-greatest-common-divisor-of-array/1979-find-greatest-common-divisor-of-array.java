class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small = nums[0];
        int biggest = nums[nums.length-1];

        return Gcd(small,biggest);

        
    }
    static int Gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; 
            a = temp;  
        }
        return Math.abs(a); 
    }
}