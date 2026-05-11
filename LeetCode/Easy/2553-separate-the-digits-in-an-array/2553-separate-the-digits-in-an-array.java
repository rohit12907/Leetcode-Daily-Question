 class Solution {
 public int[] separateDigits(int[] nums) {
    ArrayList <Integer> al = new ArrayList<>();
    // int []arr = new int[al.size()];
        for(int i = 0 ;i<nums.length;i++){
            String s = String.valueOf(nums[i]);
            for(char c : s.toCharArray()){
                 al.add(c - '0');
            }}
            //  int []arr = new int[al.size()];
            int []arrr = new int[al.size()];
            for(int j = 0 ; al.size()>j;j++){
                arrr[j] = al.get(j);
            }
            return arrr ;
        }
        
}