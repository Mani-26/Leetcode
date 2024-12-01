class Solution {
    public int shortestSubarray(int[] nums, int k) {
        int n = nums.length;
        long[] sum = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
        Deque<Integer> deq = new ArrayDeque<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i <= n; i++) {
            while (!deq.isEmpty() && sum[i] - sum[deq.peekFirst()] >=k) {
                res = Math.min(res, i - deq.pollFirst());
            }
            while (!deq.isEmpty() &&sum[i] <= sum[deq.peekLast()]) {
                deq.pollLast();
            }
            deq.offerLast(i);
        }
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}