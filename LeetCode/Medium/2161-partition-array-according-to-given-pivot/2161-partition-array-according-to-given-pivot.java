class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int l = nums.length;
        int n = 0 ;
        int []ans = new int[l];
        
        ArrayList <Integer> al = new ArrayList<>();
        for(int i = 0; l>i ; i++){
            if(nums[i]==pivot){
                n++;
            }
    
        }
        for(int i = 0;l>i ; i++){
            if(nums[i]<pivot){
                al.add(nums[i]);
            }
    
        }
              for(int i = 0;n>i ; i++){
           
                al.add(pivot);
            }
    
        
        
         for(int i = 0;l>i ; i++){
        if(nums[i]>pivot){
                al.add(nums[i]);
            }
    
        }
        
for(int i = 0; i <al.size(); i++) {
    ans[i]=al.get(i);
}
    return ans ; 
    }
}