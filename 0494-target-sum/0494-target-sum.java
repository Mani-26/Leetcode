class Solution {
    int res = 0;
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        helper(nums, n, target, 0, 0);
        return res;
    }

    public void helper(int[] nums, int n, int target, int curr, int sum) {
        if (curr == n) {
            if (sum == target) {
                ++res;
            }
        } else {
            helper(nums, n, target, curr + 1, sum + nums[curr]);
            helper(nums, n, target, curr + 1, sum - nums[curr]);
        }
    }
}