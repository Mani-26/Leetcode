class Solution {
    public int bestRotation(int[] nums) {
        int res = 0;
        int n = nums.length;
        int maxScore = Integer.MIN_VALUE;
        int left, right;
        int diff[] = new int[n];
        for (int i = 0; i < n; i++) {
            left = (i - nums[i] + 1 + n) % n;
            right = (i + 1) % n;

            diff[left]--;
            diff[right]++;

            if (left > right)
                diff[0]--;
        }
        int score = 0;
        for (int i = 0; i < n; i++) {
            score += diff[i];
            if (score > maxScore) {
                maxScore = score;
                res = i;
            }
        }
        return res;
    }
}