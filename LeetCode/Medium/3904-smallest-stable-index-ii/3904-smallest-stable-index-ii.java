class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int l = nums.length;
        int [] p_max = new int [l];
        int [] s_min = new int [l];
        p_max[0]=nums[0];
        for(int i= 1 ; i <l ;i++){
            p_max[i]=Math.max(p_max[i-1],nums[i]);
        }
        s_min[l-1]=nums[l-1];
        for(int i= l-2 ; i >=0 ;i--){
            s_min[i]=Math.min(s_min[i+1],nums[i]);
        }
        if(p_max[0]-s_min[0]<=k){
            return 0 ;
        }
        for(int i= 0 ; i<l ;i++){
            if(p_max[i]-s_min[i]<=k){
                return i ;
            }
        }

        return -1;
    }
}