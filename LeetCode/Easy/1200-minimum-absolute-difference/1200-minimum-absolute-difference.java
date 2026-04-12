class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int mini = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int curr = arr[i + 1] - arr[i];

            if (curr < mini) {
                list.clear();
                list.add(Arrays.asList(arr[i], arr[i + 1]));
                mini = curr;
            } 
            else if (curr == mini) {
                list.add(Arrays.asList(arr[i], arr[i + 1]));
            }
        }
        return list;
    }
}
