import java.util.*;

class Solution {

    public int minimumPushes(String word) {

        HashMap<Character, Integer> freq = new HashMap<>();

        // Count frequency
        for (char ch : word.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Store frequencies in ArrayList
        ArrayList<Integer> list = new ArrayList<>(freq.values());

        // Sort in descending order
        Collections.sort(list, Collections.reverseOrder());

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {

            int multiplier;

            if (i < 8)
                multiplier = 1;
            else if (i < 16)
                multiplier = 2;
            else if (i < 24)
                multiplier = 3;
            else
                multiplier = 4;

            sum += list.get(i) * multiplier;
        }

        return sum;
    }
}