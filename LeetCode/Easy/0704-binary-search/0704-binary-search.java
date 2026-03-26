class Solution {
    public int search(int[] nums, int target) {
        int l = nums.length;
        int s = 0 ;
        int e = l -1 ;
     
        while (e>=s){
            int m = (s+e)/2;
            if(target==nums[m]){
                return m ;
            }
        
            else if (target>nums[m]){
                s = m+1 ;
            }
            else if(target<nums[m]){
                e = m-1;
            }

        }
        return -1 ;
    }
}