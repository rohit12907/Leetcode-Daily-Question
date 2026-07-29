class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int Expectedsum = (n*(n+1))/2;
        int Ar_sum = 0 ;
        for(int i = 0 ; n>i;i++){
            Ar_sum = Ar_sum + nums[i];
        }
     return Expectedsum - Ar_sum;
    }
}