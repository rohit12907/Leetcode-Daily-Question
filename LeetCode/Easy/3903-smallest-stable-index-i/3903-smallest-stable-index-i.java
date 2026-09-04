class Solution {
    public int firstStableIndex(int[] nums, int target) {
        int l  = nums.length;
        for(int i = 0 ; i <l ; i++){
            int largest = Integer.MIN_VALUE;
            for(int j = 0 ; j <=i ; j ++){
                largest = Math.max(nums[j],largest);
            }
            int smallest = Integer.MAX_VALUE;
               for(int  k = i ; k < l  ; k++){
                smallest = Math.min(nums[k],smallest);
            }
            if(largest - smallest <= target){
                return i ;
            }
        }
        return -1 ;
        
    }
}