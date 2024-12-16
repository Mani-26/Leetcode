class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(a[1], b[1]);
            }
            return Integer.compare(a[0], b[0]);
        });
        int i = 0;
        for (int num : nums) {
            pq.add(new int[] { num, i });
            i++;
        }
        for (int times = 1; times <= k; times++) {
            int arr[] = pq.poll();
            nums[arr[1]] *= multiplier;
            arr[0] = nums[arr[1]];
            pq.add(arr);
        }
        return nums;
    }
}