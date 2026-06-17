class Solution {
    public char processStr(String s, long k) {

        int n = s.length();
        long LIMIT = (long) 1e15;

        long[] len = new long[n + 1];

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                len[i + 1] = Math.min(LIMIT, len[i] + 1);
            }
            else if (ch == '*') {
                len[i + 1] = Math.max(0, len[i] - 1);
            }
            else if (ch == '#') {
                len[i + 1] = Math.min(LIMIT, len[i] * 2);
            }
            else { // '%'
                len[i + 1] = len[i];
            }
        }

        if (k >= len[n]) {
            return '.';
        }

        for (int i = n - 1; i >= 0; i--) {

            char ch = s.charAt(i);
            long currLen = len[i + 1];
            long prevLen = len[i];

            if (ch >= 'a' && ch <= 'z') {

                if (k == prevLen) {
                    return ch;
                }
            }
            else if (ch == '*') {

                // Forward: removed last character
                // Reverse: length increased by 1
                // If k is in current string, it stays same.
            }
            else if (ch == '#') {

                // Forward: length L -> 2L
                if (prevLen > 0) {
                    k %= prevLen;
                }
            }
            else { // '%'

                // Reverse the reverse
                if (currLen > 0) {
                    k = currLen - 1 - k;
                }
            }
        }

        return '.';
    }
}