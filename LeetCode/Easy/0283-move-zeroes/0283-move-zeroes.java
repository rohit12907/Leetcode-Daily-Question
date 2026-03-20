class Solution {
    
    
    public void moveZeroes(int[] nums) {
      int   j = -1 ;
        for(int i = 0 ; nums.length>i;i++){
            if(nums[i]==0){
                j = i ;
                break;
            }
            else{
                j++;
            }
        }
        for(int i = j+1 ; nums.length>i;i++){
            if(nums[i]!=0){
                int t = nums[j];
                nums[j]= nums[i];
                nums[i] = t ;
                // swap(nums[i],nums[j]);
                j++;
            }

        }
        
    }
}