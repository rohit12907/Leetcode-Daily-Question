class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0 ;
        for(char c1:s.toCharArray()){
            result^= c1;
        }
        for(char c1:t.toCharArray()){
            result^=c1;
        }
        return result;
    }
}