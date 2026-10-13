class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(arr);
        long sum = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            sum += arr[r] - arr[l];
            r--;
            l++;
        }
        if (l == r && n % 2 != 0) {
            sum += arr[l];
        }
        return sum;
    }
}