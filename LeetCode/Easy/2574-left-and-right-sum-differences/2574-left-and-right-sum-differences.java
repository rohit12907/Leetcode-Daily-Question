
class Solution{
   public int[] leftRightDifference(int[] nums){
     int sum = 0 ; 
      int l = nums.length;
      if(l==1){
        nums[0] = 0 ;
        return nums;
      }
      int [] left = new int [l];
      left[0] = 0 ;
      for(int i = 0 ;i<l-1 ; i++){
         sum = sum + nums[i];
         left[i+1]= sum ;
      }

int sum1 = 0 ;
int [] right = new int[l];
right[l-1] = 0 ;
for(int j = l-1 ;j>0;j-- ){
   sum1 = sum1 + nums[j];
   right[j-1] = sum1;
}

for(int i = 0 ;l>i ;i++){
   nums[i] = Math.abs(left[i]-right[i]);
}
return nums;
}

}