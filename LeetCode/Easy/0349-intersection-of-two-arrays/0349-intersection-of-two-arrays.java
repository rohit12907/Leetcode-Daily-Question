class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> hs = new HashSet<>();
        HashSet <Integer> hs1 = new HashSet<>();
        ArrayList <Integer > al = new ArrayList<>();
        for(int num : nums1){
            hs.add(num);
        }
        for(int num1 : nums2){
            hs1.add(num1);
        }
       for(int num3 : hs1){
        if(hs.contains(num3)){
            al.add(num3);
        }
       }
       
       
       
int[] ans = al.stream().mapToInt(Integer::intValue).toArray();

       return ans ;
    }
}