class Solution {
    private int dp[][][];

    public int removeBoxes(int[] boxes) {
        int n = boxes.length;
        dp = new int[n][n][n];
        return solve(boxes, 0, n - 1, 0);
    }

    private int solve(int[] boxes, int left, int right, int k) {
        if (left > right)
            return 0;
        while (right > left && boxes[right] == boxes[right - 1]) {
            right--;
            k++;
        }
        if (dp[left][right][k] != 0)
            return dp[left][right][k];
        int ans = solve(boxes, left, right - 1, 0) + (k + 1) * (k + 1);
        for (int i = left; i < right; i++) {
            if (boxes[i] == boxes[right]) {
                ans = Math.max(ans, solve(boxes, left, i, k + 1) + solve(boxes, i + 1, right - 1, 0));
            }
        }
        dp[left][right][k] = ans;
        return ans;
    }
}