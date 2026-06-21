class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs); 
        
        for (int i = 0; i < costs.length; i++) {
            if (coins >= costs[i]) {
                coins -= costs[i]; // Deduct the cost
            } else {
                return i; // Can't afford this one, return how many we bought
            }
        }
        return costs.length; // Bought all the ice creams
    }
}