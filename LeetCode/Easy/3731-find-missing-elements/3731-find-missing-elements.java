class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        ArrayList <Integer> al = new ArrayList<>();
        HashSet <Integer > hs = new HashSet<>();
        int s = nums[0];
        int e = nums[l-1];
          for(int i = 0 ; nums.length> i ;i++){
             hs.add(nums[i]);
        }
        for(int i = s ; e>=i;i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
    
    
     return al ;


    }
}