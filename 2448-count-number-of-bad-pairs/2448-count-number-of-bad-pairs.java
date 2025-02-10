class Solution {
    public long countBadPairs(int[] nums) {
        long bad = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int good = mp.getOrDefault(i-nums[i], 0);
            bad += i - good;
            mp.put(i-nums[i], good + 1);
        }
        return bad;
    }
}