class Solution {
    public long maxTotalValue(int[] nums, int k) {
        Arrays.sort(nums);
        long res= (nums[nums.length-1]-nums[0])*(long)k;
        return res;
    }
}