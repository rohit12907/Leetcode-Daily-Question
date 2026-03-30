class Solution {
    public int minBitFlips(int start, int goal) {
        int change = start ^ goal;
        int count = 0;

        for (int i = 0; i < 31; i++) {
            if ((change & (1 << i)) != 0) {  // FIX
                count++;
            }
        }
        return count;
    }
}