class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int min = nums[0];
            int minIndex = 0;
            for (int j = 1; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }
            nums[minIndex] = min * multiplier;
        }
        return nums;
    }
}